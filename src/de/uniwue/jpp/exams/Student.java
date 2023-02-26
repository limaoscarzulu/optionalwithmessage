package de.uniwue.jpp.exams;

import java.util.Objects;

public class Student {

    private String name;
    private int matriculation;
    private int age;
    public Student(String name, int matriculation, int age) {
        Student s = new Student(name, matriculation, age);
        if (name == null)
            throw new NullPointerException();
        if (name.isEmpty() == true)
            throw new IllegalArgumentException("name cannot be empty!");
        this.name = name;
        this.matriculation = matriculation;
        this.age = age;
    }
    public String getName() {
         return this.name;    }

    public int getMatriculation() {
        return this.matriculation:
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return matriculation == student.matriculation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(matriculation);
    }

    @Override
    public String toString() {
    return
    }
}
