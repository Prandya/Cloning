package ShallowCloning;
public class ShallowCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		System.out.println("Befour Change");
		
		Address add= new Address(411045, "Kolhapur");
		Student s= new Student(10, "Ram", add);
		Student s2= (Student) s.clone();
		
		System.out.println("Origin Object:"+s);
		System.out.println("Clone Object:"+s2);
		
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s==s2);
		
		System.out.println("After Change");
		
		s2.add.city="Pune";
		System.out.println("Origin Object:"+s);
		System.out.println("Clone Object:"+s2);
		
		
	

	}

}
