package pojo;

import lombok.Data;

@Data
public class FundingPojo
{
    private int depositAmount;
    private int withdrawAmount;
    private int balance;

    public FundingPojo(int deposit, int withdraw) {
        this.depositAmount = deposit;
        this.withdrawAmount = withdraw;
        this.balance = deposit - withdraw;
    }
}
