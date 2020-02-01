package maven.com.maven_demo;
import java.util.*;
interface items{ //INTERFACE
	public void Choco();
	public void Sweets();
}
class Person{ //ENCAPSULATION
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		this.name=newName;
	}
}
public class Main extends newyr { //INHERITANCE
	void total_weight() { //ABSTRACT CLASS METHOD DEFINED
		Random rand=new Random();
		int num=rand.nextInt(100);
		System.out.println("Total Weight of gift is "+num);
	}
	public static void main(String[] args) {
		Person obj=new Person();
		System.out.println("My name is ");
		obj.setName("Vanam Dhanush");
		System.out.println(obj.getName());
		itemsClass ob1=new itemsClass();
		itemsClass ob2=new itemsClass();
		ob1.Choco();
		ob2.Sweets();
		Main ob=new Main(); 
		ob.total_weight(); 
	}
}
