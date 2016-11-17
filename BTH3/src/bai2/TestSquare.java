/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import bai1.Point;
import bai1.Quadrangle;
import javax.swing.JOptionPane;

/**
 *
 * @author Desktop
 */
public class TestSquare {

    public static void main(String[] args) {
        System.out.println("Phạm Tuân Sang - 20146596");
        //Goi ham khoi tao khong tham so
        Square s1 = new Square();
        s1.setP3(new Point(-1, 1));
        s1.setP4(new Point(-1, 0));
        s1.hienThi();
        Point p1 = new Point(0, 2);
        Point p2 = new Point(0, 3);
        Point p3 = new Point(1, 3);
        Point p4 = new Point(1, 2);

        //Goi ham khoi tao 4 tham so
        Square s2 = new Square(p1, p2, p3, p4);
        s2.hienThi();

        //Goi ham khoi tao 4 tham so
        Quadrangle q1
                = new Quadrangle(p1, p4, new Point(1, 1), new Point(0, 1));
        Quadrangle q2 = new Square(p1, p2, p3, p4); //Up casting

        JOptionPane.showMessageDialog(null, q1.getName());
        q1.hienThi();

        JOptionPane.showMessageDialog(null, q2.getName());
        q2.hienThi();

        Square s3 = (Square) q1; //Down casting
        JOptionPane.showMessageDialog(null, s3.getName());
        s3.hienThi();

        Square s4 = new Square();
        s4.nhap();
        s4.hienThi();
    }
}
