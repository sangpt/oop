/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Kawaii
 */
public class DemTu {

    public static void main(String[] args) {
        System.out.println("Phạm Tuân Sang - 20146596");
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao 1 xau: ");
        String str = input.nextLine();
        StringTokenizer strToken = new StringTokenizer(str, " ");
        System.out.println("So cac tu trong xau la: "
                + strToken.countTokens());
    }

}
