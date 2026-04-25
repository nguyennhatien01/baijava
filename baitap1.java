package BaiTap;

import java.util.*;

public class baitap1 {
    static ArrayList<String> ds = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void menu() {
        System.out.println("\n===== MENU =====");
        System.out.println("1. Thêm SV");
        System.out.println("2. Xuất DS");
        System.out.println("3. Sửa SV");
        System.out.println("4. Xóa SV");
        System.out.println("5. Tìm SV chứa 'An'");
        System.out.println("6. Sắp xếp");
        System.out.println("7. Đếm số SV");
        System.out.println("0. Thoát");
    }

    public static void main(String[] args) {
        int choice;

        do {
            menu();
            System.out.print("Chọn: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: // Thêm
                    System.out.print("Nhập tên SV: ");
                    String name = sc.nextLine();
                    ds.add(name);
                    break;

                case 2: // Xuất
                    System.out.println("Danh sách:");
                    for (String sv : ds) {
                        System.out.println(sv);
                    }
                    break;

                case 3: // Sửa
                    System.out.print("Nhập vị trí cần sửa: ");
                    int idx = sc.nextInt();
                    sc.nextLine();
                    if (idx >= 0 && idx < ds.size()) {
                        System.out.print("Tên mới: ");
                        ds.set(idx, sc.nextLine());
                    } else {
                        System.out.println("Không hợp lệ!");
                    }
                    break;

                case 4: // Xóa
                    System.out.print("Nhập tên cần xóa: ");
                    String del = sc.nextLine();
                    ds.removeIf(sv -> sv.contains(del));
                    break;

                case 5: // Tìm "An"
                    System.out.println("SV chứa 'An':");
                    for (String sv : ds) {
                        if (sv.contains("An")) {
                            System.out.println(sv);
                        }
                    }
                    break;

                case 6: // Sắp xếp
                    Collections.sort(ds);
                    System.out.println("Đã sắp xếp!");
                    break;

                case 7: // Đếm
                    System.out.println("Số SV: " + ds.size());
                    break;
            }

        } while (choice != 0);
    }
}