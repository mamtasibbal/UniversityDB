package edu.stanford.entities;

/**
 * Created by mamtasibbal on 8/19/16.
 */
public class Admin extends Employee {
    private String jobType;
    private String position;
    private Admin reportTo;

    public Admin(int id,
                 double salary,
                 String firstName,
                 String lastName,
                 int age,
                 Department department,
                 String jobType,
                 String position,
                 Admin reportTo) {
        super(id, salary, firstName, lastName, age, department);
        this.jobType = jobType;
        this.position = position;
        this.reportTo = reportTo;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public Admin getReportTo() {
        return reportTo;
    }

    public void setReportTo(Admin reportTo) {
        this.reportTo = reportTo;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition(String position) {
        return position;
    }
}
