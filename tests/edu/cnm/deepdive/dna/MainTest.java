package edu.cnm.deepdive.dna;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

  private static final String TEST_ONE = "ATatCGcg";
  private static final String RESULT_ONE = "TAtaGCgc";

  private static final String TEST_TWO = "ggGTtAaCc";
  private static final String RESULT_TWO = "ccCAaTtGg";

  @Test
  void complement() {
    assertEquals(RESULT_ONE, Main.complement(TEST_ONE));
    assertEquals(RESULT_TWO, Main.complement(TEST_TWO));
  }
}