package com.example.cipher;

public class CaesarCipher implements Cipher {
    private char[] alphabet;

    public CaesarCipher(char[] alphabet) {
        this.alphabet = alphabet;
    }

    @Override
    public String encrypt(String text, int shift) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : text.toCharArray()) {
            stringBuilder.append(encryptChar(c, shift));
        }
        return stringBuilder.toString();
    }

    @Override
    public String decrypt(String encryptedText, int shift) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : encryptedText.toCharArray()){
            stringBuilder.append(decryptChar(c,shift));
        }
        return stringBuilder.toString();
    }

    private char encryptChar(char symbol, int shift) {
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == symbol) {
                int newIndex = (i + shift) % alphabet.length;
                return alphabet[newIndex];
            }
        }
        return symbol;
    }
    private char decryptChar(char symbol, int shift) {
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == symbol) {
                int newIndex = (i - shift) % alphabet.length;
                return alphabet[newIndex];
            }
        }
        return symbol;
    }
}
