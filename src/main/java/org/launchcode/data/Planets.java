package org.launchcode.data;

public enum Planets {
    MERCURY("mercury", 88, 4879),
    VENUS("venus", 225, 12104),
    EARTH("earth", 365, 12742),
    MARS("mars", 687, 6779),
    JUPITER("jupiter", 4333, 139820),
    SATURN("saturn", 10759, 116460),
    URANUS("uranus", 30687, 50724),
    NEPTUNE("neptune", 60200, 49244);

    private final String name;
    private final int yearLength;
    private final int diameter;

    Planets(String name, int yearLength, int diameter) {
        this.name = name;
        this.yearLength = yearLength;
        this.diameter = diameter;
    }

    public String getName() {
        return name;
    }

    public int getYearLength() {
        return yearLength;
    }

    public int getDiameter() {
        return diameter;
    }
}
