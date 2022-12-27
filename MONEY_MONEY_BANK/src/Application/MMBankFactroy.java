package Application;

import framework.BankFactroy;
import framework.CurrentAcc;
import framework.SavingAcc;

public class MMBankFactroy extends BankFactroy {
	@Override
	public SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		MMSavingAcc s=new MMSavingAcc(accNo,accNm,accBal,isSalaried);
		return s;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimited) {
		MMCurrentAcc c=new MMCurrentAcc(accNo,accNm,accBal,creditLimited);
		return c;
	}
}
