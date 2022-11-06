package com.javasjungsuk.ch9;

/**
 * 메서드명 : contains
 * 기 능 : 첫 번째 문자열(src)에 두 번째 문자열(target)이 포함되어 있는지 확인한다. 포함되어 있으면 true, 그렇지 않으면 false를 반환한다.
 * 반환타입 : boolean
 * 매개변수 : String src
 *          String target
 */
public class Exercise9_7 {
    public boolean contains(String src, String target) {
        return src.indexOf(target) != -1;
    }

    public static void main(String[] args) {
        Exercise9_7 exercise9_7 = new Exercise9_7();
        System.out.println(exercise9_7.contains("12345","23"));
        System.out.println(exercise9_7.contains("12345","67"));
    }
}
