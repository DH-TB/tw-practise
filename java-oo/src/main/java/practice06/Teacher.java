package practice06;

public class Teacher extends Person {

    private Integer klass;

    public Integer getKlass() {
        return klass;
    }

    public void setKlass(Integer klass) {
        this.klass = klass;
    }

    public Teacher(String name, Integer age) {
        super(name, age);
    }

    public Teacher(String name, Integer age, Integer klass) {
        super(name, age);
        this.klass = klass;
    }

    public String introduce(){
        String info;
        if(this.klass == null){
            info = "No Class.";
        }else {
            info = "Class "+this.klass+".";
        }
        return super.introduce() + " I am a Teacher. I teach "+info;
    }
}