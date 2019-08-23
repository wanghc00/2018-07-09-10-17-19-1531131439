package practice07;

public class Teacher extends Person{
    
private Klass klass;
    
    public Klass getKlass() {
        return klass;
    }


    public void setKlass(Klass klass) {
        this.klass = klass;
    }


    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        // TODO Auto-generated constructor stub
        this.klass=klass;
    }
    

    public Teacher(String name, int age) {
        // TODO Auto-generated constructor stub
        super(name, age);
    }


    @Override
    public String introduce() {
        // TODO Auto-generated method stub
        if(klass!=null) {
            return super.introduce()+" "+"I am a Teacher. I teach Class "+klass.getNumber()+".";
        }else {
            return super.introduce()+" "+"I am a Teacher. I teach No Class.";
        }
    }
    
    public String introduceWith(Student student) {
        if(student.getKlass().getNumber()==this.klass.getNumber()) {
            return super.introduce()+" "+"I am a Teacher. I teach "+student.name+".";
        }
        return super.introduce()+" "+"I am a Teacher. I don't teach "+student.name+".";
    }
}
