import org.junit.Test;

public class MainClass
    {

    private int class_number = 20;
    private String class_string = "Hello, world";
    int a = 14;



    public int getLocalNumber() {
      return a;
    }


    public int getClassNumber(){
        return this.class_number;
    }

    public String getClassString(){
        return this.class_string;
    }
}