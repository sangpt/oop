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
public class Creature {
    private int age;
    private String color;
    private int number;
    public String getRace(){
        return "Creature";
    }
    public void display(){
        String mes = "Age: " + this.age + "\nColor: " + this.color + "\nNumber: " + this.number;
        System.out.println(mes);
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public static void main(String[] args) {
        Creature c = new Creature();
        c.display();
    }
}
