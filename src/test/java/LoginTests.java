import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoginTests  {


    private Login login = new Login();
    @Test
    @DisplayName("Successfully create user")
    public void successfulUserCreation()
    {
        assertTrue(login.createLogin("testUser", "testPassword"));
    }

    @Test
    @DisplayName("Username already exists")
    public void duplicateUserName()
    {
        assertTrue(login.createLogin("testUser", "testPassword"));
        // another call to trigger duplicate user
        assertFalse(login.createLogin("testUser", "testPassword"));
    }

    @Test
    @DisplayName("Valid password")
    public void checkPasswordIsValid()
    {
        assertTrue(login.createLogin("testUser", "Password!"));
    }

    @Test
    @DisplayName("Password rejected for no capital")
    public void noCapitalInPassword()
    {
        assertFalse(login.createLogin("testUser", "password"));
    }

    @Test
    @DisplayName("Password rejected for no special character")
    public void noSpecialCharacterInPassword()
    {
        assertFalse(login.createLogin("testUser", "Password"));
    }

}
