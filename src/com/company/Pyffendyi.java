package com.company;

public class Pyffendyi extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Pyffendyi(String name, int hardworking, int loyal, int honest, int abilityPower, int transgressionDistance) {
        super(name, abilityPower, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;

    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    private int ability() {
        return honest + hardworking + loyal;
    }

    @Override
    public String toString() {
        return "Pyffendyi{" + getName() +
                ", hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest +
                ", getAbilityPower=" + getAbilityPower() +
                ", getTransgressionDistance " + getTransgressionDistance() +
                '}';
    }

    public void comparisonPyff(Pyffendyi stydent) {
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