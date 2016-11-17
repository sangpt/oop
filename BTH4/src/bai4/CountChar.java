/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.HashMap;

/**
 *
 * @author Desktop
 */
public class CountChar {
    public static HashMap countChar(String s){
        HashMap<Character, Integer> h = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            if(h.containsKey(s.charAt(i)) == false)
                h.put(s.charAt(i), 1);
            else 
                h.put(s.charAt(i), h.get(s.charAt(i)) + 1);
        }
        return h;
    }
    public static void main(String[] args) {
        System.out.println("Phạm Tuân Sang - 20146596");
        String s = "xin chao sang";
        HashMap<Character, Integer> h = countChar(s);      
        for(Character key: h.keySet()){
            System.out.println(key + ": " + h.get(key));
        }
    }
}
