package com.javasjungsuk.ch9;

/**
 * 메서드명 : fillZero
 * 기 능 : 주어진 문자열(숫자)로 주어진 길이의 문자열로 만들고, 왼쪽 빈 공간은 '0'으로 채운다.
 * 만일 주어진 문자열이 null이거나 문자열의 길이가 length의 값과 같으면 그대로 반환한다.
 * 만일 주어진 length의 값이 0보다 같거나 작은 값이면, 빈 문자열("")을 반환한다.
 * 반환타입 : String
 * 매개변수 : String src - 변환할 문자열
 *          int length - 변환한 문자열의 길이
 */
public class Exercise9_6 {
    public String fillZero(String src, int length) {
        if (src == null || length == src.length()) return src;
        else if (length <= 0) return "";
        else if (length < src.length()) return src.substring(0, length);
        else {
            char[] charArr = new char[length];

            for (int i = 0; i < charArr.length; i++)
                charArr[i] = '0';
            for (int i = 0; charArr.length - src.length() + i < charArr.length; i++)
                charArr[charArr.length - src.length() + i] = src.charAt(i);
            return new String(charArr);
        }
    }

    public static void main(String[] args) {
        Exercise9_6 exercise9_6 = new Exercise9_6();
        String src = "12345";
        System.out.println(exercise9_6.fillZero(src, 10));
        System.out.println(exercise9_6.fillZero(src, -1));
        System.out.println(exercise9_6.fillZero(src, 3));
    }
}
