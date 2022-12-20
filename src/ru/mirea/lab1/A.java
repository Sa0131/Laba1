package ru.mirea.lab1;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int [10];
        int sum = 0;
        for(int i = 0; i < 10; i++) {
            a[i]=input.nextInt();
            sum = sum + a[i];
        }
        double sr;
        sr = sum/10.0;
        System.out.println(sum + " - сумма элементов массива");
        System.out.println(sr + " - среднее арифметическое");
    }
}
