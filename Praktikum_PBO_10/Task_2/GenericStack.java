package Praktikum_PBO_10.Task_2;

import java.util.ArrayList;

// 1. Ubah kelas menjadi generik dengan <T>
public class GenericStack<T> {

    // 2. Ganti int[] items dengan ArrayList<T>
    private ArrayList<T> items;
    
    // 3. maxsize masih diperlukan untuk logika "Overflow"
    private int maxsize;
    
    // 4. 'top' tidak lagi diperlukan; ArrayList.size() menggantikannya

    // 5. Sesuaikan constructor
    public GenericStack(int maxsize) {
        if (maxsize <= 0)
            throw new ArrayStackException("Stack size must be positive"); 
        
        this.maxsize = maxsize;
        this.items = new ArrayList<T>(); 
    }

    // 6. Ubah push(int item) menjadi push(T item)
    public void push(T item) {
        // 7. Cek overflow menggunakan size()
        if (items.size() == maxsize) 
            throw new ArrayStackException("Overflow Error"); 
        
        // 8. Gunakan ArrayList.add()
        items.add(item);
    }

    // 9. Ubah return type pop() dari int menjadi T
    public T pop() {
        if (isEmpty()) 
            throw new ArrayStackException("Underflow Error"); 
        
        // 10. Ambil dan hapus elemen terakhir (logika LIFO)
        return items.remove(items.size() - 1);
    }

    // 11. Ubah isEmpty() untuk menggunakan ArrayList.isEmpty()
    public boolean isEmpty() {
        return items.isEmpty(); // atau items.size() == 0 
    }

    // Exception class (sama seperti aslinya) 
    public static class ArrayStackException extends RuntimeException {
        public ArrayStackException(String message) { 
            super(message); 
        }
    } 

    // main method untuk pengujian
    public static void main(String[] args) {
        // 12. Uji dengan Stack<Integer>
        System.out.println("--- GenericStack<Integer> Test ---");
        GenericStack<Integer> stackInt = new GenericStack<>(3); 
        
        stackInt.push(1); 
        stackInt.push(2); 
        stackInt.push(3); 
        
        // stackInt.push(4); // Ini akan throw Overflow Error 
        
        System.out.println(stackInt.pop()); 
        System.out.println(stackInt.pop()); 
        System.out.println(stackInt.pop()); 
        // System.out.println(stackInt.pop()); // Ini akan throw Underflow Error
        
        // 13. Uji dengan Stack<String>
        System.out.println("\n--- GenericStack<String> Test ---");
        GenericStack<String> stackString = new GenericStack<>(2);
        stackString.push("Hello");
        stackString.push("World");
        
        System.out.println(stackString.pop());
        System.out.println(stackString.pop());
    }
}