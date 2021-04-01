package ro.unibuc.lab7.io.exercises.ex2.services;

import ro.unibuc.lab7.io.exercises.ex2.dto.Student;

public interface StudentService {

    Student save(Student student);

    void delete(Student student);
}
