import java.util.Scanner;

public class ATM {

	
	float Balance;
	int pin=1234;
	
	public void checkpin() {
		System.out.println("Enter your pin : ");
		Scanner sc=new Scanner(System.in);
		int enterpin=sc.nextInt();
		
		if(enterpin==pin) {
			menu();
		}
		else {
			System.out.println("Enter a valid Pin");
		}
	}
	
	public void menu() {
		System.out.println("Enter your choice :");
		System.out.println("1. check Acount Balance");
		System.out.println("2.Winthdraw money");
		System.out.println("3. Deposite Money");
		System.out.println("4. Exit");
		
		Scanner sc=new Scanner(System.in);
		int opt=sc.nextInt();
		
		if(opt==1) {
			checkbanlance();
		}
		else if(opt==2) {
			Withdrawmoney();
		}
		else if(opt==3) {
			Depositemoney();
		}
		else if(opt==4) {
			System.out.println("Thank you for visiting");
		}
		else {
			System.out.println("Enter a valid choice");
		}
	}
	
	public void checkbanlance() {
		System.out.println("Balance :" +Balance);
		menu();
	}
	public void Withdrawmoney() {
		System.out.println("Enter Amount to withdraw");
		Scanner sc=new Scanner(System.in);
		float amount=sc.nextFloat();
		if(amount>Balance) {
			System.out.println("Insufficient Balance");
		}
		else {
			Balance=Balance-amount;
			System.out.println("Money Withdraw succesful");
		}
		menu();
		
	}
	
	public void Depositemoney() {
		System.out.println("Enter the Amount :");
		Scanner sc=new Scanner(System.in);
		float amount=sc.nextFloat();
		Balance=Balance+amount;
		System.out.println("Money deposited succesfully");
		
		menu();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM A=new ATM();
		A.checkpin();

	}

}
