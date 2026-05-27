package Domain;

public class GiaoVien {

    private String maGV;
    private String hoTen;
    private String gioiTinh;
    private String maKhoa;

    public GiaoVien() {
    }

    public GiaoVien(String maGV, String hoTen,
            String gioiTinh, String maKhoa) {

        this.maGV = maGV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.maKhoa = maKhoa;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getMaKhoa() {
        return maKhoa;
    }

    public void setMaKhoa(String maKhoa) {
        this.maKhoa = maKhoa;
    }
}