package Data;

import Domain.Khoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcKhoa {

    // Thêm khoa
    public void themKhoa(Khoa k) {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = JavaConnection.getConnection();

            // SỬA: Chỉ định rõ tên 2 cột cần chèn (bỏ qua cột NGTLAP để mặc định hoặc null)
            String sql = "INSERT INTO KHOA (MAKHOA, TENKHOA) VALUES (?, ?)";

            ps = conn.prepareStatement(sql);

            ps.setString(1, k.getMaKhoa());
            ps.setString(2, k.getTenKhoa());

            ps.executeUpdate();
            System.out.println("Them khoa thanh cong");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Giải phóng tài nguyên
            JavaConnection.close(ps);
            JavaConnection.close(conn);
        }
    }

    // Sửa khoa
    public void suaKhoa(Khoa k) {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = JavaConnection.getConnection();

            String sql = "UPDATE KHOA SET TENKHOA=? WHERE MAKHOA=?";

            ps = conn.prepareStatement(sql);

            ps.setString(1, k.getTenKhoa());
            ps.setString(2, k.getMaKhoa());

            ps.executeUpdate();
            System.out.println("Sua thanh cong");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JavaConnection.close(ps);
            JavaConnection.close(conn);
        }
    }

    // Xóa khoa
    public void xoaKhoa(String maKhoa) {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = JavaConnection.getConnection();

            String sql = "DELETE FROM KHOA WHERE MAKHOA=?";

            ps = conn.prepareStatement(sql);

            ps.setString(1, maKhoa);

            ps.executeUpdate();
            System.out.println("Xoa thanh cong");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JavaConnection.close(ps);
            JavaConnection.close(conn);
        }
    }
}
