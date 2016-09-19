package edu.stanford.entities;

import java.util.List;

/**
 * Created by mamtasibbal on 8/19/16.
 */
public class Professor extends Employee {
    private String level;
    private List<Course> courses;

    public Professor(int id,
                     double salary,
                     String firstName,
                     String lastName,
                     int age,
                     Department department,
                     String level,
                     List<Course> courses) {
        super(id, salary, firstName, lastName, age, department);
        this.level = level;
        this.courses = courses;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
