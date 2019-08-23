package practice07;

public class Klass {
    private int number;
    private String displayName;
    /**
     * 
     */
    public Klass(int number) {
        // TODO Auto-generated constructor stub
        this.setNumber(number);
    }
    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }
    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }
    /**
     * @return
     */
    public String getDisplayName() {
        // TODO Auto-generated method stub
        return "Class "+this.number;
    }
}
