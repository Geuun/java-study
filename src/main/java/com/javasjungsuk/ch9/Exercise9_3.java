package com.javasjungsuk.ch9;

public class Exercise9_3 {
    public void main(String[] args) {
        String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
        String path = "";
        String fileName = "";

        int index = fullPath.lastIndexOf("\\");
//        System.out.println(index);

        path = fullPath.substring(0, index);
        fileName = fullPath.substring(index + 1);

        /**
         * CHECK: lastIndexOf()는 찾는 문자열이 없다면 -1을 반환하기 때문에 예외처리를 해주는 것이 좋음!
         */

        System.out.println("fullPath:" + fullPath);
        System.out.println("path:" + path);
        System.out.println("fileName:" + fileName);
    }
}
