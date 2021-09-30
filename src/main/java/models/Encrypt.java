package models;

public class Encrypt {
    private int Key;
    private String Statement;
    private String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String lowercase = "abcdefghijklmnopqrstuvwxyz";
    private String special = "!#$%&'()*+,-./:;<=>?@[]^_`{|}~";
    private String numbers = "0123456789";
    private String encryptedMessage = "";


    public String Encrypt(String Statement, int Key) {
        this.Statement = Statement.toUpperCase();
        this.Key = Key;
        if(Key>26){
            Key=Key%26;
        }else{
            Key = (Key%26)+26;
        }
        for(int i=0;i<Statement.length();i++)
        {
            char newCharacter = Statement.charAt(i);
            if (Character.isLetter(newCharacter)){
                if (Character.isLowerCase(newCharacter)) {
                    char c = (char) (newCharacter + Key);
                    if (c > 'z') {
                        encryptedMessage = encryptedMessage + (char) (newCharacter - (26 - Key));
                    } else {
                        encryptedMessage = encryptedMessage + c;
                    }


                } else if(Character.isUpperCase(newCharacter)){
                    char c = (char) (newCharacter + Key);
                    if (c >'Z') {
                        encryptedMessage = encryptedMessage + (char) (newCharacter - (26 - Key));
                    } else {
                        encryptedMessage = encryptedMessage + c;
                    }
                }
                else{
                    encryptedMessage = encryptedMessage + newCharacter;
                }
            }
        }

        return encryptedMessage;
    }
    public int getKey() {
        return this.Key;
    }
    public String getStatement() {
        return this.Statement;
    }
}
