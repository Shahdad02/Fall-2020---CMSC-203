import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTester {
	
	 GradeBook gb1;

	  @Before
	  public void setUp() throws Exception {
		  gb1 = new GradeBook(5);
	    
		  gb1.addScore(50);
		  gb1.addScore(75);
	  }

	  @After
	  public void tearDown() throws Exception {
		  gb1 = null;
	  }

	  @Test
	  public void testSum() {
	    assertEquals(125, gb1.sum(), .0001);
	  }

	  @Test
	  public void testMinimum() {
	    assertEquals(50, gb1.minimum(), .001);
	  }

	  @Test
	  public void addScoreTest() {
	    assertTrue(gb1.toString().equals("50.0 75.0 "));
	    
	  }
	  
}
