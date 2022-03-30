/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework6.tinhtuoi;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author OS
 */
public class TheAge {

    public int day;
    public int month;
    public int year;
    public String result; // tra ve ket qua tim dc

    Boolean check() { // check xem ngay do co ton tai khong

        if (month == 2) {
            if (year % 400 == 0) { // check nam nhuan de xem 29 or 28?
                if (day < 30) {
                    return true;
                }
            } else {
                if (day < 29) {
                    return true;
                }
            }
        }
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) { // nhung thang co 31 ngay
            if (day < 32) {
                return true;
            }
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) { // nhung thang co 30 ngay
            if (day < 31) {
                return true;
            }
        }

        return false;
    }

    void TheAgeNow() {
        if (day < 1 || day > 31) {
            result = "Nhap ngay sai";
        } else if (month < 1 || month > 12) {
            result = "Thang nhap sai";
        } else if (year < 1900 || year > 3000) {
            result = "Nam nhap sai";
        } else if (check() == false) {
            result = "Ngay Khong ton tai";
        } else {
           result = "";
            
        }
    }
}
