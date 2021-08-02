    import java.util.*;

    public class App {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            boolean appRunning = true;

            while (appRunning){

                System.out.println("Do you want to encrypt or decrypt text or exit to quit app?: ");
                String choiceInput = in.nextLine();
                String choice = choiceInput.toLowerCase();

                if (choice.equals("encrypt")){
                    System.out.println("Enter text to encript: ");
                    String textInput = in.nextLine();
                    //          String text = "qwertyuiopasdfghjklzxcvbnm";

                    char [] textAsLetters = textInput.toCharArray();
                    System.out.println("Enter key: ");
                    String keyString = in.nextLine();
                    int key = Integer.parseInt(keyString);

                    for (char letter : textAsLetters){
                        letter += key;
                        System.out.print(letter);
                    }
                } else if(choice.equals("decrypt")) {
                    System.out.println("Enter text to decript: ");
                    String text = in.nextLine();

                    char [] textAsLetters = text.toCharArray();
                    System.out.println("Enter key: ");
                    String keyString = in.nextLine();
                    int key = Integer.parseInt(keyString);

                    for (char letter : textAsLetters){
                        letter -= key;
                        System.out.print(letter);
                    }
                } else if (choice.equals("exit")){
                    appRunning = false;
                } else {
                    System.out.println("TRY AGAIN");
                }
            }

        }
    }