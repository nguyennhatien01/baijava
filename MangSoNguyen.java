package BaiTap;

import java.util.Scanner;
import java.util.Arrays;

public class MangSoNguyen {

    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Nhập N
        System.out.print("Nhap so phan tu N: ");
        int N = sc.nextInt();

        int[] arr = new int[N];

        // Nhập mảng
        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < N; i++) {
            System.out.print("a[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        // Xuất mảng
        System.out.println("\nMang vua nhap:");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }

        // Tính tổng
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }
        System.out.println("\nTong cua mang: " + sum);

        // Nhập K
        System.out.print("\nNhap so K: ");
        int k = sc.nextInt();

        int count = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] == k) {
                count++;
            }
        }

        System.out.println("So lan xuat hien cua " + k + " la: " + count);

        // Tìm số lớn nhất
        int max = arr[0];
        for (int i = 1; i < N; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Phan tu lon nhat: " + max);

        // Tìm số nhỏ nhất
        int min = arr[0];
        for (int i = 1; i < N; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Phan tu nho nhat: " + min);

        // Xuất số nguyên tố
        System.out.print("Cac so nguyen to trong mang: ");
        for (int i = 0; i < N; i++) {
            if (isPrime(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }

        // Sắp xếp tăng dần
        Arrays.sort(arr);
        System.out.println("\nMang sau khi sap xep tang dan:");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }

        // Sắp xếp giảm dần
        System.out.println("\nMang sau khi sap xep giam dan:");
        for (int i = N - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}