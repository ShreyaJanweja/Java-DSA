// this file has class & object + constructor + access modifiers question 
// package OOPs;

// //basic class & object code
// class Student{
//       String name;
//     int age;

//     void display(){
//         System.out.println("Shreya");
//         System.out.println(20);
//     }
// }

// public class classObject {
//     public static void main(String[] args) {
//         Student obj = new Student();
//         obj.display();
//     }
// }



// // //default constructor
// class Student{
//     String name;
//     int age;

//     Student(){
//         name="Shreya";
//         age=20;
//     }

//     void display(){
//         System.out.println(name);
//         System.out.println(age);
//     }
// }
// public class classObject {
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.display();
//     }
// }



// // //parameterized constructor
// class Student{
//     String name;
//     int age;

//     Student(String name, int age){
//        this.name = name;
//        this.age = age;
//     }

//     void display(){
//         System.out.println(name);
//         System.out.println(age);
//     }
// }
// public class classObject {
//     public static void main(String[] args) {
//         Student s1 = new Student("Shreya",20);
//         Student s2= new Student("bb", 88);
//         s2.display();
//         s1.display();
//     }
// }



// //copy constructor
// class Student{
//     String name;
//     int age;

//     Student(String name, int age){
//        this.name = name;
//        this.age = age;
//     }

//     Student(Student s){
//         this.name = s.name;
//         this.age = s.age;
//     }

//     void display(){
//         System.out.println(name);
//         System.out.println(age);
//     }
// }
// public class classObject {
//     public static void main(String[] args) {
//         Student s1 = new Student("Shreya",20);
//         s1.display();
//     }
// }



// //constructor overloading
// class Student{
//     String name;
//     int age;

//     Student(){
//         name="Shreya";
//         age=20;
//     }

//     Student(String name, int age){
//        this.name = name;
//        this.age = age;
//     }

//     Student(Student s){
//         this.name = s.name;
//         this.age = s.age;
//     }

//     void display(){
//         System.out.println(name);
//         System.out.println(age);
//     }
// }
// public class classObject {
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         Student s2 = new Student("Srishti",19);
//         Student s3 = new Student(s1);
//         s1.display();
//         s2.display();
//         s3.display();
//     }
// }


// //use of this keyword
// class Student{
//     String name;
//     Student(){
//         this("Shreya");
//     }
//     Student(String name){
//         System.out.println(name);
//     }
// }
// public class classObject {
//     public static void main(String[] args) {
//         Student s1 = new Student();
//     }
    
// }