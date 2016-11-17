/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author Mark Lee
 */
public class Point {
    public String name;
    public double x;
    public double y;
    
    // Getter
    public String getName() {
        return name;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    //  Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setX(double hoanhdo) {
        this.x = hoanhdo;
    }

    public void setY(double tungdo) {
        this.y = tungdo;
    }
    
    // Khoi tao khi khong co tham so
    public Point(){
        this.x = 0;
        this.y = 0;
        this.name = "A";
    }
    
    //Khoi tao khi nhan hai so thuc lam tham so
    public Point(double a, double b){
        this.x = b;
        this.y = a;
    }
    
    //Khoi tao khi nhan mot xau ky tu va hai so thuc lam tham so
    public Point(String strIn,double a, double b ){
        this.name = strIn;
        this.x = a;
        this.y = b;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten diem: "); this.name = sc.next();
        System.out.print("Nhap x: "); this.x = sc.nextInt();
        System.out.print("Nhap y: "); this.y = sc.nextInt();
    }
    
    public void showInfo(){
        String show;
        show = getName() + "(" + getX() + "," + getY() + ")";
        System.out.print(show);
    }
    public String getInfo(){
        String show;
        show = getName() + "(" + getX() + ", " + getY() + "), ";
        return show;
    }
    public static Double[] timPTDT(Point p1, Point p2){
        Double[] d = new Double[3];
        double x1 = p1.getX(), x2 = p2.getX(),
                y1 = p1.getY(), y2 = p2.getY();
        d[0] = y2 - y1;
        d[1] = x1 - x2;
        d[2] = (y2-y1)*x1+(x2-x1)*y1;
        return d;
    }
    public static double tinhKhoangCach(Point p1, Point p2){
        double tmp = (p1.getX()-p2.getX())*(p1.getX()-p2.getX()) + 
                (p1.getY()-p2.getY())*(p1.getY()-p2.getY());
        return Math.sqrt(tmp);
    }
    public static Point timGiaoDiem(Double[] dt1, Double[] dt2){
        double a1 = dt1[0], b1 = dt1[1], c1 = dt1[2],
                a2 = dt2[0], b2 = dt2[1], c2 = dt2[2];
        double x, y;
        y = (a2*c1/a1 - c2) / (-a2*b1/a1 + b2);
        x = -(b1*y + c1) / a1;
        return new Point(x, y);
    }
}
