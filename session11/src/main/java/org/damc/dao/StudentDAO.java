package org.damc.dao;

import org.damc.interfaces.Operation;
import org.damc.models.Student;

import java.util.ArrayList;

public class StudentDAO implements Operation {

    private final ArrayList<Student> list = new ArrayList<>();

    @Override
    public void create(Object object) {
        try {
            Student student = (Student) object;
            list.add(student);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public ArrayList<Object> read() {
        return new ArrayList<>(list);
    }

    // No @Override here since showList() is not in the Operation interface
    public ArrayList<Student> showList() {
        return list;
    }

    @Override
    public void update(Object object) {
        Student student = (Student) object;

        for (Student est : list) {
            if (est.getCif().equals(student.getCif())) {
                est.setNames(student.getNames());
                est.setLastNames(student.getLastNames());
                est.setEmail(student.getEmail());
                est.setPhone(student.getPhone());
                return;
            }
        }
    }

    @Override
    public void delete(String id) {
        for (Student est : list) {
            if (est.getCif().equals(id)) {
                list.remove(est);
                return;
            }
        }
    }

    @Override
    public Object search(String value) {
        for (Student est : list) {
            if (est.getCif().equals(value) || est.getNames().equals(value)) {
                return est;
            }
        }
        return null;
    }
}
