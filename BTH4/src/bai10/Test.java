/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;

/**
 *
 * @author Kawaii
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("Phạm Tuấn Sang - 20146596");
        Dolphin dol = new Dolphin();
        Eagle eag = new Eagle(); 
        dol.swim();
        dol.dive();
        dol.display();
        eag.fly();
        eag.soar();
        eag.display();
    }
}
