/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Kawaii
 */
public class StringMax {

    public static void timXauMax(String strInput) {
        System.out.println("Phạm Tuân Sang - 20146596");
        StringTokenizer strToken = new StringTokenizer(strInput, " ,\t,\r");
        int Max, i = 1, lengthStr;
        Max = strToken.nextToken().length();
        int viTriMax = i;
        while (strToken.hasMoreTokens()) {
            lengthStr = strToken.nextToken().length();
            i++;
            if (Max < lengthStr) {
                Max = lengthStr;
                viTriMax = i;
            }
        }
        System.out.println("Do dai xau lon nhat la: " + Max + " o vi tri " + viTriMax);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao 1 xau: ");
        String strInput = input.nextLine();
        timXauMax(strInput);
    }
}
