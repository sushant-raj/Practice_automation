package NonPremitive_TypeCasting;

public class Teacher {
    String name;
    String gender;
    int age;

    Teacher(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;

    }
}
    class Student extends Teacher{

        int rollNo;

        Student(String name, String gender, int age, int rollNo){
            super(name, gender, age);
            this.rollNo = rollNo;
        }

        public static void main(String[] args) {
            Student std = new Student("Sushant", "Male", 28, 007);
            Teacher tc = std;
            Student std1 = (Student)tc;
            System.out.println(std1.rollNo);



        }
    }

