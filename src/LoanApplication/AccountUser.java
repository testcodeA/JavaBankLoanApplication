package LoanApplication;

public class AccountUser {
	public static void main(String[]args){
	Account samiksha=	Manager.createAccount("Samiksha", 123, 387923878732l, 500000);
	samiksha.details();
	samiksha.interest();
	
	Account pankaj= Manager.createAccount("Pankaj", 124,9898392982l, 60000);
	pankaj.details();
	pankaj.interest();
	
	Account ojasvi= Manager.createAccount("ojasvi",125,92898239l, 70000);
	ojasvi.details();
	ojasvi.interest();
	}

}
