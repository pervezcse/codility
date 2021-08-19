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
public class Exam {
    public int solution(int K, int L, int M, int N, int P, int Q, int R, int S) {
        int firstRectArea = (M-K) * (N-L);
        int secondRectArea = (R-P) * (S-Q);
        int overlappedArea = getOverlappedArea(K, L, M, N, P, Q, R, S);
        int result = firstRectArea + secondRectArea - overlappedArea;
        if(result>2147483647)
            return -1;
        return result;
    }

    private int getOverlappedArea(int K, int L, int M, int N , int P, int Q, int R, int S) { 
        if (!isOverlapped(K, L, M, N, P, Q, R, S)) 
            return 0;
        
//        intersectArea = (max(M,R) - min(K,P)) * (max(N,S) - min(L,Q))
        
        int x = Math.max(0, Math.min(M, R) - Math.max(K, P));
        int y = Math.max(0, Math.min(N, S) - Math.max(L, Q));
        return x * y;
    }
    
    private boolean isOverlapped(int K, int L, int M, int N, int P, int Q, int R, int S) {
        if (R < K || M < P || S < L || Q > N) {
            return false; 
        }
//        if (S < L || Q > N) {
//            return false; 
//        }
        return true;
    }
    
    int areaOfSum(int L1, int R1, int B1, int T1, int L2, int R2, int B2, int T2)
    {
        int area1 = (R1 - L1)*(T1 - B1);
        int area2 = (R2 - L2)*(T2 - B2);

        int L3 = Math.max(L1, L2);
        int R3 = Math.min(R1, R2);
        int B3 = Math.max(B1, B2);
        int T3 = Math.min(T1, T2);

        int area3 = 0;        
        if (R3 - L3 > 0 && T3 - B3 > 0) // Skip this check if the rectangles are guaranteed to intersect.
            area3 = (R3 - L3)*(T3 - B3);

        return area1 + area2 - area3;
    }
    
//    K = -4    L = 1      M = 2     N = 6
//  P = 0     Q = -1     R = 4     S = 3
    
    public static void main(String args[]) {
        Exam exam = new Exam();
        exam.solution(-4, 1, 2, 6, 0, -1, 4, 3);
//        exam.areaOfSum(-4, 1, 2, 6, 0, -1, 4, 3);
    }
}
