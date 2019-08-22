package practice04;

public class Person {

    protected String name;
    protected int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Person(String name, int age) {
        // TODO Auto-generated constructor stub
        this.name=name;
        this.age=age;
    }
    public String introduce() {
        return "My name is "+name+". I am "+age+" years old.";
    }
}

