package com.company.winter;

public class Test {

    public static int solution(int[] arr){
        int cnt = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] <= arr[i-1]){
                cnt++;
            }
        }

        return cnt;
    }

    public static void main(String[] args){
        System.out.println("Hello");
        System.out.println(solution(new int[]{-5,-5,-5,-42,6,12}));
    }
}
