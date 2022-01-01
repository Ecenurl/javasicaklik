package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sıcaklık: ");
        int sicaklik = sc.nextInt();
        if (sicaklik < 5) {
            switch (sicaklik) {
                case 1:
                    ;
                case 2:
                    ;
                case 3:
                    ;
                case 4:
                    System.out.print("kayak Yapabilirisiniz");
                    break;
            }

        } else if (sicaklik >= 5 && sicaklik < 15) {
            switch (sicaklik) {
                case 5:
                    ;
                case 6:
                    ;
                case 7:
                    ;
                case 8:
                    ;
                case 9:
                    ;
                case 10:
                    ;
                case 11:
                    ;
                case 12:
                    ;
                case 13:
                    ;
                case 14:
                    ;
                case 15:
                    System.out.print("Sinemaya Gidebilirsiniz");
                    break;
            }
        } else if (sicaklik >= 15 && sicaklik < 25) {
            switch (sicaklik) {
                case 15:
                    ;
                case 16:
                    ;
                case 17:
                    ;
                case 18:
                    ;
                case 19:
                    ;
                case 20:
                    ;
                case 21:
                    ;
                case 22:
                    ;
                case 23:
                    ;
                case 24:
                    ;
                case 25:
                    System.out.print("Piknige Gidebilirsiniz");
                    break;
            }
        } else if (sicaklik > 25)
            System.out.print("Yüzmeye gidebilirsiniz.");
    }
}

