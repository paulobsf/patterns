package me.pauloferreira.patterns.strategy;

public class Main {
    public static void main(String[] args) {
        Traveller mary = new Traveller("Mary", new WalkStrategy());
        mary.travel("Archway", "Clerkenwell");

        Traveller john = new Traveller("John", new FlyStrategy());
        john.travel("London", "Porto");
    }
}
