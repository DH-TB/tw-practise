package practice08;

import java.util.Objects;

public class Klass {

    private Integer number;
    private Student leader;

    public Klass(Integer number) {
        this.number = number;
    }
    public Klass(){

    }

    public Student getLeader() {
        return leader;
    }

    public Integer getNumber() {
        return number;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Klass klass = (Klass) o;
//        return number == klass.number;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Klass klass = (Klass) o;
        return Objects.equals(number, klass.number) &&
                Objects.equals(leader, klass.leader);
    }


    public String getDisplayName(){
        return "Class "+this.number;
    }

    public void assignLeader(Student student){
        this.leader = student;
    }
}
