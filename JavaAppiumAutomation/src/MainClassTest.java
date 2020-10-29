import org.junit.Test;
public class MainClassTest extends MainClass
{

    @Test

    public void testGetLocalNumber(){
        this.getLocalNumber();
        if (a==14) {
            System.out.print("Тест 1 работает");
        }
        else {
            System.out.print("Тест 1 не работает");
        }
    }
@Test
    public void testGetClassNumber (){
        if (this.getClassNumber() > 45) {
            System.out.println("Тест не 2 работает");
        } else {
            System.out.println("Тест 2 работает");
        }
}
}
