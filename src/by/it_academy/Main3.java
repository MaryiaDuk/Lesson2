package by.it_academy;

import java.util.Random;

public class Main3 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(20) + 1;
        int b = random.nextInt(20) + 1;
        int r = random.nextInt(15) + 1;
        System.out.println(a + " " + b + " " + r);
        if (4 * r * r >= a * a + b * b) {
            System.out.println("Круг радиусом " + r + " может полностью закрыть прямоугольник");
        } else {
            System.out.println("Круг радиусом " + r + " не может полностью закрыть прямоугольник");
        }
    }
}