package BaiTap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuanLyArrayList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhap danh sach");
            System.out.println("2. Them phan tu");
            System.out.println("3. Sua phan tu");
            System.out.println("4. Xoa phan tu");
            System.out.println("5. Tim kiem");
            System.out.println("6. Sap xep");
            System.out.println("7. Xuat danh sach");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Nhap so phan tu: ");
                    int n = sc.nextInt();

                    for (int i = 0; i < n; i++) {
                        System.out.print("Nhap so: ");
                        list.add(sc.nextInt());
                    }
                    break;

                case 2:
                    System.out.print("Nhap so can them: ");
                    int them = sc.nextInt();
                    list.add(them);
                    break;

                case 3:
                    System.out.print("Nhap vi tri can sua: ");
                    int vitri = sc.nextInt();

                    if (vitri >= 0 && vitri < list.size()) {
                        System.out.print("Nhap gia tri moi: ");
                        int giatri = sc.nextInt();
                        list.set(vitri, giatri);
                    } else {
                        System.out.println("Vi tri khong hop le!");
                    }
                    break;

                case 4:
                    System.out.print("Nhap vi tri can xoa: ");
                    int xoa = sc.nextInt();

                    if (xoa >= 0 && xoa < list.size()) {
                        list.remove(xoa);
                    } else {
                        System.out.println("Vi tri khong hop le!");
                    }
                    break;

                case 5:
                    System.out.print("Nhap so can tim: ");
                    int tim = sc.nextInt();

                    if (list.contains(tim)) {
                        System.out.println("Tim thay tai vi tri: " + list.indexOf(tim));
                    } else {
                        System.out.println("Khong tim thay!");
                    }
                    break;

                case 6:
                    Collections.sort(list);
                    System.out.println("Da sap xep tang dan!");
                    break;

                case 7:
                    System.out.println("Danh sach: " + list);
                    break;

            }

        } while (choice != 0);

        sc.close();
    }
}