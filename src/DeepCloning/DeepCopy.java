package DeepCloning;
public class DeepCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		System.out.println("Befour Change");
		
		Address add= new Address(411045, "Kolhapur");
		Student s= new Student(10, "Ram", add);
      Student clone = (Student) s.clone();
		System.out.println("Origin Object:"+s);
		System.out.println("Clone Object:"+clone);
		
		System.out.println(s.hashCode());
		System.out.println(clone.hashCode());
		
		System.out.println(s==clone);
		
		System.out.println("After Change");
		
		clone.add.city="Pune";
		System.out.println("Origin Object:"+s);
		System.out.println("Clone Object:"+clone);
		
		
		
		

	}

}
