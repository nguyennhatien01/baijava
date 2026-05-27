package Test;

import Data.JdbcGiaoVien;
import Domain.GiaoVien;

public class JdbcHandlingTest {

    public static void main(String[] args) {
        System.out.println(">>> CHUONG TRINH DANG BAT DAU CHAY...");

        JdbcGiaoVien action = new JdbcGiaoVien();

        // 1. Thử thêm một giáo viên mới (Đảm bảo mã GV07 này chưa tồn tại trong DB)
        System.out.println("--- THU THEM GIAO VIEN MOI ---");
        GiaoVien gvMoi = new GiaoVien();
        gvMoi.setMaGV("GV012");
        gvMoi.setHoTen("Tran Van E");
        gvMoi.setGioiTinh("Nam");
        gvMoi.setMaKhoa("CNTT"); // Khoa CNTT phải tồn tại sẵn trong bảng KHOA trước

        action.themGV(gvMoi); // Gọi đúng tên hàm đã viết

        // 2. Liệt kê danh sách giáo viên nam khoa CNTT
        System.out.println("\n--- DANH SACH GV NAM KHOA CNTT ---");
        action.lietKeNamCNTT(); // Gọi đúng tên hàm đã viết

        System.out.println("\n>>> CHUONG TRINH DA KET THUC.");
    }
}
