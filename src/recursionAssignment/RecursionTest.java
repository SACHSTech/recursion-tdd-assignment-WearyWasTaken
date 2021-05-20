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
    
    // add more tests
    
    @After
    public void afterTest(){
      // some steps to perform after tests are run
    }
    
    
}
