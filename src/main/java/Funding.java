import pojo.FundingPojo;
import static org.junit.jupiter.api.Assertions.*;

public class Funding
{
    private FundingPojo fundingPojo;

    public void fundAccount(int deposit, int withdraw)
    {
        fundingPojo = new FundingPojo(deposit, withdraw);
        assertBalance();
    }

    public boolean assertBalance()
    {
        if (fundingPojo.getWithdrawAmount() > fundingPojo.getBalance())
        {
            System.out.println("withdraw request exceeds balance");
            return false;
        }
        assertEquals(fundingPojo.getBalance(), fundingPojo.getDepositAmount() - fundingPojo.getWithdrawAmount());
        System.out.println("balance is : " + fundingPojo.getBalance());
        return true;
    }

}
