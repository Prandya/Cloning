package DeepCloning;
class Student implements Cloneable {
	int roll;
	String name;
	Address add;
	
	public Student() {
		super();
	}
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
		Student dummystd =(Student) super.clone();
		dummystd.add=(Address) this.add.clone();
		return dummystd;
	}
	
}

class Address implements Cloneable
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
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}