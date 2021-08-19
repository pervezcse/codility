/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codility;

/**
 *
 * @author USER
 */
public class OddOccurrencesInArray {
    public int solution(int[] A) {
        int result = 0;
        for(int i: A) {
            result = result ^ i;
        }
        return result;
    }
    
    public static void main(String[] args) {
        OddOccurrencesInArray array = new OddOccurrencesInArray();
        
        int[] b = {9, 3, 9, 3, 9, 7, 9};
        System.out.println(array.solution(b));
    }
}
