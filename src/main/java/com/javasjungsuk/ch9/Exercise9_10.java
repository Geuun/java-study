package com.javasjungsuk.ch9;


/**
 * 메서드명 : format
 * 기 능 : 주어진 문자열을 지정된 크기의 문자열로 변환한다. 나머지 공간은 공백으로 채운다.
 * 반환타입 : String
 * 매개변수 :
 * String str - 변환할 문자열
 * int length - 변환된 문자열의 길이
 * int alignment - 변환된 문자열의 정렬조건 (0:왼쪽 정렬, 1: 가운데 정렬, 2:오른쪽 정렬)
 */
public class Exercise9_10 {

    String str;
    int length;
    int alignment;

    public String format(String str, int length, int alignment) {

        if (length < str.length()) return str.substring(length);

        char[] chrArr = new char[length];
        char[] strArr = str.toCharArray();

        for (int i = 0; i < chrArr.length; i++)
            chrArr[i] = ' ';

        switch (alignment) {
            case 0 :
            default:
                System.arraycopy(strArr, 0, chrArr, 0, strArr.length);
                break;
            case 1 :
                System.arraycopy(strArr, 0, chrArr, (length - str.length())/2, strArr.length);
                break;
            case 2 :
                System.arraycopy(strArr, 0, chrArr, (length - str.length()), strArr.length);
        }

//        return chrArr.toString();
        return new String(chrArr);
    }

    public static void main(String[] args) {
        Exercise9_10 exercise9_10 = new Exercise9_10();
        String str = "가나다";

        System.out.println(exercise9_10.format(str, 7, 0)); // 왼쪽 정렬
        System.out.println(exercise9_10.format(str,7,1)); // 가운데 정렬
        System.out.println(exercise9_10.format(str,7,2)); // 오른쪽 정렬
    }
}
