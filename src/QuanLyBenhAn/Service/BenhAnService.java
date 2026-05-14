package QuanLyBenhAn.Service;


import QuanLyBenhAn.Exception.DuplicateMedicalRecordException;
import QuanLyBenhAn.Model.BenhAn;
import QuanLyBenhAn.Model.BenhAnThuong;
import QuanLyBenhAn.Model.BenhAnVip;
import QuanLyBenhAn.Utils.Constant;
import QuanLyBenhAn.Utils.ReadAndWriteFile;
import QuanLyBenhAn.Utils.Validate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BenhAnService implements IBenhAnService {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {

        List<BenhAn> benhAnList = readDataFromFile();

        if (benhAnList.isEmpty()) {
            System.out.println("Danh sach rong");
            return;
        }

        for (BenhAn benhAn : benhAnList) {
            System.out.println(benhAn);
        }
    }

    @Override
    public void add() {

        List<BenhAn> benhAnList = readDataFromFile();

        int stt = benhAnList.size() + 1;

        System.out.println("1. Benh an thuong");
        System.out.println("2. Benh an VIP");

        int choice = Integer.parseInt(scanner.nextLine());

        try {

            String maBenhAn;

            while (true) {

                System.out.print("Nhap ma benh an: ");
                maBenhAn = scanner.nextLine();

                if (!Validate.checkMaBenhAn(maBenhAn)) {
                    System.out.println("Sai dinh dang BA-XXX");
                    continue;
                }

                checkDuplicate(maBenhAn, benhAnList);

                break;
            }

            String maBenhNhan;

            while (true) {

                System.out.print("Nhap ma benh nhan: ");
                maBenhNhan = scanner.nextLine();

                if (Validate.checkMaBenhNhan(maBenhNhan)) {
                    break;
                }

                System.out.println("Sai dinh dang BN-XXX");
            }

            System.out.print("Nhap ten benh nhan: ");
            String ten = scanner.nextLine();

            String ngayNhap;

            while (true) {

                System.out.print("Nhap ngay nhap vien: ");
                ngayNhap = scanner.nextLine();

                if (Validate.checkDate(ngayNhap)) {
                    break;
                }

                System.out.println("Sai dinh dang dd/MM/yyyy");
            }

            String ngayRa;

            while (true) {

                System.out.print("Nhap ngay ra vien: ");
                ngayRa = scanner.nextLine();

                if (!Validate.checkDate(ngayRa)) {
                    System.out.println("Sai dinh dang");
                    continue;
                }

                DateTimeFormatter formatter =
                        DateTimeFormatter.ofPattern("dd/MM/yyyy");

                LocalDate ngayNhapDate =
                        LocalDate.parse(ngayNhap, formatter);

                LocalDate ngayRaDate =
                        LocalDate.parse(ngayRa, formatter);

                if (ngayNhapDate.isAfter(ngayRaDate)) {
                    System.out.println("Ngay nhap phai <= ngay ra");
                } else {
                    break;
                }
            }

            System.out.print("Nhap ly do: ");
            String lyDo = scanner.nextLine();

            List<String> stringList = new ArrayList<>();

            if (choice == 1) {

                System.out.print("Nhap phi nam vien: ");
                double phi = Double.parseDouble(scanner.nextLine());

                BenhAnThuong benhAnThuong =
                        new BenhAnThuong(
                                stt,
                                maBenhAn,
                                maBenhNhan,
                                ten,
                                ngayNhap,
                                ngayRa,
                                lyDo,
                                phi
                        );

                stringList.add(benhAnThuong.getInfo());

            } else {

                String vip;

                while (true) {

                    System.out.print("Nhap loai VIP: ");
                    vip = scanner.nextLine();

                    if (Validate.checkVIP(vip)) {
                        break;
                    }

                    System.out.println("Chi duoc VIP I, VIP II, VIP III");
                }

                String thoiHan;

                while (true) {

                    System.out.print("Nhap thoi han VIP: ");
                    thoiHan = scanner.nextLine();

                    if (Validate.checkDate(thoiHan)) {
                        break;
                    }

                    System.out.println("Sai dinh dang dd/MM/yyyy");
                }

                BenhAnVip benhAnVip =
                        new BenhAnVip(
                                stt,
                                maBenhAn,
                                maBenhNhan,
                                ten,
                                ngayNhap,
                                ngayRa,
                                lyDo,
                                vip,
                                thoiHan
                        );

                stringList.add(benhAnVip.getInfo());
            }

            ReadAndWriteFile.writeFile(
                    Constant.PATH,
                    stringList,
                    true
            );

            System.out.println("Them moi thanh cong");

        } catch (DuplicateMedicalRecordException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void delete() {

        List<BenhAn> benhAnList = readDataFromFile();

        System.out.print("Nhap ma benh an can xoa: ");
        String ma = scanner.nextLine();

        BenhAn benhAnDelete = null;

        for (BenhAn benhAn : benhAnList) {

            if (benhAn.getMaBenhAn().equals(ma)) {
                benhAnDelete = benhAn;
                break;
            }
        }

        if (benhAnDelete == null) {
            System.out.println("Khong tim thay");
            return;
        }

        System.out.println("Ban co muon xoa?");
        System.out.println("1. Co");
        System.out.println("2. Khong");

        int choose = Integer.parseInt(scanner.nextLine());

        if (choose == 1) {

            benhAnList.remove(benhAnDelete);

            List<String> stringList = new ArrayList<>();

            for (BenhAn benhAn : benhAnList) {
                stringList.add(benhAn.getInfo());
            }

            ReadAndWriteFile.writeFile(
                    Constant.PATH,
                    stringList,
                    false
            );

            System.out.println("Xoa thanh cong");

            display();

        } else {
            System.out.println("Da huy");
        }
    }

    private List<BenhAn> readDataFromFile() {

        List<String> stringList =
                ReadAndWriteFile.readFile(Constant.PATH);

        List<BenhAn> benhAnList = new ArrayList<>();

        for (String line : stringList) {

            String[] arr = line.split(",");

            // Benh an thuong
            if (arr.length == 8) {

                BenhAnThuong benhAnThuong =
                        new BenhAnThuong(
                                Integer.parseInt(arr[0]),
                                arr[1],
                                arr[2],
                                arr[3],
                                arr[4],
                                arr[5],
                                arr[6],
                                Double.parseDouble(arr[7])
                        );

                benhAnList.add(benhAnThuong);

            } else {

                // Benh an VIP
                BenhAnVip benhAnVip =
                        new BenhAnVip(
                                Integer.parseInt(arr[0]),
                                arr[1],
                                arr[2],
                                arr[3],
                                arr[4],
                                arr[5],
                                arr[6],
                                arr[7],
                                arr[8]
                        );

                benhAnList.add(benhAnVip);
            }
        }

        return benhAnList;
    }

    private void checkDuplicate(String maBenhAn,
                                List<BenhAn> benhAnList)
            throws DuplicateMedicalRecordException {

        for (BenhAn benhAn : benhAnList) {

            if (benhAn.getMaBenhAn().equals(maBenhAn)) {

                throw new DuplicateMedicalRecordException(
                        "Benh an da ton tai"
                );
            }
        }
    }

}
