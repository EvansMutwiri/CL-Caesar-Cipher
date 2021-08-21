import models.Decrypt;
import models.Encrypt;

import java.util.Scanner;

public class App {

    public static void main(String[] args){

        boolean appRunning = true;

        while (appRunning){

            System.out.print("1. Encryption\n2. Decryption\nChoose(1,2 or 3 to exit): ");
            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();

            if (choice == 1){
                System.out.println("Encryption");
                in.nextLine();

                System.out.print("Enter text to encrypt: ");
                String text = in.nextLine();

                System.out.print("Enter key: ");  //<26
                int shift = in.nextInt();

                Encrypt newEncrypt = new Encrypt(text, shift);

                System.out.println("Success! \n Your encrypted message is :" + newEncrypt.encryptMessage(text, shift));

            } else if (choice == 2){
                System.out.println("Decryption");
                in.nextLine();

                System.out.print("Enter message to be decrypted: ");
                String text = in.nextLine();

                System.out.println("Enter key: ");
                int shift = in.nextInt();

                Decrypt newDecrypt = new Decrypt(text,shift);

                System.out.println("SUCCESS. \n Your encrypted message: " + newDecrypt.decryptedMessage(text, shift));

            } else if (choice == 3){
                System.out.println("Exit");
                appRunning=false;
            }else {
                System.out.println("Try again!");
            }
        }
    }
}