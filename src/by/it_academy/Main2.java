package by.it_academy;

import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        Random random = new Random();
        int b = random.nextInt(1500);
        if (b % 10 == 7) {
            System.out.println("Число " + b + " заканчивается на 7");
        } else {
            System.out.println("Число " + b + " не заканчивается на 7");
        }
    }
}