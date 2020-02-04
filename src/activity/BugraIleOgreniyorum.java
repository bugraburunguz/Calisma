package activity;

public class BugraIleOgreniyorum {

    public static int intSayi;
    static String stringIsim = "bugra";
    static boolean boolean1;

    public static void main(String[] args) {
        printMethodEasy();
        System.out.println("-----------");
        printMethodStringVal();
        System.out.println("-----------");
        printMethodIntToString();
        System.out.println("-----------");
        printMethodBooleanCheck();
        System.out.println("-----------");
    }

    static void printMethodEasy() {

        System.out.println("Merhaba millet");
    }

    static void printMethodStringVal() {

        stringIsim = "Buğra";
        System.out.println("Adınız:" + stringIsim);
    }

    static void printMethodIntToString() {

        String intToString = String.valueOf(intSayi);
        System.out.println("Sayi:" + intToString);
        int sum = intSayi + intSayi;
        System.out.println("Sayi:" + sum);
    }

    static void printMethodBooleanCheck() {
        String booleanToString = String.valueOf(boolean1);
        System.out.println("Boolean:" + booleanToString);
        System.out.println("Boolean1:" + boolean1);
    }

    public void printMethodEasy1(String name) {

        System.out.println(name);
    }
}
