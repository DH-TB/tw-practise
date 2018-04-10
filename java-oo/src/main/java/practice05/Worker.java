package practice05;

public class Worker extends Person {

    private Integer klass;

    public Integer getKlass() {
        return klass;
    }

    public void setKlass(Integer klass) {
        this.klass = klass;
    }

    public Worker(String name, Integer age) {
        super(name, age);
    }

    public String introduce() {
        return super.introduce() +  " I am a Worker. I have a job.";
    }
}

