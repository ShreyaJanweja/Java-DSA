// this file has class & object + constructor + access modifiers question 
package OOPs;

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


//default constructor
class Student{
    String name;
    int age;

    Student(){
        name="Shreya";
        age=20;
    }

    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}
public class classObject {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }
}