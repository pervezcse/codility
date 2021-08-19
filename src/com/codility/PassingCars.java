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
public class PassingCars {
    public int solution(int[] A) {
        int zeroCount=0;
        long count=0L;
        for(int i=0; i<A.length; i++) {
            if(count==0 && A[i]==1) {
                continue;
            }
            if(A[i]==0) {
                count = count + (A.length - (i+1)) - zeroCount;
                zeroCount++;
            }
        }
        if(count>1000000000) {
            return -1;
        }
        return (int)count;
    }
}
