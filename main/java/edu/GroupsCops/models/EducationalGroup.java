package main.java.edu.GroupsCops.models;

import java.util.List;

public class EducationalGroup {
    private String groupName;
    private int groupNumber;
    private List<Student> students;

    // Конструктор класса
    public EducationalGroup(String groupName, int groupNumber, List<Student> students) {
        this.groupName = groupName;
        this.groupNumber = groupNumber;
        this.students = students;
    }

    // Геттеры и сеттеры для полей
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    // Метод для добавления студента в группу
    public void addStudent(Student student) {
        students.add(student);
    }

    // Метод для удаления студента из группы
    public void removeStudent(Student student) {
        students.remove(student);
    }
}
