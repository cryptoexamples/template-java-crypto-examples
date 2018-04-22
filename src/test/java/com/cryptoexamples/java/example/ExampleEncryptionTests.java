package com.cryptoexamples.java.example;

import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

/**
 * Test cases for the example examples/template
 */
public class ExampleEncryptionTests {
  private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private static final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

  @BeforeClass
  public static void setUp() {
    System.setOut(new PrintStream(outContent));
    System.setErr(new PrintStream(errContent));
  }

  @AfterClass
  public static void tearDown() {
    System.setOut(null);
    System.setErr(null);
  }

  @After
  public void resetOut() {
    outContent.reset();
    errContent.reset();
  }

  @Test
  public void testStringEncryptionMain() {
    ExampleEncryption.main(new String[1]);
    assertThat(errContent.toString(), containsString("Decrypted and original plain text are the same: true"));
  }

}
