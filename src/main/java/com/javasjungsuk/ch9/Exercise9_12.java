package com.javasjungsuk.ch9;

/**
 * 메서드명 : getRand
 * 기 능 : 주어진 범위(from~to)에 속한 임의의 정수값을 반환한다.
 *          (양쪽 경계값 모두 범위에 포함)
 *          from의 값이 to의 값보다 클 경우도 처리되어야 한다.
 * 반환타입 : int
 * 매개변수 : int from - 범위의 시작값
 *          int to - 범위의 끝값
 */
public class Exercise9_12 {
    int from;
    int to;

    public int getRand(int from, int to) {
        if (from > to) return (int)((Math.random() * (from - to)) + 1);
        else return (int)((Math.random() * (to - from)) + 1);
    }

    public static void main(String[] args) {
        Exercise9_12 exercise9_12 = new Exercise9_12();
        for (int i = 0; i < 20; i++) System.out.print(exercise9_12.getRand(1, -3) + "," );
        System.out.println();
        for (int i = 0; i < 20; i++) System.out.print(exercise9_12.getRand(3, 3) + "," );
        System.out.println();
        for (int i = 0; i < 20; i++) System.out.print(exercise9_12.getRand(-3, 1) + "," );
    }
}
