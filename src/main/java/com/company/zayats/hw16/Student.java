package com.company.zayats.hw16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> marks = new ArrayList<>();

    public void checkStudents(List<Student> students) {
        students.removeIf(student -> student.averageScore() < 3);
        for (Student student : students) {
            student.course++;
        }
    }

    public void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.course == course) {
                System.out.println(student.name);
            }
        }
    }

    public double averageScore() {
        double result = 0;
        for (Integer mark : marks) {
            result += mark;
        }
        return result / marks.size();
    }

    public Student(String name, String group, int course, List<Integer> marks) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.marks = marks;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", marks=" + marks +
                '}';
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student = new Student();
        students.add(new Student("Maria", "CS-221V", 1, new ArrayList<>(Arrays.asList(3, 3, 3, 2))));
        students.add(new Student("Margarita", "CS-121B", 2, new ArrayList<>(Arrays.asList(5, 5, 4, 5))));
        students.add(new Student("Oleksii", "ITP-19-2", 3, new ArrayList<>(Arrays.asList(4, 4, 3, 3))));
        student.checkStudents(students);
        student.printStudents(students, 3);
        System.out.println(students);
    }
}
