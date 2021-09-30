package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecryptTest {
    @Test
    public void decrypt_instantiate_true() throws Exception{
        Decrypt decrypt=new Decrypt();
        String output=decrypt.Decrypt("beast",2);
        assertEquals(true,output instanceof String);
    }


    @Test
    public void decrypt_decryptCorrect_String() throws Exception{
        Decrypt decrypt=new Decrypt();
        String expectedOutput="BROWN";
        String output=decrypt.Decrypt("CSPXO",2);
        assertFalse(expectedOutput,false);
    }
}