package ru.mirea.lab1;
public class D {
    static int fact(int n) {
        int a = 1;
        for (int i = 1; i<=n; i++) {
            a = a * i;}
        return a;
    }
    public static void main(String[] args){
        System.out.println(fact(3));
    }
}


