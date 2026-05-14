package QuanLyBenhAn.Model;

public class BenhAnThuong extends BenhAn {
    private double phiNamVien;

    public BenhAnThuong() {
    }

    public BenhAnThuong(int soThuTu,
                        String maBenhAn,
                        String maBenhNhan,
                        String tenBenhNhan,
                        String ngayNhapVien,
                        String ngayRaVien,
                        String lyDoNhapVien,
                        double phiNamVien) {

        super(soThuTu, maBenhAn, maBenhNhan,
                tenBenhNhan, ngayNhapVien,
                ngayRaVien, lyDoNhapVien);

        this.phiNamVien = phiNamVien;
    }

    @Override
    public String getInfo() {

        return soThuTu + "," +
                maBenhAn + "," +
                maBenhNhan + "," +
                tenBenhNhan + "," +
                ngayNhapVien + "," +
                ngayRaVien + "," +
                lyDoNhapVien + "," +
                phiNamVien;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Phi nam vien: " + phiNamVien;
    }
}
