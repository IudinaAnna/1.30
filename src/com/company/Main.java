package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите 5-значное число: ");
        int value=input.nextInt();
        int x1,x2,x3,x4,x5;
        x1 = value / 10000;
        x2 = (value - x1 * 10000) / 1000;
        x3 = (value - x1 * 10000 - x2 * 1000) / 100;
        x4 = (value - x1 * 10000 - x2 * 1000 - x3 * 100) / 10;
        x5 = (value - x1 * 10000 - x2 * 1000 - x3 * 100 - x4 * 10);
        System.out.println(x1+"   "+x2+"   "+x3+"   "+x4+"   "+x5);
    }
}



