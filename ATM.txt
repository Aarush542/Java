import java.util.Scanner;

class Atm{
	int pin;
	int Balance;
	int deposit;
	void checkpin(int pin){

if(pin==1234)
{
	System.out.println("Correct Pin");
menu();
}

else{
	System.out.println("Incorrect Pin");
}

	}

	void menu()
	{
		System.out.println("Menu");
		System.out.println("1) Deposit");
		System.out.println("2) Check Balance");
		System.out.println("3) Withdrawl");
		System.out.println("4) Exit");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number from Menu");
		int a=sc.nextInt();
		if(a==1)
		{
			deposit();
		}
		else if(a==2)
		{
			checkbalance();
		}
		else if(a==3)
		{
			Withdrawl();
		}
		else if(a==4)
		{
			Exit();
		}
	}
	
	void deposit()
	{
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter amount to deposit");
	int deposit=sc.nextInt();
	Balance=Balance+deposit;
	System.out.println("Amount Deposited "+ Balance);
	System.out.println();
	menu();	
}

	
	void checkbalance()
	{
		
		System.out.println("Balance" + Balance);
	System.out.println();
	menu();
	}



void Withdrawl()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to Withdrwal");
		int Withdrawl=sc.nextInt();
		if(Balance>Withdrawl){
		Balance=Balance-Withdrawl;
		System.out.println("Amount Withdrwal "+ Withdrawl);
		System.out.println("Remaining Amount "+ Balance);
		menu();
		}	
		else{
			System.out.println("Insufficient Balnace");
			Withdrawl();
		}
	}

	void Exit()
	{
checkpin(pin);
	}

}
public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
System.out.println("Enter Pin");
int pin=sc.nextInt();
Atm k=new Atm();
k.checkpin(pin);
	}
}