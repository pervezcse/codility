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
public class MaxCounters {
    public int[] solution(int N, int[] A) {
        int[] result = new int[N];
        for(int i=0; i<result.length; i++) {
            result[i] = 0;
        }
        int maxCounter = 0;
        int minCounter = 0;
        for(int i=0; i<A.length; i++) {
            if(A[i]==N+1) {
                minCounter = maxCounter;
            } else {
                if(minCounter>result[A[i]-1]) {
                    result[A[i]-1] = minCounter;
                }
                result[A[i]-1]++;
                if(maxCounter<result[A[i]-1]) {
                    maxCounter = result[A[i]-1];
                }
            }
        }
        for(int i=0; i<result.length; i++) {
            if(result[i]<minCounter) {
                result[i] = minCounter;
            }
        }
        return result;
    }
}
