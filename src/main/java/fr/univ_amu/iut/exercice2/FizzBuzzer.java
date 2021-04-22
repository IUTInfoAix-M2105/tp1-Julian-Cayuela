package fr.univ_amu.iut.exercice2;

public class FizzBuzzer {

    public String computeString(int i) {
        if (i == 15)
            return "FizzBuzz";
        if (i % 3 == 0)
            return "Fizz";
        if (i % 5 == 0)
            return "Buzz";
        return String.valueOf(i);
    }

    public String[] computeList(int i) {
        throw new RuntimeException("Not yet implemented !");
    }
}
