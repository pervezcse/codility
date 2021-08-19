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
public class MinAvgTwoSlice {
        
    public int solution(int[] A) {
        int startingPos = 0;
        double minAvg = Double.MAX_VALUE;
        for(int i=0; i<A.length-1; i++) {
            double avg2 = (A[i] + A[i+1])/2.0;
            if(minAvg>avg2) {
                minAvg = avg2;
                startingPos = i;
            }
            if(i<A.length-2) {
                double avg3 = (A[i] + A[i+1] + A[i+2])/3.0;
                if(minAvg>avg3) {
                    minAvg = avg3;
                    startingPos = i;
                }
            }
        }
        return startingPos;
    }
}
