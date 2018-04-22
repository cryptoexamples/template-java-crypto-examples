package com.cryptoexamples.java.reverse;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Super secure String encryption
 */
public class ExampleStringEncryption {
  private static final Logger LOGGER = Logger.getLogger(ExampleStringEncryption.class.getName());

  public static void main(String[] args) {
    String plainText = "The quick brown fox jumps over the lazy dog!";

    String ciphertext = encrypt(plainText);
    String decryptedCipherText = decrypt(ciphertext);

    LOGGER.log(Level.INFO, () -> String.format("Decrypted and original plain text are the same: %b", decryptedCipherText.compareTo(plainText) == 0));
  }

  private static String encrypt(String plainText) {
    return new StringBuffer(plainText).reverse().toString();
  }

  private static String decrypt(String ciphertext) {
    return encrypt(ciphertext);
  }

}
