import java.util.Objects;
import java.util.Scanner;

public class CeaserCipher {

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
                String txt = in.nextLine();

                System.out.print("Enter key: ");  //<26
                int key = in.nextInt();

                String toEncrypt = "";

                for (int i = 0; i < txt.length(); i++) {

                    if ((int)txt.charAt(i) == 32){
                        toEncrypt += (char)32;

                    } else if ((int)txt.charAt(i) + key > 122){
                        int temp = ((int)txt.charAt(i) + key) - 122;
                        toEncrypt += (char)(96 + temp);

                    } else if ((int)txt.charAt(i) + key > 90 && (int)txt.charAt(i) < 96){
                        int temp = ((int)txt.charAt(i) + key) - 90;
                        toEncrypt += (char)(64+temp);

                    } else {
                        toEncrypt += (char)((int)txt.charAt(i) + key);

                    }
                }

                System.out.println(toEncrypt);
            } else if (choice == 2){
                System.out.println("Decryption");
                in.nextLine();

                System.out.print("Enter message to be decrypted: ");
                String encryptedText = in.nextLine();

                System.out.println("Enter key: ");
                int decryptKey = in.nextInt();

                String toDecrypt = "";

                for (int i = 0; i < encryptedText.length(); i++) {

                    if((int)encryptedText.charAt(i) == 32){
                        toDecrypt += (char)32;

                    } else if (((int)encryptedText.charAt(i) - decryptKey) < 97 && ((int)encryptedText.charAt(i) - decryptKey) > 90) {
                        int temp = ((int)encryptedText.charAt(i) - decryptKey) + 26;
                        toDecrypt += (char)temp;
                    } else if ((encryptedText.charAt(i) - decryptKey) < 65) {
                        int temp = ((int)encryptedText.charAt(i) - decryptKey) + 26;
                        toDecrypt += (char)temp;
                    } else {
                        toDecrypt += (char)((int)encryptedText.charAt(i) - decryptKey);
                    }

                }

                System.out.println(toDecrypt);

            } else if (choice == 3){
                System.out.println("Exit");
                appRunning=false;
            }
        }
    }
}