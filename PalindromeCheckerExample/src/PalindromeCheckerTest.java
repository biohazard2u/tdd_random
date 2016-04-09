import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;


public class PalindromeCheckerTest extends TestCase {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	
	PalindromeChecker testObject;
	
	public void setUp(){
		testObject = new PalindromeChecker();
	}

	public void testCreatePalindromeTestObject() throws Exception {
		assertNotNull(testObject);
	}
	
	public void testSimplePalindromeMethod_YesPalindrome() throws Exception {
		assertTrue(testObject.isAPalindrome("Mom"));
	}
	
	public void testSimplePalindromeMethod_NotAPalindrome() throws Exception {
		assertFalse(testObject.isAPalindrome("Blah"));
	}
	
	public void testSimplePalindromeMethod_NotAPalindrome2() throws Exception {
		assertFalse(testObject.isAPalindrome("KSJHSFYBEJBEJBYGBFKJnjbfduvdf"));
	}
	
	public void testComlexPalindromeOnMethod() throws Exception {
		assertTrue(testObject.isAPalindrome("tattarrattat"));
	}
}
