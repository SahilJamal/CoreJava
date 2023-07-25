import java.util.*;
class Accounts//assignment
{
	 int accountNo,choice,decision,withdral,deposite; int accountBalance=100000000;
	 String accountType ;
	 public void AccountDetail() 
	 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter your accountType: \n1.saving \n2.current");
	 decision=sc.nextInt();
	 switch(decision)
	 {
	 case 1:
	 System.out.println("================SAVING Account===============");
	 System.out.println("Enter the accountNo: ");
	 accountNo=sc.nextInt();
	 break;
	 case 2:
	 System.out.println("================CURRENT Account===============");
	 System.out.println("Enter the accountNo: ");
	 accountNo=sc.nextInt();
	 break;
	 	 default:
		 System.out.println("Invalid input");
		 break;
	 }
	 }
	 public int deposite(int accountBalance,int deposite)
	 {
	 int d;
	 d=accountBalance+deposite;
	 return d;
	 }
	 public void display		()
	 {
	  Accounts obj=new Accounts();
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Do you want to \n1.withdral \n2.deposite ");
	  choice=sc.nextInt();
	  switch(choice)
	  {
		  case 1:
		  System.out.println("Enter the amount you want to withdral");
		  withdral=sc.nextInt();
		  int x=obj.withdraw(accountBalance,withdral);
		  	   System.out.println("The name of the Account Holder is xyz");
	   System.out.println("The Accountnumber is: "+accountNo);
	  if (decision==1)
	  {
	   System.out.println("Type of Account is: Saving");
	  }
	  else
	  {
		   System.out.println("Type of Account is: Current");
	  }
		  System.out.println("Account Balance: "+x);
		  break;
		  case 2:
		   System.out.println("Enter the amount you want to deposite");
		  deposite=sc.nextInt();
		  int y=obj.deposite(accountBalance,deposite);
		  	   System.out.println("The name of the Account Holder is xyz");
	   System.out.println("The Accountnumber is: "+accountNo);
	  if (decision==1)
	  {
	   System.out.println("Type of Account is: Saving");
	  }
	  else
	  {
		   System.out.println("Type of Account is: Current");
	  }
		  System.out.println("Account Balance: "+y);
		  break;
		  default:
		  System.out.println("Invalid input");
	  }
	 }
	 public int withdraw(int accountBalance, int withdral) 
	 {
	 int c;
	 c=accountBalance-withdral;
	 return c;
	 }
	 
	public static void main(String args[])
	{
	Accounts obj=new Accounts();
	obj.AccountDetail();
	obj.display();
	}
}