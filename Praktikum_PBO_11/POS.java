package Praktikum_PBO_11;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.ListSelectionEvent;       
import javax.swing.event.ListSelectionListener; 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * File: PointOfSales.java
 * Kelas ini membuat tampilan GUI untuk aplikasi Point of Sales sederhana
 * using komponen-komponen Java Swing.
 * * Versi ini memiliki fungsionalitas penuh.
 */
public class POS implements ActionListener {
    private JFrame frame;
    private JMenuBar menuBar;
    private JMenu fileMenu, helpMenu;
    private JTable productTable, cartTable;
    private JTextArea strukArea;
    private JLabel lblSelectedProduct, lblTotal, lblPoints;
    private JTextField txtQty;
    private JButton btnAddToCart, btnCheckout, btnCetak;
    private DefaultTableModel cartModel;
    private NumberFormat currencyFormatter;

    /**
     * Konstruktor untuk membangun GUI
     */
    public POS() {
        currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("in", "ID"));

        frame = new JFrame("POIN Off-Sales - Java Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 525);
        frame.setMinimumSize(new Dimension(600, 400));
        frame.setLocationRelativeTo(null);

        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        helpMenu = new JMenu("Help");
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);
        frame.setJMenuBar(menuBar);

        JSplitPane splitPane = new JSplitPane(
                JSplitPane.HORIZONTAL_SPLIT,
                createLeftPanel(),
                createRightPanel());

