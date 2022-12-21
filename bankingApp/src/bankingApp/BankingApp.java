package bankingApp;

public class BankingApp {

	public static void main(String[] args) {
		System.out.println("Banking App");

	}

}

class BankAccouint{
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	
	// -------- Constructor --------
	BankAccouint(String cname, String cid) {
		customerName = cname;
		customerId = cid;
	}
	
	void deposit(int amount) {
		if(amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	
	void withdraw(int amount) {
		if(amount != 0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}
	
	void getPreviousTransaction() {
		if(previousTransaction > 0) {
			System.out.println("Deposited: " + previousTransaction);
		}
		else if(previousTransaction < 0) {
			System.out.println("Withdrawal: " +Math.abs(previousTransaction));
		}
		else {
			System.out.println("No Transaction Made");
		}
	}
	
	void showMenu() {
		
		char option = '\0';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome " + customerName);
		System.out.println("ID: " +customerId);
		System.out.println("\n");
		
		System.out.println("A: Check Balance");
		System.out.println("B: Deposit");
		System.out.println("C: Withdrawal");
		System.out.println("D: Previous Transaction");
		System.out.println("E: Exit");
	}
}