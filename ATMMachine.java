package ATMMachine;

import java.util.Scanner;

class Atm{
	int Balance=2000;
	int PIN = 1234;
	public void Checkpin() {
		System.out.println("Welcome to ATM Mission");
		System.out.println("Enter Your pin: ");
		Scanner sc = new Scanner(System.in);
		int Atmpin = sc.nextInt();
		if(Atmpin==PIN) {
			menu();
			
		}
		else {
			System.out.println("Enter a Valid Pin");
		}
		}
	public void menu() {
		System.out.println("Enter Your Choice");
		System.out.println("1.Check Balane");
		System.out.println("2.Withdraw Money");
		System.out.println("3.Deposit Money");
		System.out.println("4.Exit");
		
		Scanner sc = new Scanner(System.in);
		int op = sc.nextInt();
		
		if(op==1) {
			CheckBalane();
			}
		else if(op==2) {
			WithdrawMoney();
			
		}
		else if(op==3) {
			DepositMoney();
		}
		else if(op==4){
			System.out.println("Thanking you");
		}
		else {
			System.out.println("Enter a valid choice");
		}
	}
	public void CheckBalane() {
		System.out.println("Balance: " + Balance);
		menu();
	}
	public void WithdrawMoney() {
		System.out.println("Enter Withdraw Amount");
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		if(amount>Balance) {
			System.out.println("Insufficient Balance");
		}
		else {
			Balance = Balance - amount;
			System.out.println("Money Withdraw Successful");
		}
		menu();
	}
		public void DepositMoney() {
		System.out.println("Enter the Amount: ");
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		Balance = Balance + amount;
		System.out.println("Money deposited Successfully");
		menu();
		}
		
    }
public class ATMMachine {
	public static void main(String[] args) {
		 Atm obj = new Atm();
		 obj.Checkpin();
		
	}
}

