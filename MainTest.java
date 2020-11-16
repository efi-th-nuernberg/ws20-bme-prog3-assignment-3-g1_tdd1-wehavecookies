import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest extends Main{
  
 @Test
 public void testNothing() {
 }

 @Test
 public void testSomething1() {
   int sum = 2+3;
<<<<<<< HEAD
   assertEquals(5, sum);
=======
   assertEquals(sum, 5);
>>>>>>> 07b821f97ad1a39f87da486938c329b913e9f708
 }

 @Test
 public void testSomething2() {
    String a = "a";
<<<<<<< HEAD
    assertNotNull("new liefert null", new String());
=======
    assertNotNull(a);
>>>>>>> 07b821f97ad1a39f87da486938c329b913e9f708
 }

 @Test
 public void testSomething3() {
    assertTrue(3*7 > 4*5);
 }
}
