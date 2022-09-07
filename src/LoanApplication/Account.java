package LoanApplication;

public class Account {
     String name;
     int id;
     long phoneNumber;
     static int rateOfInterest;
     long accountNo;
     int balance;
     
     void interest(){
    	 int rateInterest= (balance*rateOfInterest)/100;
    	 System.out.println("Rate of Interest on Loan is: "+rateInterest);
     }
     void details(){
    	 System.out.println("Name of Account Holder: "+name);
    	 System.out.println("ID of Account Holder: "+id);
    	 System.out.println("Phone Number: "+phoneNumber);
    	 System.out.println("Account Number: "+accountNo);
    	 System.out.println("Balance in Account holder's Account: "+balance);
     }
}
