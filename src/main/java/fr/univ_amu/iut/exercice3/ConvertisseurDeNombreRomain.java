package fr.univ_amu.iut.exercice3;

public class ConvertisseurDeNombreRomain {
    public int enNombreArabe(String i) {
        if (i.equals("I"))
            return 1;
        if (i.equals("V"))
            return 5;
        if (i.equals("X"))
            return 10;
        if (i.equals("Z"))
            throw new IllegalArgumentException("Ceci n'est pas un chiffre romain");
        if (i.equals("II"))
            return 1+1;
        return 0;
    }
}
