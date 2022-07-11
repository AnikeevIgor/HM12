package com.company;

public class Griffindoer extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindoer(String name, int nobility, int honor, int bravery, int abilityPower, int transgressionDistance) {
        super(name, abilityPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;

    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    @Override
    public String toString() {
        return "Griffindoer{" + getName() +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                ", getAbilityPower=" + getAbilityPower() +
                ", getTransgressionDistance " + getTransgressionDistance() +
                '}';
    }

    private int ability() {
        return nobility + honor + bravery;
    }

    public void comparisonGriff(Griffindoer stydent) {
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
