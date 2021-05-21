package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.Before;
import org.junit.After;

import recursionAssignment.Recursion;

public class RecursionTest{
    
    @Before
    public void beforeTest(){
      // some steps to perform before tests are run


    }
    
    /**
     * An initial test
     */
    @Test
    public void Test1(){
        // make assertion statement(s)
        // assertEquals(EXPECTEDVALUE, TESTVALUE);
        // assertTrue(TESTBOOLEAN);
        assertEquals(Recursion.count7(717), 2);

    }

    @Test
    public void Test2(){
    
      assertEquals(Recursion.count7(777777), 6);

    }

    @Test
    public void Test3(){
    
      assertEquals(Recursion.count7(0), 0);

    }

    @Test
    public void Test4(){
    
      assertEquals(Recursion.count7(1235123498), 0);

    }

    @Test
    public void Test5(){

      assertEquals(Recursion.changePi("xpix"), "x3.14x");

    }

    @Test
    public void Test6(){

      assertEquals(Recursion.changePi("xpixxpi"), "x3.14xx3.14");

    }

    @Test
    public void Test7(){

      assertEquals(Recursion.changePi("pixx"), "3.14xx");

    }

    @Test
    public void Test8(){

      assertEquals(Recursion.changePi("pipi"), "3.143.14");

    }

    @Test
    public void Test9(){

      assertEquals(Recursion.changePi("pip"), "3.14p");

    }

    @Test
    public void Test10(){

      assertEquals(Recursion.strCopies("catcowcat", "cat", 2), "true");

    }

    
    
    @After
    public void afterTest(){
      // some steps to perform after tests are run
    }
    
    
}
