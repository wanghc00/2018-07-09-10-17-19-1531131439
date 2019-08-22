package practice03;

public class Student extends Person {
    private int klass;
    
    public int getKlass() {
        return klass;
    }


    public void setKlass(int klass) {
        this.klass = klass;
    }


    public Student(String name, int age, int klass) {
        super(name, age);
        // TODO Auto-generated constructor stub
        this.klass=klass;
    }
    

    @Override
    public String introduce() {
        // TODO Auto-generated method stub
        //I am a Student. I am at Class 2.
        return "I am a Student. I am at Class "+klass+".";
    }
}
