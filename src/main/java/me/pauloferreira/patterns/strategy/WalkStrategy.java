package me.pauloferreira.patterns.strategy;

public class WalkStrategy implements TravelStrategy {
    @Override public void travel(String origin, String destination) {
        System.out.println("Walking origin = [" + origin + "], destination = [" + destination + "]");
    }
}
