import java.util.Scanner;

class Student {
   
    String name;
    int rollNo;
    
    Student(String name, int rollNo)
    {
        this.name = name;
        this.rollNo = rollNo;
    }
}

public class StudentClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String name1 = scanner.nextLine();
        int rollNo1 = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline character after nextInt()
        String name2 = scanner.nextLine();
        int rollNo2 = scanner.nextInt();

        Student student1 = new Student(name1, rollNo1);
        Student student2 = new Student(name2, rollNo2);

        System.out.println("Student Name: " + student1.name);
        System.out.println("Student Roll Number: " + student1.rollNo);
        System.out.println("Student Name: " + student2.name);
        System.out.println("Student Roll Number: " + student2.rollNo);
        
        scanner.close();
    }
    
}
