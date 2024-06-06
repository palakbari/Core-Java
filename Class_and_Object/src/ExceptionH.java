import java.util.Scanner;

class Account
{	
	int balance;
	int deposite()
	{
		System.out.println("Current Balance:");
		return balance;
	}
	
	int withdraw()
	{
		System.out.println("Current Balance:");
		return balance;
	}
}
class ExceptionH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account();
		int choice,amt,balance=0;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("1. Deposit Amount");
			System.out.println("2. Withdraw Amount");
			System.out.println("3. Exit");
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			switch (choice){	
					case 1:
						System.out.println("Enter Account to be Deposited");
						amt=sc.nextInt();
						balance = balance + amt;
						System.out.println(a.deposite()+balance);
						break;
					case 2:
						System.out.println("Enter Account to be Withdrawn");
						amt=sc.nextInt();
						try
						{
				            if (amt >= 15000)
				                System.out.println("Withdrawal amount exceeds the limit.");
				            else if (amt > balance)
				                System.out.println("Insufficient balance.");
				            else if (amt <= 0)
				                System.out.println("Withdrawal amount must be greater than zero.");
				            else 
				            {
				            	balance = balance - amt;
					           	System.out.println(a.withdraw()+balance);
				            }
						}
						catch(Exception e) 
						{
							System.out.println(e.getMessage());
						}
						System.out.println("Balance:"+balance);
						break;
					case 3:
						System.exit(0);
						break;
			}
		}
	}
}
