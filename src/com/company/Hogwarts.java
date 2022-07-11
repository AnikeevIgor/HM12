package com.company;

public class Hogwarts {
    private String name;
    private int abilityPower;
    private int transgressionDistance;

    public Hogwarts(String name, int abilityPower, int transgressionDistance) {
        this.name = name;
        this.abilityPower = abilityPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAbilityPower() {
        return abilityPower;
    }

    public void setAbilityPower(int abilityPower) {
        this.abilityPower = abilityPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", abilityPower=" + abilityPower +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }

    private int jointAility() {
        return abilityPower + transgressionDistance;
    }

    public void comparisonHog(Hogwarts stydent) {
        int ability1 = jointAility();
        int ability2 = stydent.jointAility();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучще студента %s, %d VS %d", getName(), stydent.getName(), ability1, ability2);
        } else if (ability1 < ability2) {
            System.out.printf("Студент %s лучще студента %s", stydent.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Студенты %s и %s по силе равны %d", stydent.getName(), getName(), ability2, ability1);
        }
    }
}

