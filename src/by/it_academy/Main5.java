package by.it_academy;

public class Main5 {
    public static void main(String[] args) {
        String str1 = "? Everyone! ? Everything!##?, ?, ?!!!!!#########";
        String str2 = str1.replace("?", "Hello").replace("#", "");
        System.out.println(str2);
    }
}
