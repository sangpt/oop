/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author Desktop
 */
public class Quadrangle {
    private Point p1, p2, p3, p4;

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Quadrangle() {
        this.p1 = new Point("A", 0, 0);
        this.p2 = new Point("B", 0, 1);
        this.p3 = new Point("C", 1, 1);
        this.p4 = new Point("D", 1, 0);
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    public Point getP4() {
        return p4;
    }

    public void setP4(Point p4) {
        this.p4 = p4;
    }

    public Quadrangle(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }
    public void nhap() {
        Point[] p = new Point[4];        
        for(int i = 0; i < 4; i++) {
            System.out.println("Nhap diem thu " + (i+1));
            Point tmp = new Point();
            tmp.nhap();
            p[i] = tmp;
        }
        this.p1 = p[0];
        this.p2 = p[1];
        this.p3 = p[2];
        this.p4 = p[3];
    }
    public void hienThi() {
        String show;
        show = p1.getName() + p2.getName() + p3.getName() + p4.getName() + ": ";
        show += p1.getInfo() + p2.getInfo() + p3.getInfo() + p4.getInfo();
        System.out.println(show);
    }
    public String getName(){
	return "Tu giac";
    }
    public double getArea(){
        double any = 0;
        return any;
    };

}
