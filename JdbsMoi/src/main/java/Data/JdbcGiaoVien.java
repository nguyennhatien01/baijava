package Data;

import Domain.GiaoVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcGiaoVien {

    // Thêm giáo viên
    public void themGV(GiaoVien gv) {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            // Mở kết nối bên trong hàm
            conn = JavaConnection.getConnection();

            // SỬA: Chỉ định rõ 4 cột cần chèn dữ liệu vào bảng GIAOVIEN
            String sql = "INSERT INTO GIAOVIEN (MAGV, HOTEN, GIOITINH, MAKHOA) VALUES (?, ?, ?, ?)";

            ps = conn.prepareStatement(sql);

            ps.setString(1, gv.getMaGV());
            ps.setString(2, gv.getHoTen());
            ps.setString(3, gv.getGioiTinh());
            ps.setString(4, gv.getMaKhoa());

            ps.executeUpdate();
            System.out.println("Them giao vien thanh cong");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Đóng tài nguyên sau khi dùng xong
            JavaConnection.close(ps);
            JavaConnection.close(conn);
        }
    }

    // Liệt kê giáo viên nam khoa CNTT
    public void lietKeNamCNTT() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // Mở kết nối bên trong hàm
            conn = JavaConnection.getConnection();

         // Sửa k.TENKHOA = 'CNTT' thành gv.MAKHOA = 'CNTT'
         // Sửa lại câu lệnh SQL thành dòng dưới đây
            String sql = "SELECT * FROM GIAOVIEN WHERE GIOITINH = 'Nam' AND MAKHOA = 'CNTT'";


            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                // Lấy đúng tên cột HOTEN từ database để in ra
                System.out.println(rs.getString("HOTEN"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Đóng tất cả tài nguyên theo thứ tự ngược lại
            JavaConnection.close(rs);
            JavaConnection.close(ps);
            JavaConnection.close(conn);
        }
    }
}
