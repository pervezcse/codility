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
public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        if(A.length==0 || K==0 || A.length==K) {
            return A;
        }
        if(A.length<K) {
            K = A.length % K;
        }
        int[] temp = new int[A.length];
        for(int i=0; i<A.length; i++) {
            if(i+K < A.length) {
                temp[i+K] = A[i];    
            } else {
                temp[i+K-A.length] = A[i];
            }   
        }
        return temp;
    }
}
