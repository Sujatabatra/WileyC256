package bankMain;

import bankImpl.FDAcc;
import bankImpl.HousingLoanAcc;
import bankImpl.PersonalLoanAcc;
import bankImpl.SavingsAcc;

public class MyAccount {
	public static void main(String[] args) {
		
		SavingsAcc savingsAcc = new SavingsAcc(1234567890,"ABC XYZ",1000);
		FDAcc fdAcc = new FDAcc(1456321700,"DDA BBC",5000);
		PersonalLoanAcc personalLoanAcc = new PersonalLoanAcc(245632107,"VGG GFG",1000000);
		HousingLoanAcc housingLoanAcc = new HousingLoanAcc(232145612,"YYZ ZZY",10000);

		savingsAcc.displayAccInfo();
		System.out.println("-------------------------");
		fdAcc.displayAccInfo();
		System.out.println("-------------------------");
		personalLoanAcc.displayAccInfo();
		System.out.println("-------------------------");
		housingLoanAcc.displayAccInfo();
	}
}