        splitPane.setOneTouchExpandable(true);
        splitPane.setDividerLocation(325);
        splitPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        frame.add(splitPane);
        frame.setVisible(true);
    }

    /**
     * Membuat panel kiri (Produk)
     */
    private JPanel createLeftPanel() {
        JPanel leftPanel = new JPanel(new BorderLayout(0, 10));

        leftPanel.add(new JLabel("Produk"), BorderLayout.NORTH);

        String[] productCols = {"ID", "Nama Produk", "Harga (Rp)"};
        Object[][] productData = {
                {"P001", "Air Mineral 600ml", 3000},
                {"P002", "Kopi Sachet", 5000},
                {"P003", "Roti isi", 8000},
                {"P004", "Snack Keripik", 6000},
                {"P005", "Minuman Botol", 12000}
        };

        DefaultTableModel productModel = new DefaultTableModel(productData, productCols) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        productTable = new JTable(productModel);
        productTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        productTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    updateSelectedProduct();
                }
            }
        });

        leftPanel.add(new JScrollPane(productTable), BorderLayout.CENTER);

        JPanel actionLeftPanel = new JPanel();
        actionLeftPanel.setLayout(new BoxLayout(actionLeftPanel, BoxLayout.Y_AXIS));

        lblSelectedProduct = new JLabel("Pilih produk dari tabel di kiri");
        lblSelectedProduct.setAlignmentX(Component.LEFT_ALIGNMENT);
        lblSelectedProduct.setBorder(BorderFactory.createEmptyBorder(5, 5, 0, 5));

        JPanel qtyPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        qtyPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        qtyPanel.add(new JLabel("Qty:"));
        txtQty = new JTextField("1", 5);
        btnAddToCart = new JButton("Add to Cart");
        btnAddToCart.addActionListener(this);

        qtyPanel.add(txtQty);
        qtyPanel.add(btnAddToCart);

        actionLeftPanel.add(lblSelectedProduct);
        actionLeftPanel.add(qtyPanel);

        leftPanel.add(actionLeftPanel, BorderLayout.SOUTH);

        return leftPanel;
    }

    /**
     * Membuat panel kanan (Keranjang, Aksi, Struk)
     */
    private JPanel createRightPanel() {
        JPanel rightPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;

        // ----- Panel Atas (Keranjang) -----
        JPanel cartPanel = new JPanel(new BorderLayout(0, 5));
        cartPanel.add(new JLabel("Keranjang"), BorderLayout.NORTH);

        String[] cartCols = {"ID", "Nama Produk", "Qty", "Harga", "Subtotal"};
        
        cartModel = new DefaultTableModel(cartCols, 0) {
             @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        cartTable = new JTable(cartModel);

        JScrollPane cartScrollPane = new JScrollPane(cartTable);
        cartPanel.add(cartScrollPane, BorderLayout.CENTER);

        gbc.gridy = 0;
        gbc.weighty = 0.5;
        rightPanel.add(cartPanel, gbc);

        // ----- Panel Tengah (Aksi) -----
        JPanel actionPanel = new JPanel();
        actionPanel.setLayout(new BoxLayout(actionPanel, BoxLayout.Y_AXIS));
        actionPanel.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 5));

        lblTotal = new JLabel("Total: Rp0,00");
        lblTotal.setFont(lblTotal.getFont().deriveFont(16.0f));
        lblPoints = new JLabel("Points: 0");
        btnCheckout = new JButton("Checkout");
        btnCetak = new JButton("Cetak");

        btnCheckout.addActionListener(this);
        btnCetak.addActionListener(this);

        lblTotal.setAlignmentX(Component.LEFT_ALIGNMENT);
        lblPoints.setAlignmentX(Component.LEFT_ALIGNMENT);
        btnCheckout.setAlignmentX(Component.LEFT_ALIGNMENT);
        btnCetak.setAlignmentX(Component.LEFT_ALIGNMENT);

        actionPanel.add(lblTotal);
        actionPanel.add(Box.createVerticalStrut(5));
        actionPanel.add(lblPoints);
        actionPanel.add(Box.createVerticalStrut(10));
        actionPanel.add(btnCheckout);
        actionPanel.add(Box.createVerticalStrut(0));
        actionPanel.add(btnCetak);

        gbc.gridy = 1;
        gbc.weighty = 0.0;
        rightPanel.add(actionPanel, gbc);

        // ----- Panel Bawah (Struk) -----
        JPanel strukPanel = new JPanel(new BorderLayout(0, 5));
        strukPanel.add(new JLabel("Struk:"), BorderLayout.NORTH);

        strukArea = new JTextArea(10, 30);
        strukArea.setEditable(false);

        JScrollPane strukScrollPane = new JScrollPane(strukArea);
        strukPanel.add(strukScrollPane, BorderLayout.CENTER);

        gbc.gridy = 2;
        gbc.weighty = 0.5;
        rightPanel.add(strukPanel, gbc);

        return rightPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == btnAddToCart) {
            addItemToCart();
        } else if (source == btnCheckout) {
            performCheckout();
        } else if (source == btnCetak) {
            printStruk();
        }
    }

    private void updateSelectedProduct() {
        int selectedRow = productTable.getSelectedRow();
        if (selectedRow != -1) {
            String id = (String) productTable.getValueAt(selectedRow, 0);
            String nama = (String) productTable.getValueAt(selectedRow, 1);
            int harga = (int) productTable.getValueAt(selectedRow, 2);

            String formattedHarga = currencyFormatter.format(harga);
            lblSelectedProduct.setText("Dipilih: " + id + " - " + nama + " (" + formattedHarga + ")");
        } else {
            lblSelectedProduct.setText("Pilih produk dari tabel di kiri");
        }
    }

    private void addItemToCart() {
        int selectedRow = productTable.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(frame, "Pilih produk dari tabel kiri terlebih dahulu.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String id = (String) productTable.getValueAt(selectedRow, 0);
        String nama = (String) productTable.getValueAt(selectedRow, 1);
        int harga = (int) productTable.getValueAt(selectedRow, 2);
        
        int qty;
        try {
            qty = Integer.parseInt(txtQty.getText());
            if (qty <= 0) {
                JOptionPane.showMessageDialog(frame, "Kuantitas (Qty) harus lebih dari 0.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Kuantitas (Qty) harus berupa angka.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        long subtotal = (long) harga * qty;

        cartModel.addRow(new Object[]{id, nama, qty, harga, subtotal});

        updateTotalAndPoints();
    }

    private void updateTotalAndPoints() {
        long totalBelanja = 0;

        for (int i = 0; i < cartModel.getRowCount(); i++) {
            long subtotal = (long) cartModel.getValueAt(i, 4);
            totalBelanja += subtotal;
        }

        long points = totalBelanja / 1000;

        lblTotal.setText("Total: " + currencyFormatter.format(totalBelanja));
        lblPoints.setText("Points: " + points);
    }

    private void performCheckout() {
        if (cartModel.getRowCount() == 0) {
            JOptionPane.showMessageDialog(frame, "Keranjang masih kosong.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        StringBuilder struk = new StringBuilder();
        struk.append("======== POIN OFF-SALES ========\n");
        struk.append("Toko: Demo Toko\n\n");
        struk.append(String.format("%-5s %-18s %-3s %10s\n", "ID", "Nama", "Qty", "Subtotal"));
        struk.append("------------------------------------------------------\n");

        for (int i = 0; i < cartModel.getRowCount(); i++) {
            String id = (String) cartModel.getValueAt(i, 0);
            String nama = (String) cartModel.getValueAt(i, 1);
            int qty = (int) cartModel.getValueAt(i, 2);
            long subtotal = (long) cartModel.getValueAt(i, 4);
            
            struk.append(String.format("%-5s %-18s %-3d %10s\n", 
                            id, 
                            nama, 
                            qty, 
                            currencyFormatter.format(subtotal)));
        }

        struk.append("\n------------------------------------------------------\n");
        struk.append(String.format("%-28s %10s\n", "TOTAL:", lblTotal.getText().replace("Total: ", "")));
        struk.append(String.format("%-28s %10s\n", "POINTS DIDAPAT:", lblPoints.getText().replace("Points: ", "")));
        struk.append("\n" + lblPoints.getText() + " (1 point per Rp 1000)\n\n");
        struk.append("Terima kasih! Silakan kunjungi kembali.\n");

        strukArea.setText(struk.toString());

        cartModel.setRowCount(0);
        updateTotalAndPoints();
    }

    private void printStruk() {
        if (strukArea.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Lakukan Checkout terlebih dahulu untuk mencetak struk.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            boolean complete = strukArea.print();
            if (complete) {
                JOptionPane.showMessageDialog(frame, "Struk berhasil dikirim ke printer.", "Print Sukses", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(frame, "Proses print dibatalkan.", "Print Dibatalkan", JOptionPane.WARNING_MESSAGE);
            }
        } catch (PrinterException e) {
            JOptionPane.showMessageDialog(frame, "Gagal mencetak: " + e.getMessage(), "Print Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    /**
     * Main method untuk menjalankan aplikasi
     */
    public static void main(String[] args) {
        // Menjalankan GUI di Event Dispatch Thread (EDT) untuk keamanan thread
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new POS();
            }
        });
    }
}