/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codility;

import java.util.Arrays;

/**
 *
 * @author USER
 */
public class MaxProductOfThree {
    public int solution(int[] A) {
        Arrays.sort(A);
        int productCandidate1 = A[A.length-3] * A[A.length-2] * A[A.length-1];
        int productCandidate2 = A[0] * A[1] * A[A.length-1];
        if(productCandidate1>productCandidate2)
            return productCandidate1;
        else
            return productCandidate2;
    }
    
    public static void main(String args[]) {
        MaxProductOfThree mpot = new MaxProductOfThree();
        int[] array = {-3,1,2,2,-2,5,6};
        mpot.solution(array);
    }
}
