package com.company;

/*

Hyppodrome 15
Add a winner definition.
In the Hippodrome class, we will do two methods:
public Horse getWinner () and public void printWinner ()
The getWinner method should return the horse that has run the longest distance.
The printWinner method displays the name of the winner in the form: Winner is <name>!
Example:
Winner is Lucky!

Requirements:
1. In the Hippodrome class, the getWinner method must be created without parameters.
2. In the Hippodrome class, the printWinner method must be created without parameters.
3. The getWinner method should return the horse that has run the greatest distance.
4. The printWinner method should display the name of the winner on the screen in the format specified in the task condition.

 */

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    static Hippodrome game;

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List horses) {
        this.horses = horses;
    }

    public void move() {
        horses.forEach(Horse::move);
    }

    public void print() {
        for (Horse horse : this.horses) {
            horse.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            this.move();
            this.print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public Horse getWinner(){
        double maxDistance = 0.0;
        for (Horse horse : this.horses){
            if (horse.getDistance()>maxDistance){
                maxDistance = horse.getDistance();
            }
        }
        Horse horse = null;
        for (Horse hors : this.horses){
            if (hors.getDistance()==maxDistance){
                horse = hors;
                break;
            }
        }
        return horse;
    }

    public void printWinner(){
        Horse horse = getWinner();
        System.out.println("Winner is " + horse.getName() + "!");
    }


    public static void main(String[] args) {
        List<Horse> horseList = new ArrayList<>();
        horseList.add(new Horse("Horse1", 3, 0));
        horseList.add(new Horse("Horse2", 3, 0));
        horseList.add(new Horse("Horse3", 3, 0));
        game = new Hippodrome(horseList);
        game.run();
    }
}
