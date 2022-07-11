package com.company;

public class Main {

    public static void main(String[] args) {
        Griffindoer harryPotter = new Griffindoer("Harry Potter", 75, 70, 77, 70, 80);
        Griffindoer hermioneGranger = new Griffindoer("Hermione Granger", 50, 50, 50, 50, 50);
        Griffindoer ronaldWeasley = new Griffindoer("Ronald Weasley", 60, 60, 60, 45, 50);

        Slizarin dracoMalfoy = new Slizarin("Draco Malfoy", 80, 80, 80, 80, 50, 65, 60);
        Slizarin grexemMontegu = new Slizarin("Grexem Montegu", 50, 50, 50, 50, 50, 50, 50);
        Slizarin gregoriGoil = new Slizarin("Gregori Goil", 50, 50, 50, 50, 50, 50, 50);

        Pyffendyi zaxariaSmit = new Pyffendyi("Zaxaria Smit", 50, 50, 50, 50, 50);
        Pyffendyi serdikDiggori = new Pyffendyi("Serdik Diggori", 50, 50, 50, 50, 50);
        Pyffendyi jastinFinchFletchli = new Pyffendyi("Jastin Finch-Fletchli ", 50, 50, 50, 50, 50);

        Kogtevran chjoyChang = new Kogtevran("Chjoy Chang", 50, 50, 50, 50, 50, 50);
        Kogtevran padmaPatil = new Kogtevran("Padma Patil", 50, 50, 50, 50, 50, 50);
        Kogtevran markysBelbi = new Kogtevran("Markys Belbi", 50, 50, 50, 50, 50, 50);

        System.out.println(harryPotter.toString());
        System.out.println(chjoyChang.toString());
        harryPotter.comparisonGriff(ronaldWeasley);
        System.out.println();
        harryPotter.comparisonHog(dracoMalfoy);
        System.out.println();
        padmaPatil.comparisonKog(markysBelbi);

    }
}
