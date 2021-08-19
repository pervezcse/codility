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
public class MissingInteger {
    public int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        for(int i: A) {
           set.add(i);
        }
        for(int i=1; i<Integer.MAX_VALUE; i++) {
            if(!set.contains(i)) {
                return i;
            }
        }
        return 1;
    }
}
