package practice10;

import java.util.Objects;

public class Klass {

    private Integer number;
    private Student leader;

    public Klass(Integer number) {
        this.number = number;
    }

    public Student getLeader() {
        return leader;
    }

    public Integer getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Klass klass = (Klass) o;
        return number == klass.number;
    }

    @Override
    public int hashCode() {
        return number;
    }

    public String getDisplayName(){
        return "Class "+this.number;
    }

    public void assignLeader(Student student) {
        if (student.getKlass().equals(this)) {
            this.leader = student;
        } else {
            System.out.println("It is not one of us.");
        }
    }

    public void appendMember(Student student) {
        student.setKlass(this);
    }

    public boolean isIn(Student student) {
        return student.getKlass().equals(this);
    }
}


