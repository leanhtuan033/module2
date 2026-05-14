package QuanLyBenhAn.Utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Validate {
    public static boolean checkMaBenhAn(String code) {
        return code.matches("^BA-\\d{3}$");
    }

    public static boolean checkMaBenhNhan(String code) {
        return code.matches("^BN-\\d{3}$");
    }

    public static boolean checkDate(String date) {

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            LocalDate.parse(date, formatter);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean checkVIP(String vip) {

        return vip.equals("VIP I")
                || vip.equals("VIP II")
                || vip.equals("VIP III");
    }
}
