package LoanApplication;

public class Manager {
	static long acn=398100000l;
	static Account createAccount(String n,int i,long ph,int b){
		Account.rateOfInterest=4;
		Account ac= new Account();
		ac.name=n;
		ac.id=i;
		ac.phoneNumber=ph;
		ac.accountNo=acn++;
		ac.balance=b;
		return ac;
		
	}

}
