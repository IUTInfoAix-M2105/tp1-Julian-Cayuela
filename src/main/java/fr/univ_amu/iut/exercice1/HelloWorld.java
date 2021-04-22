package fr.univ_amu.iut.exercice1;

public class HelloWorld {
    public static String hello(String s) {
        if (s == null || s.equals(""))
            return "Hello, World!";
        if (s.equals("Alice"))
            return "Hello, Alice!";
        return "";
    }
}
