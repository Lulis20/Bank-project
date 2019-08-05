package Bank;

public abstract class Person {
/////////////////////////////////////////////////////////////////////////
	protected long identification;
	protected String name;
	protected String birthday;
/////////////////////////////////////////////////////////////////////////
	protected Person(long cpf, String name, String birthday) {
		
		this.identification = cpf;
		this.name = name;
		this.birthday = birthday;
	}
/////////////////////////////////////////////////////////////////////////
	public long getIdentification() {
		return identification;
	}

	public void setIdentification(long identification) {
		this.identification = identification;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
/////////////////////////////////////////////////////////////////////////
}
