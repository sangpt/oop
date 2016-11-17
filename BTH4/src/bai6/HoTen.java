/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;

/**
 *
 * @author Desktop
 */
public class HoTen {

    public static String chuyenHoTen(String hoten) {
        System.out.println("Phạm Tuân Sang - 20146596");
        String[] strArr = hoten.split(" ");
        int len = strArr.length;
        String ho = strArr[0];
        String ten = strArr[len - 1];
        String output = ten + " " + ho;
        for (int i = 1; i < len - 1; i++) {
            output += " " + strArr[i];
        }
        return output;
    }
    public static void main(String[] args) {
        String name = "Tran Nguyen Nga Huyen";
        System.out.println(chuyenHoTen(name));
    }
}
