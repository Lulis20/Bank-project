package Bank;

public class Employee extends Account {
/////////////////////////////////////////////////////////////////////////
	protected Employee(long cpf, String name, String birthday, String accountType) {
		super(cpf, name, birthday, accountType);
	}
/////////////////////////////////////////////////////////////////////////
	@Override
	public void withdrawMoney(double value) {
		if (this.getBalance() >=value+((value*0.7)/100) && this.getAccountType() == "cc") {
			this.balance -= value+((value*0.7)/100);
			System.out.println("Saque da CC efetuado");
			
		}else if (this.getBalance() >=value+((value*0.4)/100) && this.getAccountType() == "cp") {
			this.balance -= value+((value*0.4)/100);
			System.out.println("Saque da CP efetuado");
		}
	}
	
	@Override
	public String accountDetails() {
		return "Funcionário [owner=" + this.name + " identification=" + this.identification + ", accountType=" + this.getAccountType() 
		+ ", balance=" + this.getBalance() + ", status="+ this.getStatus() + "]";
	}
/////////////////////////////////////////////////////////////////////////
}
