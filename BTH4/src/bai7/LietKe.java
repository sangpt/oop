/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

import java.util.Scanner;

/**
 *
 * @author Desktop
 */
public class LietKe {

    public static int nhap() {
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        while (!check) {
            System.out.print(" ");
            try {
                n = input.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.println("Ban phai nhap so! hay nhap lai...");
                input.nextLine();
            }
        }
        return (n);
    }

    public static int countElement(int a[], int n, int i) {
        int count = 0;
        for (int j = 0; j < n; j++) {
            if (a[j] == i) {
                count++;
            }
        }
        return (count);
    }

    public static void main(String[] args) {
        System.out.println("Phạm Tuân Sang - 20146596");
        int n, i;
        System.out.println("Nhap n= ");
        n = nhap();
        int[] array = new int[n];
        for (i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + (i + 1) + " ");
            array[i] = nhap();
        }
        System.out.print("Cac phan tu trong day xuat hien 1 lan: ");
        for (i = 0; i < n; i++) {
            if (countElement(array, n, array[i]) == 1) {
                System.out.print("  " + array[i]);
            }
        }
    }
}
