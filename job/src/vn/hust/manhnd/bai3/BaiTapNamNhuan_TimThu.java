package vn.hust.manhnd.bai3;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Nguyễn Đình Dương
 */
public class BaiTapNamNhuan_TimThu {

    public static void main(String[] args) {
        int ngay, thang, nam;
        System.out.print("Ngay: ");
        ngay = new Scanner(System.in).nextInt();
        System.out.print("Thang: ");
        thang = new Scanner(System.in).nextInt();
        System.out.print("Nam: ");
        nam = new Scanner(System.in).nextInt();
//Tim nam nhuan
        if ((nam < 1) || (nam > 5000)) {
            System.out.println("Vượt quá giới hạn (1-5000)!");
            System.exit(0);
        }
        if ((thang < 1) || (thang > 12)) {
            System.out.println("Khong ton tai ngay nay!");
            System.exit(0);
        }
        if ((thang == 1) || (thang == 3) || (thang == 5) || (thang == 7) || (thang == 8) || (thang == 10) || (thang == 12)) {
            if (ngay > 31) {
                System.out.println("Khong ton tai ngay nay!");
                System.exit(0);
            }
        } else if (ngay > 30) {
            System.out.println("Khong ton tai ngay nay!");
            System.exit(0);
        }
        if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
            System.out.println("Nam " + nam + " la nam nhuan!");
            if ((thang == 2) && (ngay > 29)) {
                System.out.println("Khong ton tai ngay nay!");
                System.exit(0);
            }
        } else {
            System.out.println("Nam " + nam + " khong phai la nam nhuan!");
            if ((thang == 2) && (ngay > 28)) {
                System.out.println("Khong ton tai ngay nay!");
                System.exit(0);
            }
        }
// Tim STT ngay trong nam
        int STT = 0;
        switch (thang - 1) {
            case 0:
                STT = 0;
                break;
            case 1:
                STT = 31;
                break;
            case 2:
                STT = 59;
                break;
            case 3:
                STT = 90;
                break;
            case 4:
                STT = 120;
                break;
            case 5:
                STT = 151;
                break;
            case 6:
                STT = 181;
                break;
            case 7:
                STT = 212;
                break;
            case 8:
                STT = 243;
                break;
            case 9:
                STT = 273;
                break;
            case 10:
                STT = 304;
                break;
            case 11:
                STT = 334;
                break;
        }
        if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0) && (thang > 2)) {
            STT += (ngay + 1);
        } else {
            STT += ngay;
        }
// Tim thu may trong tuan
// ngay 01/01/0001 la CHU NHAT
        int Tongngay;
        int Sonamnhuan = (nam - 1) / 4;
        Tongngay = Sonamnhuan * 366 + (nam - 1 - Sonamnhuan) * 365;
        Tongngay += STT;
        switch ((Tongngay - 1) % 7) {
            case 0:
                System.out.print(ngay + "/" + thang + "/" + nam + " la CHU NHAT");
                break;
            case 1:
                System.out.print(ngay + "/" + thang + "/" + nam + " la THU HAI");
                break;
            case 2:
                System.out.print(ngay + "/" + thang + "/" + nam + " la THU BA");
                break;
            case 3:
                System.out.print(ngay + "/" + thang + "/" + nam + " la THU TU");
                break;
            case 4:
                System.out.print(ngay + "/" + thang + "/" + nam + " la THU NAM");
                break;
            case 5:
                System.out.print(ngay + "/" + thang + "/" + nam + " la THU SAU");
                break;
            case 6:
                System.out.print(ngay + "/" + thang + "/" + nam + " la THU BAY");
                break;
        }
        System.out.println(" va la ngay thu " + STT + " trong nam.");
//So ngay la thu 6 ngay 13
        int i = 0;
        ngay = 13;
        thang = 1;
        while (thang <= 12) {
            STT = 0;
            switch (thang - 1) {
                case 0:
                    STT = 0;
                    break;
                case 1:
                    STT = 31;
                    break;
                case 2:
                    STT = 59;
                    break;
                case 3:
                    STT = 90;
                    break;
                case 4:
                    STT = 120;
                    break;
                case 5:
                    STT = 151;
                    break;
                case 6:
                    STT = 181;
                    break;
                case 7:
                    STT = 212;
                    break;
                case 8:
                    STT = 243;
                    break;
                case 9:
                    STT = 273;
                    break;
                case 10:
                    STT = 304;
                    break;
                case 11:
                    STT = 334;
                    break;
            }
            if ((nam % 4 == 0) && (thang > 2)) {
                STT += (ngay + 1);
            } else {
                STT += ngay;
            }
            Sonamnhuan = (nam - 1) / 4;
            Tongngay = Sonamnhuan * 366 + (nam - 1 - Sonamnhuan) * 365;
            Tongngay += STT;
            if (Tongngay % 7 == 5) {
                i++;
            }
            thang++;
        }
        System.out.println("Nam " + nam + " co " + i + " ngay la thu 6 ngay 13.");
        
        System.out.println(new Date(1, 1, 1));
    }
}
