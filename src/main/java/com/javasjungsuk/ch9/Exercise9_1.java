package com.javasjungsuk.ch9;

class SutdaCard {
    int num;
    boolean isGeun;

    SutdaCard() {
        this(1, true);
    }

    public SutdaCard(int num, boolean isGeun) {
        this.num = num;
        this.isGeun = isGeun;
    }

    @Override
    public boolean equals (Object obj) {
        if (obj instanceof SutdaCard) {
            SutdaCard sutdaCard = (SutdaCard) obj;
            return num == sutdaCard.num && isGeun == sutdaCard.isGeun;
        }
        return false;
    }

    @Override
    public String toString() {
        return "SutdaCard{" +
                "num=" + num +
                ", isGeun=" + isGeun +
                '}';
    }
}

public class Exercise9_1 {

    public static void main(String[] args) {
        SutdaCard c1 = new SutdaCard(3, true);
        SutdaCard c2 = new SutdaCard(3, true);

        System.out.println("c1=" + c1);
        System.out.println("c2=" + c2);
        System.out.println("c1.equals(c2):" + c1.equals(c2));
    }
}
