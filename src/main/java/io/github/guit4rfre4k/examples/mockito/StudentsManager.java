package io.github.guit4rfre4k.examples.mockito;

import java.util.ArrayList;
import java.util.List;

public class StudentsManager {

    private List<MockitoStudent> students = new ArrayList<>();

    public void addStudent(MockitoStudent s) {
        students.add(s);
    }

    public void changeStudentsNames(String newName) {
        for (MockitoStudent student : students) {
            student.setName(newName);
        }
    }
}
