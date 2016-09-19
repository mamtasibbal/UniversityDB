package edu.stanford.entities;

/**
 * Created by mamtasibbal on 8/19/16.
 */
public class Course {
    private String number;
    private String title;
    private String description;
    private Department department;

    public Course(String number, String title, String description, Department department) {
        this.description = description;
        this.number = number;
        this.title = title;
        this.department = department;
    }

    public void setNumber(String num) {
        this.number = num;
    }

    public String getNumber() {
        return this.number;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Course {number="+number+", title=\'"+title+"\'}";
    }
}
