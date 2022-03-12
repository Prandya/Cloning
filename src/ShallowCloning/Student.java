package ShallowCloning;

class Student implements Cloneable {
	int roll;
	String name;
	Address add;
	public Student(int roll, String name, Address add) {
		super();
		this.roll = roll;
		this.name = name;
		this.add = add;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", add=" + add + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}

class Address
{
	int pin;
	String city;
	
	public Address(int pin, String city) {
		super();
		this.pin = pin;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + "]";
	}
	
	
}