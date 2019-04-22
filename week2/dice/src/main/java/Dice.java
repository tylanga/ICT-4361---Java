package com.tylanga.week2.dice;
import java.util.Random;
// ICT 4361
// Author: Tyler Thompson
// Filename: Dice.java

/*

Answers for HW Question:
1) Yes, I noticed 6 came up more often than the other numbers.

2) I do not know why 6 is coming up more often than the other numbers. I presume the Random function introduces bias in the
way that it is randomly generating the number. After some research, I found SecureRandom may be a better option?


*/

public class Dice {

    // private int four = 4;
    // private int seven = 17;

    // create random number object
    private Random randomNumber = new Random();

    private int numberShowing;

    // generating random number
    public int roll() {
        numberShowing = randomNumber.nextInt(6) + 1;
        return getNumberShowing();
    }

    public int getNumberShowing() {
        return numberShowing;
    }

    public static void main(String[] args) {

        Dice theDice = new Dice();

        int MAX_ROLL = 10000;

        int roll1 = 0;
        int roll2 = 0;
        int roll3 = 0;
        int roll4 = 0;
        int roll5 = 0;
        int roll6 = 0;
        int totalRolls = 0;

        for (int i = 0; i < MAX_ROLL; i++) {
            if (theDice.roll() == 1) {
                roll1 += 1;
                totalRolls += 1;
            } else if (theDice.roll() == 2) {
                roll2 += 1;
                totalRolls += 1;
            } else if (theDice.roll() == 3) {
                roll3 += 1;
                totalRolls += 1;
            } else if (theDice.roll() == 4) {
                roll4 += 1;
                totalRolls += 1;
            } else if (theDice.roll() == 5) {
                roll5 += 1;
                totalRolls += 1;
            } else if (theDice.roll() == 6) {
                roll6 += 1;
                totalRolls += 1;
            } else {
                System.out.println(theDice.roll());
                totalRolls += 1;
            }

        }

        // Printing the random Number
        System.out.println(17 / 4);
        System.out.println("The die rolled a 1 : " + roll1 + " times");
        System.out.println("The die rolled a 2 : " + roll2 + " times");
        System.out.println("The die rolled a 3 : " + roll3 + " times");
        System.out.println("The die rolled a 4 : " + roll4 + " times");
        System.out.println("The die rolled a 5 : " + roll5+ " times");
        System.out.println("The die rolled a 6 : " + roll6 + " times");
        System.out.println("The die rolled a total of : " + totalRolls + " times");



    }
}
