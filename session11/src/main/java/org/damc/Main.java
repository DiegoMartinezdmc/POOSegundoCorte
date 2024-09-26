package org.damc;

import org.damc.dao.StudentDAO;
import org.damc.models.Student;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Sesion 24/09/24");
        Student student1 = new Student("22021200", "Diego", "Martinez", "dmartinezc@uamv.edi.ni", "77940555");
        Student student2 = new Student("18020069", "Kendrick", "Barrios", "kkbarrios@uamv.edu.ni", "82173333");
        Student student3 = new Student("23010302", "Regina", "Luna", "mrluna@uamv.edu.ni", "57790666");

        StudentDAO listEst = new StudentDAO();
        System.out.println("Adding students");
        listEst.create(student1);
        listEst.create(student2);
        listEst.create(student3);

        System.out.println("\nShowing students list");
        for (Student student: listEst.showList()){
            System.out.println(student);

    }

        System.out.println("\nAdd another student");
        Student jorge = new Student ("23021688", "Jorge", "Valle", "javalle@uamv.edu.ni", "66666666");
        listEst.create(jorge);

        System.out.println("\nShowing new students list");
        for (Student student: listEst.showList()){
            System.out.println(student);
        }

        System.out.println("\nDeleting third student from the list");
        listEst.delete("23010302");
        for (Student student: listEst.showList()){
            System.out.println(student);
        }
    }
}