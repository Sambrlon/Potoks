package main;

import main.java.edu.GroupsCops.models.EducationalGroup;
import main.java.edu.GroupsCops.models.Student;
import main.java.edu.GroupsCops.service.PotokService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем студентов
        Student student1 = new Student("Иванов", 1);
        Student student2 = new Student("Петров", 2);

        // Создаем учебные группы
        EducationalGroup group1 = new EducationalGroup("Группа 1", 101, new ArrayList<>());
        EducationalGroup group2 = new EducationalGroup("Группа 2", 102, new ArrayList<>());

        // Добавляем студентов в группы
        group1.addStudent(student1);
        group2.addStudent(student2);

        // Создаем список учебных групп
        List<EducationalGroup> educationalGroups = new ArrayList<>();
        educationalGroups.add(group1);
        educationalGroups.add(group2);

        // Сортируем группы по количеству студентов
        PotokService.sortEducationalGroups(educationalGroups);

        // Выводим результат
        for (EducationalGroup group : educationalGroups) {
            System.out.println("Количество студентов в группе " + group.getGroupName() + ": " + group.getStudents().size());
        }
    }
}
