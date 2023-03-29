package aop;

public class Student {
    private String nameSurname;
    private int course;
    private double averGrade;

    public Student(String nameSurname, int course, double averGrade) {
        this.nameSurname = nameSurname;
        this.course = course;
        this.averGrade = averGrade;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAverGrade() {
        return averGrade;
    }

    public void setAverGrade(double averGrade) {
        this.averGrade = averGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameSurname='" + nameSurname + '\'' +
                ", course=" + course +
                ", averGrade=" + averGrade +
                '}';
    }
}
