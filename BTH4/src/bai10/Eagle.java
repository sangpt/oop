/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;

/**
 *
 * @author Desktop
 */
public class Eagle extends Creature implements Flyable{

    private float lengthOfWing;

    public float getLengthOfWing() {
        return lengthOfWing;
    }

    public void setLengthOfWing(float lengthOfWing) {
        this.lengthOfWing = lengthOfWing;
    }
    @Override
    public void fly() {
        System.out.println("Đại bàng bay rất khủng...");
    }

    @Override
    public void soar() {
        System.out.println("Đại bàng lượn rất khủng...");
    }
    
    @Override
    public String getRace(){
        return "Eagle";
    }
    @Override
    public void display(){
        String mes = "Age: " + this.getAge() + "\nColor: " + this.getColor() + "\nNumber: " + this.getNumber() + "\nLengOfWing: " + lengthOfWing;
        System.out.println(mes);
    }
}
