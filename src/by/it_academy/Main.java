package by.it_academy;

public class Main {
    public static void main(String[] args) {
        String str = "Крейсер \"Аврора\" назван в честь парусного фрегата \"Аврора\", прославившегося при обороне Петропавловска-Камчатского в годы Крымской войны.";
        int length = str.length();
        int lengthHalf = str.length() / 2;
        System.out.println("Длина строки: " + length);
        String s1 = str.substring(0, lengthHalf);
        String s2 = str.substring(lengthHalf);
        System.out.println(s1);
        System.out.println(s2);
    }
}
