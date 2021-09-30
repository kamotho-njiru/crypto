package models;

public class Decrypt {
    private int Key;
    private String Statement;
    private String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String lowercase = "abcdefghijklmnopqrstuvwxyz";
    private String special = "!#$%&'()*+,-./:;<=>?@[]^_`{|}~";
    private String numbers = "0123456789";
    private String decryptedMessage = "";

    public String Decrypt(String Statement, int Key) {

        if(Key>26){
            Key=Key%26;
        }else{
            Key = (Key%26)+26;
        }
        for(int i=0;i<Statement.length();i++) {
            char newCharacter = Statement.charAt(i);
            if (Character.isLetter(newCharacter)) {
                if (Character.isLowerCase(newCharacter)) {
                    char c = (char) (newCharacter - Key);
                    if (c < 'a') {
                        decryptedMessage = decryptedMessage + (char) (newCharacter + (26 - Key));
                    } else {
                        decryptedMessage = decryptedMessage + c;
                    }
                } else if(Character.isUpperCase(newCharacter)) {
                    char c = (char) (newCharacter + Key);
                    if (c < 'A'){
                        decryptedMessage = decryptedMessage + (char) (newCharacter + (26 - Key));
                    } else {
                        decryptedMessage = decryptedMessage + c;
                    }
                }
                else{
                    decryptedMessage = decryptedMessage + newCharacter;
                }
            }

        }

        return decryptedMessage;
    }
    public int getKey() {
        return this.Key;
    }
    public String getStatement() {
        return this.Statement;
    }
}
