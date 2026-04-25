package BaiTap;

import java.util.*;

public class bai4 {
    
    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số phần tử: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Nhập mảng
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        // Xử lý
        List<Integer> le = new ArrayList<>();
        List<Integer> chan = new ArrayList<>();
        List<Integer> prime = new ArrayList<>();
        List<Integer> notPrime = new ArrayList<>();

        for (int x : arr) {
            // số lẻ / chẵn
            if (x % 2 == 0) chan.add(x);
            else le.add(x);

            // nguyên tố
            if (isPrime(x)) prime.add(x);
            else notPrime.add(x);
        }

        // Xuất kết quả
        System.out.println("Số lẻ: " + le + " -> " + le.size());
        System.out.println("Số chẵn: " + chan + " -> " + chan.size());
        System.out.println("Số nguyên tố: " + prime);
        System.out.println("Không phải nguyên tố: " + notPrime);
    }
}