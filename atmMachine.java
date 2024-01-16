//This code is not connected to database .In this we have set bank balance as default value using constructor.

import java.util.Scanner;

class userAccount
{	
	private static float amount;
	userAccount(float amount)
	{
		userAccount.amount=amount;
	}

	public static void setBalance(float amount)
	{
		userAccount.amount=amount;
	}
	public static float getBalance()
	{
		return userAccount.amount;
	}

}



public class atmMachine extends userAccount
{
	
	public  int choice;
	atmMachine(float amount)
	{
		super(amount);
	}
	
	public void ATM()
	{
	do
	{
		System.out.println("\n\n********** ATM MACHINE ***********");
		System.out.println("1. WithDrow Money. \n2.Deposit Money.\n3.Check Bank Balence. \n4.Exit.");
		Scanner sc=new Scanner(System.in);
		choice=sc.nextInt();
		float amount,userAmount;
		switch(choice)
		{
			case 1:
				amount=getBalance();
				System.out.print("Enter the amount : ");
				userAmount=sc.nextInt();
				withdrawMoney(amount,userAmount);
				break;
			case 2:
				System.out.print("Enter amount: ");
				userAmount=sc.nextInt();
				amount=getBalance();
				depositMoney(amount,userAmount);
				break;
			case 3:
				float bal=checkBalance();
				System.out.println("Remaining Balance: "+bal);
				break;
			case 4:
				int ans=choice;
				break;
			default:
				System.out.println("\n! please enter correct choice....");
		}

	      }while(choice!=4);
	}



	public static void withdrawMoney(float amount , float userAmount)
	{
		
		
		float rem=amount-userAmount;
		if(amount<userAmount)
		{
			System.out.println("\n Sorry..Your account has not much amount");
		}
		else if(userAmount<=amount)
		{
			System.out.println("\nPlease collect your cash....");
			float rem2=amount-userAmount;
			setBalance(rem2);
		}
		
	}


	public static void depositMoney(float amount,float userAmount)
	{
		amount+=userAmount;
		setBalance(amount);
		System.out.println("\nYou Money is succesfully deposit in your account..");
	}






	public static float checkBalance()
	{
		float remaining=getBalance();
		return remaining;
	}



	public static void main(String args[])
	{
		atmMachine obj=new atmMachine(5000);
		//userAccount obj1=new userAccount();
		
		obj.ATM();
	}
}











