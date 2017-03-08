package nl.agp.exam.language_enhancements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests the different allowed input for switches.
 */
class SwitchStatementTest {
  SwitchStatement switchStatement = new SwitchStatement();

  @Test
  void switchUsingString() {
    assertEquals("one", switchStatement.switchUsingString("one"));
    assertEquals("One", switchStatement.switchUsingString("One"));
    assertEquals("default", switchStatement.switchUsingString("uno"));
    assertEquals("tada or tado", switchStatement.switchUsingString("tada"));
    assertEquals("tada or tado", switchStatement.switchUsingString("tado"));
  }

  @Test
  void switchUsingBinaryLiterals() {
    assertEquals("0b101", switchStatement.switchUsingBinaryLiterals(5));
  }

  @Test
  void switchUsingNumericLiterals() {

  }

}