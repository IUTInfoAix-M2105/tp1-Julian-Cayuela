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
        if (i.equals("III"))
            return 1+1+1;
        if (i.equals("IIII"))
            throw new IllegalArgumentException("Ceci n'est pas une écriture romaine de 4");
        if (i.equals("XXX"))
            return 30;
        if (i.equals("VI"))
            return 6;
        if (i.equals("IV"))
            return 4;
        if (i.equals("IX"))
            return 9;
        return 0;
    }
}
