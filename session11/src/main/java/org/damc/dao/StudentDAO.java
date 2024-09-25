package org.damc.dao;

import org.damc.interfaces.Operation;
import org.damc.models.Student;

import java.util.ArrayList;

public class StudentDAO implements Operation {


    @Override
    public void create(Object object) {
        try{
            Student student = (Student) object;
            list.add(student);
        }catch(Exception e){
            System.out.println( "Error: " + e.getMessage());
        }
    }

    @Override
    public ArrayList<Object> read() {
        return null;
    }

    @Override
    public ArrayList<Student> showList(){
        return list;
    }

    @Override
    public void update(Object object) {
        //Actualizar estudiante
        Student student = (Student) object;

        for(Student Student : list){
            if(Student.getCif().equals(student.getCif())){
                Student.setNames(student.getNames());
                Student.setLastNames(student.getLastNames());
                Student.setEmail(student.getEmail());
                Student.getPhone(student.getPhone());
                return;

            }

        }

    }

    @Override
    public void delete(String id) {

        for(Student student : list){
            if (student.getCif().equals(id)){
                showList().remove(student);
                return;
            }
        }

    }

    @Override
    public Object search(String value) {
        for(Student student : list){
            if(student.getCif().equals(value)) || student.getNames().equals(value){
                return student;
            }
        }
        return null;
    }

    @Override
    public Object search(String name) {
        return null;
    }


}
