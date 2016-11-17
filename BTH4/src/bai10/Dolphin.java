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
public class Dolphin extends Creature implements Swimmable{

    private float weight;

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    @Override
    public void swim() {
        System.out.println("Khả năng bơi của Cá voi rất tuyệt. Cá voi bơi rất nhanh. Cá voi bơi bằng cách quẫy đuôi lên xuống… ");
    }

    @Override
    public void dive() {
        System.out.println("Cá voi lặn rất tốt...");
    }
    
    @Override
    public String getRace(){
        return "Dolphin";
    }
    @Override
    public void display(){
        String mes = "Age: " + this.getAge() + "\nColor: " + this.getColor() + "\nNumber: " + this.getNumber() + "\nWeight: " + weight;
        System.out.println(mes);
    }
}
