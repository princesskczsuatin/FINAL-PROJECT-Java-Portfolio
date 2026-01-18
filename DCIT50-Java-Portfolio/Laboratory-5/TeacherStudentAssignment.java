public class TeacherStudentAssignment {
    public static void main(String[] args) {
        Student student1 = new Student("Princess", 18, "Female", 2025);
        Course subject1 = new Course("DCIT24", "Information Management");
        Course subject2 = new Course("COSC60B", "Digital Logic Design");

        Course[] teacherCourses = { subject1, subject2 };
        Teacher teacher1 = new Teacher("Sir Prince", 30, "Male", "Computer Science", teacherCourses);

        System.out.println("===== TEACHER DETAILS =====");
        teacher1.displayTeacher();
        System.out.println("---------------------------");
        System.out.println("===== STUDENT DETAILS =====");
        student1.displayStudent();
        System.out.println("---------------------------");
        System.out.println("===== COURSE DETAILS =====");
        subject1.displayCourse();
    }
}
class Person {
   String name;
   int age;
   String gender;
    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

class Student extends Person {
    int studentId;

    Student(String name, int age, String gender, int studentId) {
        super(name, age, gender);
        this.studentId = studentId;
    }

    void displayStudent() {
        displayInfo();
        System.out.println("Student ID: " + studentId);
    }
}

class Course {
    String code;
    String title;

    Course(String code, String title) {
        this.code = code;
        this.title = title;
    }

    void displayCourse() {
        System.out.println("Course Code: " + code);
        System.out.println("Course Title: " + title);
    }
}

class Teacher extends Person {
    String department;
    Course[] subjects;

    Teacher(String name, int age, String gender, String department, Course[] subjects) {
        super(name, age, gender);
        this.department = department;
        this.subjects = subjects;
    }

    void displayTeacher() {
        displayInfo();
        System.out.println("Department: " + department);
        System.out.println("Subjects Handled:");
        if (subjects != null && subjects.length > 0) {
            for (Course sub : subjects) {
                sub.displayCourse();
            }
        } else {
            System.out.println("No courses assigned.");
        }
    }
}
