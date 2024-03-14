import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FundingTests
{

    private final Login login = new Login();
    private final Funding funding = new Funding(login);


    @Test
    @DisplayName("successfully add funds into account")
    public void addFundsIntoAccount()
    {
        assertTrue(login.createLogin("testUser", "Password!"));
        assertTrue(funding.fundAccount(10, 0, "testUser" ));
    }

    @Test
    @DisplayName("Attempt to fund non-existing account")
    public void attemptToFundNonExistingAccount()
    {
        funding.fundAccount(10, 0, "not_real" );
    }

    @Test
    @DisplayName("Cant withdraw more than balance")
    public void attemptToWithdrawMoreThanBalance()
    {
        assertTrue(login.createLogin("testUser", "Password!"));
        assertFalse(funding.fundAccount(0, 10, "testUser"));
    }
}
