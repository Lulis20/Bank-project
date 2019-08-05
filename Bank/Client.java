package Bank;

public class Client extends Account{
/////////////////////////////////////////////////////////////////////////
	protected Client(long cpf, String name, String birthday, String accountType) {
		super(cpf, name, birthday, accountType);

	}
/////////////////////////////////////////////////////////////////////////
	@Override
	public String accountDetails() {
		return "Cliente [owner=" + this.name + " identification=" + this.identification + ", accountType=" + this.getAccountType() 
		+ ", balance=" + this.getBalance() + ", status=" + this.getStatus() + "]";
	}
/////////////////////////////////////////////////////////////////////////
}
