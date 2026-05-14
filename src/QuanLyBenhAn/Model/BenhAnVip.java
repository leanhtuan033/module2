package QuanLyBenhAn.Model;

public class BenhAnVip extends BenhAn {
    private String loaiVip;
    private String thoiHanVip;

    public BenhAnVip() {
    }

    public BenhAnVip(int soThuTu,
                     String maBenhAn,
                     String maBenhNhan,
                     String tenBenhNhan,
                     String ngayNhapVien,
                     String ngayRaVien,
                     String lyDoNhapVien,
                     String loaiVip,
                     String thoiHanVip) {

        super(soThuTu, maBenhAn, maBenhNhan,
                tenBenhNhan, ngayNhapVien,
                ngayRaVien, lyDoNhapVien);

        this.loaiVip = loaiVip;
        this.thoiHanVip = this.thoiHanVip;
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
                loaiVip + "," +
                thoiHanVip;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Loai Vip: " + loaiVip +
                ", Thoi han Vip: " + thoiHanVip;
    }

}
