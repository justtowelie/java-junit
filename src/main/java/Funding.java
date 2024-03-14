import pojo.FundingPojo;
import pojo.LoginPojo;

import static org.junit.jupiter.api.Assertions.*;

public class Funding
{
    private FundingPojo fundingPojo;
    private final Login login;

    public Funding(Login login) {
        this.login = login;
    }

    public boolean fundAccount(int deposit, int withdraw, String username)
    {
        if (!login.usernames.contains(username))
        {
            System.out.println("user does not exist");
            return false;
        }
        fundingPojo = new FundingPojo(deposit, withdraw);

        if (fundingPojo.getWithdrawAmount() > fundingPojo.getBalance())
        {
            System.out.println("withdraw request exceeds balance");
            return false;
        }
        assertBalance();
        return true;
    }

    public void assertBalance()
    {
        assertEquals(fundingPojo.getBalance(), fundingPojo.getDepositAmount() - fundingPojo.getWithdrawAmount());
        System.out.println("balance is : " + fundingPojo.getBalance());
    }

}
