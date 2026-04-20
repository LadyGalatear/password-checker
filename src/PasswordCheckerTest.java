import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {

  @Test
  public void testDescribePasswordLengthEmptyString() {
    String password = "";
    PasswordChecker checker = new PasswordChecker(6, 12);
    String actual = checker.describePasswordLength(password);
    assertEquals("short", actual);
  }

}
