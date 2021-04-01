package ro.unibuc.lab7.io.exercises.ex2;


import ro.unibuc.lab7.io.exercises.ex2.dto.Student;
import ro.unibuc.lab7.io.exercises.ex2.services.*;

public class Main {

    /**
     * Log messages when call methods from Student Service
     */
    public static void main(String[] args) {

        StudentService studentService = new StudentServiceImpl();
        Student student = new Student("AB123");
        studentService.save(student);
        studentService.delete(student);
    }
}
