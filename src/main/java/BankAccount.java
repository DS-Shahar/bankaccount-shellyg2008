
public class BankAccount {
	private int balance = 0;
	private int minBalance = -5000;
	private String owner;

	public int getBalance() {
		return balance;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public String setOwner() {
		return owner;
	}

	public int getminBalance() {
		return minBalance;
	}

	public int setBalance(int num) {
		if (num > minBalance) {
			balance = num;
		}
		return balance;
	}
	/*accepts only balance above min_balance */
	public BankAccount(int balance,int minBalance,String owner) {
		this.balance=balance;
		this.minBalance=minBalance;
		this.owner=owner;
	}

	public void deposite(int money) {
		balance+=money;
	}
	
	public String toString() {
	String s="balance of "+ owner +" : "+ balance;	
	return s;	
	}
	
	public boolean withdraw(int money) {
		boolean flag=true;
		if(balance-money>minBalance) {
			balance=balance-money;
		}
		else {
			flag=false;
		}
		return flag;
	}
	
	

	public boolean transfer(BankAccount target, int amount) {
		boolean flag=true;
		if(balance-amount>=minBalance) {
		balance=balance-amount;
		target.balance=target.balance+amount;
		}
		else {
			flag=false;
		}
		return flag;
		
		
		
	}
	
}

