package com.cryptoexamples.java.example;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Super secure encryption
 */
public class ExampleEncryption {
  private static final Logger LOGGER = Logger.getLogger(ExampleEncryption.class.getName());

  public static void main(String[] args) {
    String plainText = "The quick brown fox jumps over the lazy dog!";

    String ciphertext = encrypt(plainText);
    String decryptedCipherText = decrypt(ciphertext);

    LOGGER.log(Level.INFO, () -> String.format("Decrypted and original plain text are the same: %b", decryptedCipherText.compareTo(plainText) == 0));
  }

  private static String encrypt(String plainText) {
    // implement here
    return "false";
  }

  private static String decrypt(String ciphertext) {
    // implement here
    return "false";
  }

}
