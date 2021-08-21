package models;

public class Decrypt {
    private String text;
    private int shift;

    public Decrypt(String text, int shift) {
        this.text = text;
        this.shift = shift;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }
    public String decryptedMessage(String text, int shift) {
        if(shift > 26){
            shift = shift % 26;
        } else if( shift < 0){
            shift = (shift%26) + 26;
        }

        String decryptedMessage = "";
        int length = text.length();
        for(int i = 0; i < length; i++){
            char ch = text.charAt(i);
            if(Character.isLetter(ch)){
                if(Character.isLowerCase(ch)){
                    char c = (char)(ch-shift);
                    if(c < 'a'){
                        decryptedMessage += (char) (ch +(26 - shift));
                    } else{
                        decryptedMessage += c;
                    }
                } else if (Character.isUpperCase(ch)){
                    char c = (char)(ch-shift);
                    if(c < 'A'){
                        decryptedMessage += (char) (ch +(26 - shift));
                    } else{
                        decryptedMessage += c;
                    }
                }
            }else{
                decryptedMessage += ch;
            }
        }
        return decryptedMessage;
    }
}
