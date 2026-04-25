package BaiTap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuanLySach {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> dsSach = new HashMap<>();

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Them sach");
            System.out.println("2. Xuat danh sach");
            System.out.println("3. Sua sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Tim kiem sach");
            System.out.println("0. Thoat");

            System.out.print("Chon: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.print("Nhap ma sach: ");
                    int ma = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nhap ten sach: ");
                    String ten = sc.nextLine();

                    dsSach.put(ma, ten);
                    break;

                case 2:
                    System.out.println("Danh sach sach:");

                    for (Map.Entry<Integer, String> entry : dsSach.entrySet()) {
                        System.out.println("Ma: " + entry.getKey() +
                                           " | Ten: " + entry.getValue());
                    }
                    break;

                case 3:
                    System.out.print("Nhap ma sach can sua: ");
                    int maSua = sc.nextInt();
                    sc.nextLine();

                    if (dsSach.containsKey(maSua)) {
                        System.out.print("Nhap ten sach moi: ");
                        String tenMoi = sc.nextLine();

                        dsSach.put(maSua, tenMoi);
                    } else {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;

                case 4:
                    System.out.print("Nhap ma sach can xoa: ");
                    int maXoa = sc.nextInt();

                    if (dsSach.containsKey(maXoa)) {
                        dsSach.remove(maXoa);
                        System.out.println("Da xoa!");
                    } else {
                        System.out.println("Khong tim thay!");
                    }
                    break;

                case 5:
                    System.out.print("Nhap ma sach can tim: ");
                    int maTim = sc.nextInt();

                    if (dsSach.containsKey(maTim)) {
                        System.out.println("Ten sach: " + dsSach.get(maTim));
                    } else {
                        System.out.println("Khong tim thay!");
                    }
                    break;
            }

        } while (choice != 0);

        sc.close();
    }
}