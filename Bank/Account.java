package Bank;

public abstract class Account extends Person implements AccountFunctions{
/////////////////////////////////////////////////////////////////////////
	protected String accountType;
	protected double balance;
	protected boolean status; //se estiver true, significa que a conta está aberta, se não, está fechada
/////////////////////////////////////////////////////////////////////////
	protected Account(long cpf, String name, String birthday, String accountType) {
		super(cpf, name, birthday);
		this.status = true;
		this.accountType = accountType;
	}
/////////////////////////////////////////////////////////////////////////
	public String getAccountType() {
		return accountType;
	}
	public double getBalance() {
		return balance;
	}
	protected void setBalance(double balance) {
		this.balance = balance;
	}
	public boolean getStatus() {
		return status;
	}
	protected void setStatus(boolean status) {
		this.status = status;
	}
/////////////////////////////////////////////////////////////////////////
	@Override
	public void closeAccount() {
		if (this.getStatus() == true && this.getBalance() == 0) {
			System.out.println("account successfully closed");
		}else if (this.getBalance() != 0) {
			System.out.println("\n account " + this.name + " cannot be closed, withdraw all your money first" );
		}else {
			System.out.println("Account not exist");
		}
	}
	@Override
	public void withdrawMoney(double value) {
		if (this.getBalance() >=value+((value*1)/100) && this.getAccountType() == "cc") {
			this.balance -= value+((value*1)/100);
			System.out.println("Saque da CC efetuado");
			
		}else if (this.getBalance() >=value+((value*0.5)/100) && this.getAccountType() == "cp") {
			this.balance -= value+((value*0.5)/100);
			System.out.println("Saque da CP efetuado");
		}
	}
	@Override
	public void cashDeposit(double money) {
		this.setBalance(money);
		System.out.println(this.getName()+" Depósito efetuado");
	}

	@Override
	public String accountDetails() {
		return "Account [owner=" + this.name + ", accountType=" 
				+ accountType + ", balance=" + balance + ", status="
				+ status + "]";
	}
/////////////////////////////////////////////////////////////////////////
}
