package models;

public class Encrypt {
    private String text;
    private int shift;

    public Encrypt(String text, int shift) {
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
    public String encryptMessage(String text, int shift){
        if(shift > 26){
            shift = shift % 26;
        } else if( shift < 0){
            shift = (shift%26) + 26;
        }

        String encryptedMessage = "";
        int length = text.length();
        for(int i = 0; i < length; i++){
            char ch = text.charAt(i);
            if(Character.isLetter(ch)){
                if(Character.isLowerCase(ch)){
                    char c = (char)(ch+shift);
                    if(c > 'z'){
                        encryptedMessage += (char) (ch -(26 - shift));
                    } else{
                        encryptedMessage += c;
                    }
                } else if (Character.isUpperCase(ch)){
                    char c = (char)(ch+shift);
                    if(c > 'Z'){
                        encryptedMessage += (char) (ch -(26 - shift));
                    } else{
                        encryptedMessage += c;
                    }
                }
            }else{
                encryptedMessage += ch;
            }
        }
        return encryptedMessage;
    }

}
