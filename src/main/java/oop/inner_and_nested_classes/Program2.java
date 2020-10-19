package oop.inner_and_nested_classes;

public class Program2 {

    public static void main(String[] args) {

        Math2.Factorial fact = Math2.getFactorial(6);
        System.out.printf("Факториал числа %d равен %d \n", fact.getKey(), fact.getResult());
    }
}
