package Source_java;

public class TestOverloader{
	static double days = 3.14;
	static int years =  (int) days;
	static void make(){
		System.out.println("Conversion from double to integer "+years);
		System.out.println("When i went home");
	}
	float f = 2.34f;
	 public static void main(String[] args) {
		
		 Person p = new Person1();
		 p.name = "Edward Kagimu";
		 p.age = 28;
		 p.getName();
		 
		 System.out.println(p.name);
		 System.out.println(p.age);
		 
		 Person1 p1 = (Person1) p;
		 p1.hobbies();
		 p1.school();
		 
		 make();
		 
		 
		 
		 
	 }
   }

