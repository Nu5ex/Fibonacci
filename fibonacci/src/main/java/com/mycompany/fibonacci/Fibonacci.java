/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fibonacci;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("El Fibonacci de 15 es: " + fibonacci(15));
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int a = 0, b = 1;
        int result = 0;

        for (int i = 2; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }

        return result;
    }
}
