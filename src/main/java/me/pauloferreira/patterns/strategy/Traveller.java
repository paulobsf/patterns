package me.pauloferreira.patterns.strategy;

public class Traveller {

    private final String name;
    private final TravelStrategy travelStrategy;

    public Traveller(String name, TravelStrategy travelStrategy) {
        this.name = name;
        this.travelStrategy = travelStrategy;
    }

    public void travel(String origin, String destination) {
        System.out.println(name);
        this.travelStrategy.travel(origin, destination);
    }
}
