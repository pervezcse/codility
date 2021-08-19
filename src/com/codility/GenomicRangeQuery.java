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
public class GenomicRangeQuery {
    
    public int[] solution(String S, int[] P, int[] Q) {
        int len = S.length();
        int[] result = new int[P.length];
        char[] SArray = S.toCharArray();
        int[][] grid = new int[len][4];
        for(int i=0; i<len; i++) {
            for(int j=0; j<4; j++) {
                grid[i][j] = 0;
            }
        }
        for(int i=0; i<len; i++) {
            switch (SArray[i]) {
                case 'A':
                    grid[i][0] = 1;
                    break;
                case 'C':
                    grid[i][1] = 1;
                    break;
                case 'G':
                    grid[i][2] = 1;
                    break;
                case 'T':
                    grid[i][3] = 1;
                    break;
                default:
                    break;
            }
        }
        for(int i=1; i<len; i++) {
            for(int j=0; j<4; j++) {
                grid[i][j] = grid[i][j] + grid[i-1][j];
            }
        }
        for(int i=0; i<P.length; i++) {
            int x = P[i];
            int y = Q[i];
            for(int j=0; j<4; j++) {
                int sub=0;
                if(x>0) {
                    sub = grid[x-1][j];
                }
                if(grid[y][j]-sub>0) {
                    result[i] = j+1;
                    break;
                }
            }
        }
        return result;
    }
}
