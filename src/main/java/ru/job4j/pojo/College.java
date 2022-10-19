package ru.job4j.pojo;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Igor Gatman");
        student.setGroup("CM-21");
        student.setDate("01.09.2018");

        System.out.println(student.getName() + " entered the " + student.getGroup() +
                " group on " + student.getDate());
    }
}
