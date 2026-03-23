package OOPs;

//basic class & object code
class Student{
      String name;
    int age;

    void display(){
        System.out.println("Shreya");
        System.out.println(20);
    }
}

public class classObject {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.display();
    }
}

