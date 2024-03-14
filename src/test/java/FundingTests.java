import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FundingTests
{

    private Funding funding = new Funding();

    @Test
    @DisplayName("successfully add funds into account")
    public void addFundsIntoAccount()
    {
        funding.fundAccount(10, 0);
    }

    @Test
    @DisplayName("Attempt to fund non-existing account")
    public void attemptToFundNonExistingAccount()
    {

    }

    @Test
    @DisplayName("Cant withdraw more than balance")
    public void attemptToWithdrawMoreThanBalance()
    {
        funding.fundAccount(0, 10);
    }
}
