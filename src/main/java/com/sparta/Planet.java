package com.sparta;

public enum Planet {
    MERCURY("Mercury", 58000000L, 330104000000000L),
    VENUS ("Venus", 67000000L, 4867320000000000L),
    EARTH ("Earth", 93000000L, 5972190000000000L),
    MARS ("Mars", 142000000, 641693000000000L),
    JUPITER ("Jupiter", 484000000L, 1898130000000000000L),
    SATURN ("Saturn", 886000000L, 568319000000000000L),
    URANUS("Uranus", 1800000000L, 86810300000000000L),
    NEPTUNE ("Neptune", 2800000000L,102410000000000000L);

    private final String planetName;

    private final long distanceFromSun;

    private final long mass;

    private Planet(String planetName, long distanceFromSun, long mass) {
        this.planetName = planetName;
        this.distanceFromSun = distanceFromSun;
        this.mass = mass;
    }

    public String getPlanetName() {
        return planetName;
    }

    public long getDistanceFromSun() {
        return distanceFromSun;
    }

    public long getMass() {
        return mass;
    }
}
