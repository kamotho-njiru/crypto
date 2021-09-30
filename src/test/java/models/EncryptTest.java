package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptTest {
    @Test
    public void encrypt_instantiate_true() throws Exception {
        Encrypt encrypt = new Encrypt();
        String output=encrypt.Encrypt("beast",2);
        assertEquals(true,encrypt instanceof Encrypt);

    }
    @Test
    public void encrypt_findKey_Integer() {
        Encrypt encrypt = new Encrypt();
        String output=encrypt.Encrypt("winner",5);
        assertEquals(5,encrypt.getKey());
    }

    @Test
    public void encrypt_encryptCorrect_String() throws Exception{
        Encrypt encrypt = new Encrypt();
        String expectedOutput="CSPXO";
        String output=encrypt.Encrypt("brown",1);
        assertFalse(expectedOutput,false);
    }
}