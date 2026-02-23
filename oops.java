//1. create a class student class with:● name, rollNo ● Constructor ● Method display()
class Student{
    String name;
    int roll;
    
    Student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
    void display(){
        System.out.println("Student name: "+name);
        System.out.println("Roll no: "+roll);
    }
} 
public class oops
{
    
	public static void main(String[] args) {
	    Student s1 = new Student("Shreya",1527);
	    Student s2 = new Student("Sejal",1519);
	    s1.display();
	    s2.display();
	}
}