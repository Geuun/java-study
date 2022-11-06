package com.javasjungsuk.ch9;

/**
 * 메서드명 : delChar
 * 기 능 : 주어진 문자열에서 금지된 문자들을 제거하여 반환한다.
 * 반환타입 : String
 * 매개변수 : String src - 변환할 문자열
 *          String delCh - 제거할 문자들로 구성된 문자열
 */
public class Exercise9_9 {

    String src;
    String delCh;

    public String delChar(String src, String delCh) {
        StringBuffer sb = new StringBuffer(); // 배열의 길이를 미리 파악해서 선언해 주는것이 좋음 ex) src.length()

        for (int i = 0; i < src.length(); i++) {
            char chr = src.charAt(i);
            if (delCh.indexOf(chr) == -1) sb.append(chr);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Exercise9_9 exercise9_9 = new Exercise9_9();
        System.out.println("(1!2@3^4~5)" + " -> " + exercise9_9.delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
        System.out.println("(1 2 3 4\t5)" + " -> " + exercise9_9.delChar("(1 2 3 4\t5)", " \t"));
    }
}
