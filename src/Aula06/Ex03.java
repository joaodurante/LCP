package Aula06;

import java.util.LinkedList;

public class Ex03 {
    LinkedList<Teacher> teachers = new LinkedList<Teacher>();

    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    public Teacher findTeacher(String reg_number) {
        for(Teacher i : teachers){
            if(i.getReg_number() == reg_number)
                return i;
        }
        return null;
    }

    public static void main(String[] args) {
        Ex03 reg = new Ex03();

        reg.addTeacher(new Teacher("Joao", "123"));
        reg.addTeacher(new Teacher("Maria", "321"));
        reg.addTeacher(new Teacher("Pedro", "231"));

        System.out.println(reg.findTeacher("123").name);
        System.out.println(reg.findTeacher("321").name);

    }
}
