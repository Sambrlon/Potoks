package main.java.edu.GroupsCops.models;

public class Student {
    private String studentName;
    private int studentId;

    // Конструктор класса
    public Student(String studentName, int studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }

    // Геттеры и сеттеры для полей
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    // Другие методы, если необходимо
}
