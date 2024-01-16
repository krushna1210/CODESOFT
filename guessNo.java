import java.util.*;

class guessNo
{
	static int userInput;
	static char ans;

	public static void main(String args[])
	{

		do{

		System.out.println("*************** NUMBER GAME ********************");
		//taking user input 
		guessNo g1=new guessNo();
		Scanner sc=new Scanner(System.in);
		boolean numT=false;
		while(!numT)
		{
		System.out.println("Enter the number within range 1 to 100 :");
		guessNo.userInput=sc.nextInt();
		if(userInput >= 1 && userInput<=100){
			numT=true;
			//input=input;
		}
		else{
			System.out.println("! Ohhh..... You enter wrong number.");
			}

		}
		



		//genrating random number
		Random obj=new Random();
		int max=100,min=1;
		int randomNum=obj.nextInt(max-min+1) +min;

		


		boolean camp=false;
		while(!camp)
		{
			if(randomNum==userInput)
			{
				System.out.println("Nice You guess correct Number !");
				camp=true;
			}
			else if(userInput<randomNum)
			{
				System.out.println("Too Small....");
				System.out.println("Choose Big Number: ");
				guessNo.userInput=sc.nextInt();
			}
			else
			{
				System.out.println("Too Big ....");
				System.out.println("Choose Small Number: ");
				guessNo.userInput=sc.nextInt();
			}
		}
				
		System.out.println("Do You want play game again(y/n): ");
		guessNo.ans=sc.next().charAt(0);
		}
		while(ans=='y' || ans=='Y');

		
		

	}
}

