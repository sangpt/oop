/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author Desktop
 */
import bai1.Point;
import bai1.Quadrangle;

public class Square extends Quadrangle{
    private Point tamDX;

    public Square() {
        this.timTamDX();
    }

    
    public Square(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
        this.timTamDX();
    }
    public Point getTamDX() {
        return tamDX;
    }

    public void setTamDX(Point tamDX) {
        this.tamDX = tamDX;
    }
    private void timTamDX(){
        double x,y;
        x = (this.getP1().getX() + this.getP2().getX() + this.getP3().getX() + this.getP4().getX()) / 4;
        y = (this.getP1().getY() + this.getP2().getY() + this.getP3().getY() + this.getP4().getY()) / 4;
        Point p = new Point("I", x, y);
        tamDX = p;
    }
    @Override
    public String getName(){
	return "Hinh vuong voi tam doi xung la: " 
            + tamDX.getName() + "("
            + tamDX.getX() + ","
            + tamDX.getY() + ")";
    }
    @Override
    public double getArea(){
        double canh = Point.tinhKhoangCach(this.getP1(), this.getP2());
        return canh*canh;
    }

    public static void main(String[] args) {
        Square s = new Square();
        System.out.println(s.getArea());
    }
}
