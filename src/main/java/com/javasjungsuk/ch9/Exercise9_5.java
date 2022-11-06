package com.javasjungsuk.ch9;

/**
 * 매서드명 : count
 * 기능    : 주어진 문자열(src)에 찾으려는 문자열(target)이 몇 번 나오는지 세어서 반환한다.
 * 반환타입 : int
 * 매개변수 : String src
 *          String target
 */
public class Exercise9_5 {
    public int count(String src, String target) {
        int count = 0;

        for (int i = 0; i < src.length(); i++) {
            i = src.indexOf(target, i);
            if (i != -1) count++;
            else break;
        }

        return count;
    }

    public static void main(String[] args) {
        Exercise9_5 exercise9_5 = new Exercise9_5();
        System.out.println(exercise9_5.count("12345AB12AB345AB", "AB"));
        System.out.println(exercise9_5.count("12345", "AB"));
    }
}
