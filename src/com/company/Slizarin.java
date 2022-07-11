package com.company;

public class Slizarin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambiton;
    private int resourcefulness;
    private int lustForPower;

    public Slizarin(String name, int cunning, int determination, int ambiton, int resourcefulness, int lustForPower, int abilityPower,
                    int transgressionDistance) {
        super(name, abilityPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambiton = ambiton;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getAmbiton() {
        return ambiton;
    }

    public void setAmbiton(int ambiton) {
        this.ambiton = ambiton;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    private int ability() {
        return cunning + determination + ambiton + resourcefulness + lustForPower;
    }

    @Override
    public String toString() {
        return "Slizarin{" + getName() +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambiton=" + ambiton +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                ", getAbilityPower=" + getAbilityPower() +
                ", getTransgressionDistance " + getTransgressionDistance() +
                '}';
    }

    public void comparisonSliz(Slizarin stydent) {
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
