/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codility;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author USER
 */

// https://app.codility.com/demo/take-sample-test/germanium2018/
public class Germanium2018 {
    public int solution(int[] A, int[] B) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int i: A) {
            countMap.compute(i, (k, v) -> (v==null) ? 1 : v+1);
        }
        for(int i=0; i<B.length; i++) {
            if(B[i]<A[i] && countMap.getOrDefault(B[i], 0)==0) {
                countMap.compute(A[i], (k, v) -> (v>1) ? v-1 : 0);
                countMap.compute(B[i], (k, v) -> (v==null) ? 1 : v+1);
            }
        }
        for(int i=1; i<=100000000; i++) {
            if(countMap.getOrDefault(i, 0)==0) {
                return i;
            }
        }
        return 100000001;
    }
}
