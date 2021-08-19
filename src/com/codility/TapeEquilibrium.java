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
public class TapeEquilibrium {
    public int solution(int[] A) {
        int sum = 0;
        for(int i=0; i<A.length; i++) {
            sum = sum + A[i];
        }
        int part1 = 0;
        int part2 = sum;
        int diff=Integer.MAX_VALUE;
        for(int i=1; i<A.length; i++) {
            part1 = part1 + A[i-1];
            part2 = part2 - A[i-1];
            int tempDiff = Math.abs(part2 - part1);
            if(tempDiff<diff) {
                diff = tempDiff;
            }
        }
        return diff;
    }
}
