package QuanLyBenhAn.Model;

public abstract class BenhAn {
    protected int soThuTu;
    protected String maBenhAn;
    protected String maBenhNhan;
    protected String tenBenhNhan;
    protected String ngayNhapVien;
    protected String ngayRaVien;
    protected String lyDoNhapVien;

    public BenhAn() {
    }

    public BenhAn(int soThuTu,
                  String maBenhAn,
                  String maBenhNhan,
                  String tenBenhNhan,
                  String ngayNhapVien,
                  String ngayRaVien,
                  String lyDoNhapVien) {

        this.soThuTu = soThuTu;
        this.maBenhAn = maBenhAn;
        this.maBenhNhan = maBenhNhan;
        this.tenBenhNhan = tenBenhNhan;
        this.ngayNhapVien = ngayNhapVien;
        this.ngayRaVien = ngayRaVien;
        this.lyDoNhapVien = lyDoNhapVien;
    }

    public int getSoThuTu() {
        return soThuTu;
    }

    public String getMaBenhAn() {
        return maBenhAn;
    }

    public String getMaBenhNhan() {
        return maBenhNhan;
    }

    public String getTenBenhNhan() {
        return tenBenhNhan;
    }

    public String getNgayNhapVien() {
        return ngayNhapVien;
    }

    public String getNgayRaVien() {
        return ngayRaVien;
    }

    public String getLyDoNhapVien() {
        return lyDoNhapVien;
    }

    public abstract String getInfo();


    @Override
    public String toString() {
        return "STT: " + soThuTu +
                ", Ma benh an: " + maBenhAn +
                ", Ma benh nhan: " + maBenhNhan +
                ", Ten benh nhan: " + tenBenhNhan +
                ", Ngay nhap vien: " + ngayNhapVien +
                ", Ngay ra vien: " + ngayRaVien +
                ", Ly do: " + lyDoNhapVien;
    }
}

