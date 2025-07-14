package com.example.cipher;

public class CaesarCipher implements Cipher{
    private char[] alphabet;

    public CaesarCipher(char[] alphabet) {
        this.alphabet = alphabet;
    }

    @Override
    public String encrypt(String text, int shift) {
        return "";
    }

    @Override
    public String decrypt(String encryptedText, int shift) {
        return "";
    }
}
