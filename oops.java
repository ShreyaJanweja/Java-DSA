// //1. create a class student class with:● name, rollNo ● Constructor ● Method display()
// class Student{
//     String name;
//     int roll;
    
//     Student(String name, int roll){
//         this.name = name;
//         this.roll = roll;
//     }
//     void display(){
//         System.out.println("Student name: "+name);
//         System.out.println("Roll no: "+roll);
//     }
// } 
// public class oops
// {
    
// 	public static void main(String[] args) {
// 	    Student s1 = new Student("Shreya",1527);
// 	    Student s2 = new Student("Sejal",1519);
// 	    s1.display();
// 	    s2.display();
// 	}
// }




// //2. Question 2 – Static Variable-Problem. Create a class Employee with:name,salary,static variable company.All employees belong to same company
// class Employee{
//     String name;
//     int salary;
//     static String company="Apple";
    
//     Employee(String name, int salary){
//         this.name=name;
//         this.salary=salary;
//     }
//     void display(){
//         System.out.println("Name: "+name);
//         System.out.println("salary: "+salary);
//         System.out.println("company: "+company);
//     }
// }
// public class oops{
//     public static void main(String args[]){
//         Employee e1 = new Employee("Shreya",10000000);
//         e1.display();
//     }
// }