/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Desktop
 */
public class MaTran {
    public static int[][] nhapMaTran(int m, int n){
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("a[" + i + "][" + j + "] = ");
                a[i][j] = sc.nextInt();
            }
        }
        return a;
    }
    public static void inMaTran(int[][] a, int m, int n){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void inMaTranNguyenTo(int[][] a, int m, int n){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (laSoNguyenTo(a[i][j])) {
                    System.out.print(a[i][j] + " ");
                }
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void timMax(int[][] a, int m, int n){
        int max = -1, imax = -1, jmax = -1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    imax = i;
                    jmax = j;
                }
            }
        }
        System.out.println("Phan tu max la: a[" + imax + "][" + jmax + "] = " + max);
    }
    public static boolean laSoNguyenTo(int a) {
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void timHangNhieuSoNT(int[][] a, int m, int n){
        Integer[] soNT = new Integer[m];
        //khoi tao mang
        for (int i = 0; i < soNT.length; i++) {
            soNT[i] = 0;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(laSoNguyenTo(a[i][j])) {
                    soNT[i]++;
                }
            }
        }
        List<Integer> list = Arrays.asList(soNT);
        int max = Collections.max(list);
        int imax = list.indexOf(max);
        System.out.println("Hang nhieu so nguyen to nhat: " + imax);
    }
    public static void main(String[] args) {
        System.out.println("Phạm Tuân Sang - 20146596");
        Scanner sc = new Scanner(System.in);
        int m, n;
        System.out.print("Nhap so hang: "); m = sc.nextInt();
        System.out.print("Nhap so cot: "); n = sc.nextInt();
        int[][] a = new int[m][n];
        a = nhapMaTran(m, n);
        inMaTran(a, m, n);
        timMax(a, m, n);
        timHangNhieuSoNT(a, m, n);
    }
}
