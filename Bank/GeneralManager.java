package Bank;

public class GeneralManager extends Employee {
/////////////////////////////////////////////////////////////////////////
	protected GeneralManager(long cpf, String name, String birthday, String accountType) {
		super(cpf, name, birthday, accountType);
	}
/////////////////////////////////////////////////////////////////////////
	@Override
	public void withdrawMoney(double value) {
		if (this.getBalance() >= value) {
			if (this.getAccountType() == "cc") {
				this.balance -= value;
				System.out.println("Saque da CC efetuado");
			}else {
				this.balance -= value;
				System.out.println("Saque da CP efetuado");
			}
		}
	}
	@Override
	public String accountDetails() {
		return "Gerente Geral [owner=" + this.name + " identification=" + this.identification + ", accountType=" + this.getAccountType() 
		+ ", balance=" + this.getBalance() + ", status="+ this.getStatus() + "]";
	}
/////////////////////////////////////////////////////////////////////////
}
