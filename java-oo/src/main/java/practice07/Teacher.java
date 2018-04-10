package practice07;

public class Teacher extends Person {

    private Klass klass;

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Teacher(String name, Integer age) {
        super(name, age);
    }

    public Teacher(String name, Integer age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public String introduceWith(Student student){
        String info;
        if(student.getKlass().equals(this.klass)){
            info = "I teach "+student.getName()+".";
        }
        else {
            info = "I don't teach "+student.getName()+".";
        }
        return super.introduce() + " I am a Teacher. "+info;
    }

    public String introduce(){
        String info;
        if(this.klass == null){
            info = "I teach No Class.";
        }else {
            info = "I teach "+klass.getDisplayName()+".";
        }
        return super.introduce() + " I am a Teacher. "+info;
    }
}