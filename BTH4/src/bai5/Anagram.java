/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

import static bai4.CountChar.countChar;
import java.util.HashMap;

/**
 *
 * @author Desktop
 */
public class Anagram {
    public static boolean check(String st1, String st2){
        HashMap<Character, Integer> h1 = countChar(st1);
        HashMap<Character, Integer> h2 = countChar(st2);
        return h1.equals(h2);
    }
    public static void main(String[] args) {
        System.out.println("Phạm Tuân Sang - 20146596");
        String st1 = "read";
        String st2 = "earda";
        System.out.println(check(st1, st2));
    }
}
