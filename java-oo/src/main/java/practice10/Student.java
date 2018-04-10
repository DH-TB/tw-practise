package practice10;


public class Student extends Person {

    private Klass klass;


    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Student(Integer id, String name, Integer age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public String introduce() {
        if (this.equals(klass.getLeader())) {
            return super.introduce() + " I am a Student. I am Leader of " + klass.getDisplayName() + ".";

        }
        return super.introduce() + " I am a Student. I am at " + klass.getDisplayName() + ".";
    }
}
