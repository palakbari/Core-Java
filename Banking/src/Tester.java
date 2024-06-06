import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int cnt=0,choice,acno;
			AccHolder test[]=new AccHolder[10];
			Scanner sc=new Scanner(System.in);
			while(true)
			{
				System.out.println("1. Account Details");
				System.out.println("2. Display");
				System.out.println("3. Deposit Amount");
				System.out.println("4. Withdraw Amount");
				System.out.println("5. Exit");
				System.out.println("Enter your choice:");
				choice=sc.nextInt();
				switch (choice){
						case 1: 
							System.out.println("Enter Account Number,Account Holde Name,Account Balance");
							test[cnt++]=new AccHolder(sc.nextInt(),sc.next(), sc.nextDouble());
							break;
						case 2:
							System.out.println("Display Details");
							for(int i=0;i<cnt;i++) {
								test[i].display();
							}
							System.out.println();
							break;
							
						case 3:
							System.out.println("Enter Account to be Deposited");
							acno=sc.nextInt();
							for(int i=0;i<cnt;i++)
								if(acno==test[i].getAc_no())
								{
									System.out.println("Amount Deposite:");
									test[i].deposit(sc.nextDouble());
								}
							break;
						case 4:
							System.out.println("Enter Account to be Withdrawn");
							acno=sc.nextInt();
							for(int i=0;i<cnt;i++)
								if(acno==test[i].getAc_no())
								{
									System.out.println("Amount Withdraw:");
									test[i].withdraw(sc.nextDouble());
								}
							break;
						case 5:
							System.exit(0);
				}
			}
		

	}

}
