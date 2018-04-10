package practice10;

import java.util.Objects;

public class Person {

    private String name;
    private Integer age;
    private Integer id;

    public Person() {
    }

    public Person(Integer id,String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }

    public String getName() {
        return name;
    }


    public Integer getAge() {
        return age;
    }


    public String introduce() {
        return "My name is " + this.name + ". I am " + this.age + " years old.";
    }
}
