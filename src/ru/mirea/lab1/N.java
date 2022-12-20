package ru.mirea.lab1;

import org.jetbrains.annotations.NotNull;

public class N {
    public static void main(String @NotNull [] args)
    {
        System.out.println("Аргументы:");
        for(int i = 0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
}
