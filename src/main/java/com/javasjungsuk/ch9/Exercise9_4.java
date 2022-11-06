package com.javasjungsuk.ch9;

public class Exercise9_4 {
    void printGraph(int[] dataArr, char ch) {
        for (int i = 0; i < dataArr.length; i++) {
            for(int j = 0; j < dataArr[i]; j++) {
                System.out.print(ch);
            }
            System.out.println(dataArr[i]);
        }

    }

    public static void main(String[] args) {
        Exercise9_4 exercise9_4 = new Exercise9_4();
        exercise9_4.printGraph(new int[]{3, 7, 1, 4}, '*');
    }
}
