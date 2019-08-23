package practice07;

public class Student extends Person {
    private Klass klass;

    public Klass getKlass() {
        return klass;
    }


    public void setKlass(Klass klass) {
        this.klass = klass;
    }


    public Student(String name, int age, Klass klass) {
        super(name, age);
        // TODO Auto-generated constructor stub
        this.klass=klass;
    }
    

    @Override
    public String introduce() {
        // TODO Auto-generated method stub
        return super.introduce()+" "+"I am a Student. I am at Class "+klass.getNumber()+".";
    }
}