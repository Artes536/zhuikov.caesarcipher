package com.example.cipher;

public interface Cipher {

    String encrypt(String text, int shift);
    String decrypt(String encryptedText, int shift);

}
