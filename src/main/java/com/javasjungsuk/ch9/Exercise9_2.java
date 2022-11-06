package com.javasjungsuk.ch9;

class Point3D {
    int x, y, z;

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point3D() {
        this(0, 0, 0);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point3D) {
            Point3D point3D = (Point3D) obj;
            return this.x == point3D.x && this.y == point3D.y && this.z == point3D.z;
        }
        return false;
    }

    @Override
    public String toString() {
        return "[" + x +  // '[' 을 찍으면 92, 2, 3] 으로 출력됨...? why...?
                ", " + y +
                ", " + z +
                ']';
    }
}

public class Exercise9_2 {
    public static void main(String[] args) {
        Point3D p1 = new Point3D(1, 2, 3);
        Point3D p2 = new Point3D(1, 2, 3);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("p1==p2?" + (p1 == p2));
        System.out.println("p1.equals(p2)?" + (p1.equals(p2)));
    }
}
