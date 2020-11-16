import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest extends Main{
  
 @Test
 public void testNothing() {
 }

 @Test
 public void testSomething1() {
   int sum = 2+3;
   assertEquals(5, sum);
 }

 @Test
 public void testSomething2() {
    String a = "a";
    assertNotNull("new liefert null", new String());
 }

 @Test
 public void testSomething3() {
    assertTrue(3*7 > 4*5);
 }
}
