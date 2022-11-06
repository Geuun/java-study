package com.javasjungsuk.ch9;

import java.util.Scanner;

public class Exercise9_11 {

    public void guGuDan(int start, int and) {

        for (int i = start; i <= and; i++) {
            System.out.println(i + " 단 입니다.");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Exercise9_11 exercise9_11 = new Exercise9_11();

        exercise9_11.guGuDan(3, 5);
    }
}
