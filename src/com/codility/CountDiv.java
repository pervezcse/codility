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
public class CountDiv {
    
    public int solution(int A, int B, int K) {
        if(A==0) {
            return B/K + 1;
        }
        return B/K - (A-1)/K;
    }
    
    public static void main(String[] args) {
        CountDiv test = new CountDiv();
        test.solution(11, 345, 17);
    }
}
