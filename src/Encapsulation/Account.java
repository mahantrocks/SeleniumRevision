package Encapsulation;

public class Account {
	
	//Hiding the security data from the outside class
	
	private String AccountHolder;
	private int Age;
	private double balance;
	
    public static void main(String[] args) {
		Account ac = new Account();
		ac.setAge(30);
		ac.setAccountHolder("Mahant Madiwal");
		ac.setBalance(100.00);
		
		System.out.println(" Account Holder Name is : "+ac.getAccountHolder());
		System.out.println(" Account Holder Age : "+ac.getAge());
	    System.out.println(" Account Holder Balance : "+ac.getBalance());
		
		

	}
	
	public String getAccountHolder() {
		return AccountHolder;
	}

	public int getAge() {
		return Age;
	}

	public double getBalance() {
		return balance;
	}

	public void setAccountHolder(String accountHolder) {
		AccountHolder = accountHolder;
	}

	public void setAge(int age) {
		Age = age;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	
	
	}
		
	


