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
public class PermCheck {
    
    public int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        for(int i: A) {
            if(i>A.length) {
                return 0;
            } else if(set.contains(i)) {
                return 0;
            } else {
                set.add(i);
            }
        }
        return 1;
    }
}
