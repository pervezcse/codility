package com.codility;

class BinaryGap {
    public int solution(int N) {        
        int binaryGap = 0;
        String binaryStr = Integer.toBinaryString(N);
        char[] binaryArray = binaryStr.toCharArray();
        int count=0;
        boolean countStart = false;
        for(char c: binaryArray) {
            if(c=='1' && !countStart) {
                countStart = true;
            } else if(c=='0' && countStart) {
                count++;
            } else if(c=='1' && countStart) {
                if(count > binaryGap) {
                    binaryGap = count;
                }
                count=0;
            }
        }
        return binaryGap;
    }
}
