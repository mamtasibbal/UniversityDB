package edu.stanford.database;

import edu.stanford.entities.Course;
import edu.stanford.entities.Department;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by mamtasibbal on 8/23/16.
 */
public class DBAccess {

    static List<Department> departments;
    static List<Course> courses;


    public static List<Department> createDepartments() {
        List<Department> departments = new ArrayList<Department>();

        departments.add(new Department(1, "Computer Science"));
        departments.add(new Department(2, "Mathematics"));
        departments.add(new Department(3, "Biology"));
        departments.add(new Department(4, "Physics"));

        return departments;
    }

    public static List<Course> createCourses() {
        //TODO: implement getCourses from the database later
        List<Course> courses = new ArrayList<Course>();

        Department csDept = new Department(1, "Computer Science");
        Department mathDept = new Department(2,"Mathematics");

        courses.add(new Course("CS101", "Introduction to Computer Science", "This is CS101 level course", csDept));
        courses.add(new Course("CS102", "Algorithms", "This is a basic algo class", csDept));

        courses.add(new Course("CS103", "Java", "This is a basic course in Java", csDept));
        courses.add(new Course("CS104", "Javascript", "This is intermediate course in Javascript", csDept));
        courses.add(new Course("MATH101", "Algebra", "This is intermediate course in Algebra", mathDept));
        courses.add(new Course("MATH102", "Calculus", "This is basic course in Calculus", mathDept));

        return courses;
    }


    public static void prepareDummyDB() {
        departments = createDepartments();
        System.out.println(departments);
    }

    public static void main(String[] args) {
        prepareDummyDB();
    }

}
