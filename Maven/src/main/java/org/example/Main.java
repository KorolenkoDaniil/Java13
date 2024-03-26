package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.print("Hello Korolenko Danila");

        Tester tester1 = new Tester("A", "a", 11, 12, 12.5);
        Tester tester2 = new Tester("B", "b", 11, 12, 1);

        System.out.println(tester1.equals(tester2));
        System.out.println(tester2);
        Tester.print("Danila");

    }
}