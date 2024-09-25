package org.damc.models;

import java.util.Objects;

public class Student {

    private String cif;
    private String names;
    private String lastNames;
    private String email;
    private String phone;

    public Student() {
    }

    public Student(String cif, String names, String lastNames, String email, String phone) {
        this.cif = cif;
        this.names = names;
        this.lastNames = lastNames;
        this.email = email;
        this.phone = phone;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastNames() {
        return lastNames;
    }

    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "cif='" + cif + '\'' +
                ", names='" + names + '\'' +
                ", lastNames='" + lastNames + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return Objects.equals(cif, student.cif) && Objects.equals(names, student.names) && Objects.equals(lastNames, student.lastNames) && Objects.equals(email, student.email) && Objects.equals(phone, student.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cif, names, lastNames, email, phone);
    }

}
