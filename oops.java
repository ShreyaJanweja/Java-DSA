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



// //Question 3 – Constructor Overloading-Problem .Create a class Rectangle:Constructor with no parameters,Constructor with length & breadth,Method area()
// class Rectangle{
//     int length;
//     int breadth;
//     Rectangle(){
//         length=4;
//         breadth=4;
//     }
//     Rectangle(int length, int breadth){
//         this.length=length;
//         this.breadth=breadth;
//     }
//     int area(){
//         return length*breadth;
//     }
// }
// public class oops{
//     public static void main(String args[]){
//         Rectangle r1 = new Rectangle(2,2);
//         System.out.println(r1.area());
//         Rectangle r2 = new Rectangle();
//         System.out.println(r2.area());
//     }
// }



// //Question 4 – Single Inheritance-problem .Create:Class Animal,Class Dog extends Animal . Add methods and test inheritance
// class Animal{
//     void display1(){
//         System.out.println("Animal loves to eat");
//     }
// }
// class Dog extends Animal{
//     void display2(){
//         System.out.println("Dog");
//     }
// }
// public class oops{
//     public static void main(String args[]){
//         Dog d = new Dog();
//         d.display1();
//         d.display2();
//     }
// }
