package Bank;

public class Central {

	public static void main(String[] args) {
		Client c = new Client(11122233344l, "Luh", "11/02/2000", "cc");
		Employee e = new  Employee(1112223444, "Lais", "11/05/1999", "cp");
		Manager m = new Manager(12346565, "Carlos", "25/08/1982", "cc");
		GeneralManager g = new GeneralManager(89856333356l, "Bruno", "23/06/1995", "cp");
		
		c.cashDeposit(500);
		e.cashDeposit(500);
		m.cashDeposit(500);
		g.cashDeposit(500);
		
		c.withdrawMoney(100);
		e.withdrawMoney(100);
		m.withdrawMoney(100);
		g.withdrawMoney(100);
		
		System.out.println(c.accountDetails());
		System.out.println(e.accountDetails());
		System.out.println(m.accountDetails());
		System.out.println(g.accountDetails());
		
		m.closeAccount();
		
		
		

	}

}
