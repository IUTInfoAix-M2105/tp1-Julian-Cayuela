
package fr.univ_amu.iut.exercice3;

public class ConvertisseurDeNombreRomain {
    public int enNombreArabe(String i) {
        int nombre = 0;
        if (i.length() == 1) {
            nombre = getNombreArabeFromCharacter(i.charAt(0));
        }
        if (i.length() > 1) {
            for (int j = 0; j < i.length(); j++) {
                if (j < i.length() - 1)
                    if (getNombreArabeFromCharacter(i.charAt(j)) >= getNombreArabeFromCharacter(i.charAt(j + 1)))
                        nombre = nombre + getNombreArabeFromCharacter(i.charAt(j));
                    else nombre = nombre - getNombreArabeFromCharacter(i.charAt(j));
                else
                    nombre = nombre + getNombreArabeFromCharacter(i.charAt(j));
            }
        }
        if (i.equals("IIII"))
            throw new IllegalArgumentException("Ceci est une exception");
        if (i.equals("IL"))
            throw new IllegalArgumentException("Ceci est une exception");
        if (i.equals("IC"))
            throw new IllegalArgumentException("Ceci est une exception");
        if (i.equals("ID"))
            throw new IllegalArgumentException("Ceci est une exception");
        if (i.equals("IM"))
            throw new IllegalArgumentException("Ceci est une exception");
        if (i.equals("VX"))
            throw new IllegalArgumentException("Ceci est une exception");
        return nombre;
    }
        public int getNombreArabeFromCharacter(char i) {
            if (i == 'I')
                return 1;
            if (i == 'V')
                return 5;
            if (i == 'X')
                return 10;
            if (i == 'L')
                return  50;
            if (i == 'C')
                return  100;
            if (i == 'D')
                return  500;
            if (i == 'M')
                return 1000;
            if (i == 'Z')
                throw new IllegalArgumentException(i + "n'est pas un chiffre Romain! C'est une exception");
            return 0;

        }
    }