import static org.junit.Assert.*;
import org.junit.Test;

public class LoginScreenTest {
	
	@Test
	public void testSuccessfulLogin() {
		LoginScreen loginscreen = new LoginScreen();
		assertTrue(loginscreen.login("john", "password123"));

	}
	
	@Test
	public void testFailedLogin() {
		LoginScreen loginscreen = new LoginScreen();
		assertFalse(loginscreen.login("john", "wrongpassword"));

	}
	
	@Test
	public void testAddUser() {
		LoginScreen loginscreen = new LoginScreen();
		loginscreen.addUser("testuser", "testpassword");
		assertTrue(loginscreen.login("testuser", "testpassword"));

	}

}
