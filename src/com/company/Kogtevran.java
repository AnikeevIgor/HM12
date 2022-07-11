package com.company;

public class Kogtevran extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creativity;


    public Kogtevran(String name, int smart, int wise, int witty, int creativity, int abilityPower, int transgressionDistance) {
        super(name, abilityPower, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;

    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    private int ability() {
        return smart + witty + wise + creativity;
    }

    @Override
    public String toString() {
        return "Kogtevran{" + getName() +
                ", smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", creativity=" + creativity +
                ", getAbilityPower=" + getAbilityPower() +
                ", getTransgressionDistance " + getTransgressionDistance() +
                '}';
    }

    public void comparisonKog(Kogtevran stydent) {
        int ability1 = ability();
        int ability2 = stydent.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучще студента %s, %d VS %d", getName(), stydent.getName(), ability1, ability2);
        } else if (ability1 < ability2) {
            System.out.printf("Студент %s лучще студента %s", stydent.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Студенты %s и %s по силе равны %d", stydent.getName(), getName(), ability2, ability1);
        }
    }
}

