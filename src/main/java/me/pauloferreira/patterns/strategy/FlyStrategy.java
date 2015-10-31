package me.pauloferreira.patterns.strategy;

public class FlyStrategy implements TravelStrategy {
    @Override public void travel(String origin, String destination) {
        System.out.println("Flying origin = [" + origin + "], destination = [" + destination + "]");
    }
}
