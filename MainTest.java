import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest extends Main{
  
 @Test
 public void testNothing() {
 }

 @Test
 public void testSomething1() {
   int sum = 2+3;
   assertEquals(sum, 5);
 }

 @Test
 public void testSomething2() {
    String a = "a";
    assertNotNull(a);
 }

 @Test
 public void testSomething3() {
    assertTrue(3*7 > 4*5);
 }
}
