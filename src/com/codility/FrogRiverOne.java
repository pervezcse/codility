/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codility;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author USER
 */
public class FrogRiverOne {
    public int solution(int X, int[] A) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<A.length; i++) {
            set.add(A[i]);
            if(set.size()==X)
                return i;
        }
        return -1;
    }
}
