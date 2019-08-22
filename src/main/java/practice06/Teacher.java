package practice06;

public class Teacher extends Person{
private int klass;
    
    public int getKlass() {
        return klass;
    }


    public void setKlass(int klass) {
        this.klass = klass;
    }


    public Teacher(String name, int age, int klass) {
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
        if(klass!=0) {
            return super.introduce()+" "+"I am a Teacher. I teach Class "+klass+".";
        }else {
            return super.introduce()+" "+"I am a Teacher. I teach No Class.";
        }
        
    }
}
