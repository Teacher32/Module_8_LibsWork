package com.libs.math;

import static java.lang.Math.pow;

class Mathematics {
    private int a = 5;
    private int b = 2;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}

public class Main {
    public static void main(String[] args) {
        Mathematics mathA = new Mathematics();
        Mathematics mathB = new Mathematics();
        int a = mathA.getA();
        int b = mathB.getB();

        // вычисляем a в степени b
        double result = pow(a, b);
        System.out.println("Число " + a + " в степени " + b + " равно " + result);

    }
}
