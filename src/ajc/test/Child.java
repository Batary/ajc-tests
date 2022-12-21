package ajc.test;

public class Child extends Human {
	
	public String school = "école des Lilas";
	private Adult responsiblePerson;

	Child(String name) {
		super(name);
	}
	
	public void setResponsiblePerson(Adult responsiblePerson) {
		this.responsiblePerson = responsiblePerson;
	}
	
	public Adult getResponsiblePerson() {
		return responsiblePerson;
	}

	@Override
	public void print() {
		System.out.println(name + " : " + school);
	}
	
}
