package com.blessying;
import java.util.Scanner;
 class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a: ");
        int a = scanner.nextInt();

        System.out.println("b: ");
        int b = scanner.nextInt();

        if (b == 0) {
            System.out.println("Division by zero!");
        } else {
            System.out.println(a / b);
        }
        System.out.println("finished");

        int number = 12241;
        int digit = ((number % 100) / 10) % 10;
        System.out.println(digit);



        int w = 2;
        int y = 3;
        int car = ++w + y--;
        System.out.println(car);

        System.out.print('\t');
        System.out.print('a');
        System.out.print('\n');
        System.out.print('c');

        char c = '1' + '3';
        System.out.println(c);

        boolean b1 = false;
        boolean b2 = true;
        boolean b3 = false;
        boolean result = (b1 && b2 || b3);
        System.out.println(result);

    }
}





