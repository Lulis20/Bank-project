package Bank;

public class Manager extends Employee {
/////////////////////////////////////////////////////////////////////////
	protected Manager(long cpf, String name, String birthday, String accountType) {
		super(cpf, name, birthday, accountType);
	}
/////////////////////////////////////////////////////////////////////////
	@Override
	public void withdrawMoney(double value) {

			if (this.getBalance() >=value+((value*0.5)/100) && this.getAccountType() == "cc") {
				this.balance -= value+((value*0.5)/100);
				System.out.println("Saque da CC efetuado");
				
			}else if (this.getBalance() >=value+((value*0.2)/100) && this.getAccountType() == "cp") {
				this.balance -= value+value+((value*0.2)/100);
				System.out.println("Saque da CP efetuado");
			}
		}
	
	@Override
	public String accountDetails() {
		return "Gerente [owner=" + this.name + " identification=" + this.identification + ", accountType=" + this.getAccountType() 
		+ ", balance=" + this.getBalance() + ", status="+ this.getStatus() + "]";
	}
/////////////////////////////////////////////////////////////////////////
}
