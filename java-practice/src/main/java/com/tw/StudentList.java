package com.tw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentList {
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

//    public void addStudents(Student... student) {
//        this.students.addAll(Arrays.asList(student));
//    }

    public void addStudent(Student student) {
        this.students.add(student);
    }


}
