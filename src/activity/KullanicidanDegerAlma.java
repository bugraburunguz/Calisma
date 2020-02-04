package activity;

import data.UserDTO;

import java.util.ArrayList;
import java.util.Scanner;

public class KullanicidanDegerAlma {
    private static int userID;
    private String userName;
    private String userSurname;
    private int age;
    private String sex;

    public static void main(String[] args) {

        // kullanicidanDegerAl();
        kullaniciEkle();
    }

    public static void kullanicidanDegerAl() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        BugraIleOgreniyorum bugraIleOgreniyorum = new BugraIleOgreniyorum();
        bugraIleOgreniyorum.printMethodEasy1(name);
        input.close();
    }

    public static void kullaniciEkle() {
        ArrayList<UserDTO> userDTOList = new ArrayList<>();
        String userName = "Bugra";
        String userSurname = "Burunguz";
        int userInt = 1;
        int age = 17;

        userDTOList.add(new UserDTO(userInt, userName, userSurname, age));
        for (UserDTO userDTO : userDTOList) {
            System.out.print(userDTO.getUserList());
        }
    }
}
