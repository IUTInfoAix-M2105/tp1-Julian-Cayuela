package fr.univ_amu.iut.exercice2;

public class FizzBuzzer {

    public String computeString(int i) {
        if (i == 3)
            return "Fizz";
        return String.valueOf(i);
    }

    public String[] computeList(int i) {
        throw new RuntimeException("Not yet implemented !");
    }
}
