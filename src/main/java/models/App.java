package models;

import java.util.Scanner;

public class App {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        boolean programRunning = true;
        while (programRunning) {


            System.out.println("Kindly key in a word or a statement!!!");
            Scanner input1 = new Scanner(System.in);
            String input = input1.nextLine();
            System.out.println("Select either of the options below: \n 1.Encryption. \n 2.Decryption. \n 3.Exit.");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("----------------------------------");
                    System.out.println("Enter encryption shift key value");
                    Scanner number = new Scanner(System.in);
                    int key2 = number.nextInt();
                    Encrypt encrypt = new Encrypt();
                    System.out.println("Encrypted text is " + encrypt.Encrypt(input, key2));
                    break;
                case 2:
                    System.out.println("---------------------------------");
                    System.out.println("Enter decryption shift key value");
                    Scanner number1 = new Scanner(System.in);
                    int key3 = number1.nextInt();
                    Decrypt decrypt = new Decrypt();
                    System.out.println("Decrypted text is " + decrypt.Decrypt(input, key3));

                    break;
                case 3:
                    System.out.println("Thank you for using this application.");
                    System.exit(0);
                    programRunning = false;

                default:
                    System.out.println("Kindly select a valid input");
            }


        }
    }
}
