/*
* Demo of class and object.
* Example: Bank Account 
*/

//Step-1 : Define Class Account
class Account{
	//Step-2 : Declare instance variable or fields and make it privates
	private String name;
	private int id;
	private double balance;
	private double money;
	
	//Step-3 : Define Non-Parameterized Constructor
	public Account() {
	
	}
	//Step-4 : Define Parameterized Constructor
	public Account(String name, int id, double balance) {
		
		this.name = name;
		this.id = id;
		this.balance = balance;
	}
	
	//Step-5: Generate getter and setter 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	//Step-6: Generate toString() method
	@Override
	public String toString() {
		return "Account [name=" + name + ", id=" + id + ", balance=" + balance + "]";
	}
	
	//Step-7 : Add user-defined method-> balanceInquery() 
	public void balanceInquery() {
		System.out.println( name + " Current Balance Is :: " + balance );
	}
	
	
	//Step-8 : Add user-defined method-> withdrawMoney()
	public String withdrawMoney() {
		return name + " Withdraw Money Successfully";
	}
	
}

public class AccountType {

	public static void main(String[] args) {
	//Step-9: Instantiate Objects Of class Account
		Account SBI = new Account("aditya",2211,7777777777.00);
		Account ICICI = new Account("Navi",1001,90000.00);
		
	//Step-10: Access Attributes And Methods Of Class Account
	
	//For Account SBI ::
	System.out.println(SBI.toString()); //Access toString Method
	SBI.balanceInquery();	 
	SBI.setMoney(5000); //Set money Raghab wants to withdraw
	
	System.out.println("Raghab Withdraw Money From SBI:: " + SBI.getMoney());
	System.out.println("Raghab Withdraw Money From SBI:: " + SBI.withdrawMoney());
	System.out.println("----------------------------------------------------------");
	
	//For Account ICICI ::
	System.out.println(ICICI.toString()); //Access toString Method
	ICICI.balanceInquery(); 
	ICICI.setMoney(1000); //Set money Navi want to withdraw 
	
	System.out.println("Navi Withdraw Money From ICICI:: " + ICICI.getMoney());
	System.out.println("Navi Withdraw Money From ICICI:: " + ICICI.withdrawMoney());
	System.out.println("----------------------------------------------------------");

	}

}
