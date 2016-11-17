/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;
import java.util.StringTokenizer;
import static javafx.scene.input.KeyCode.F;
import javax.swing.JOptionPane;

/**
 *
 * @author Kawaii
 */
public class ChuanHoaXau {

    public static String chuyenInHoa(String str) {
        String s, strOutput;
        s = str.substring(0, 1);
        strOutput = str.replaceFirst(s, s.toUpperCase());
        return (strOutput);
    }

    public static String chuanHoa(String strInput) {
        String strOutput = "";
        StringTokenizer strToken = new StringTokenizer(strInput, " ,\t,\r");
        strOutput += "" + chuyenInHoa(strToken.nextToken());
        while (strToken.hasMoreTokens()) {
            strOutput += " " + chuyenInHoa(strToken.nextToken());
        }
        return (strOutput);
    }

    public static void main(String[] args) {
        System.out.println("Phạm Tuân Sang - 20146596");
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao 1 xau: ");
        String strInput = input.nextLine();
        System.out.println("Xau duoc chuan hoa la: "
                + chuanHoa(strInput));
    }
}
