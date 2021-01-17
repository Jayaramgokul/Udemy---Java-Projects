package com.jayaram;

public class Main {

    public static void main(String[] args) {

        String switchvalue = "aLas";

        switch (switchvalue.toUpperCase()) {
            case "ALAS":
                System.out.println("Value is A");
                break;
            case "B":
                System.out.println("Value is B");
                break;
            case "C":
                System.out.println("Value is C");
                break;
            case "D":
                System.out.println("Value is D");
                break;
            case "E":
                System.out.println("Value is E");
                break;

                default:
                    System.out.println("No Values entered");
                    break;
        }

    }
}
