package by.it_academy;

import java.util.Random;

public class Main4 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(10000);
        int ten = a % 10;
        int hund = a % 100;
        if ((ten == 0) || ((5 <= ten) && (ten <= 9)) || ((hund >= 11) && (hund <= 14)))
            System.out.println(a + " Рублей");
        else if (ten == 1) System.out.println(a + " Рубль");
        else if ((ten <= 4) && (ten >= 2)) System.out.println(a + " Рубля");
    }
}
