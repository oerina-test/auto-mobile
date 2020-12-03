import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetLocalNumber() {
        int res = this.getLocalNumber();
        assert res == 14;
    }

    @Test
    public void testGetClassNumber() {
        assert this.getClassNumber() > 45 : "Все верно";
    }


    @Test
    public void testGetClassString() {
        //  String h1 = "Hello";
        //assert this.getClassString().toLowerCase().contains(h1.toLowerCase());
        // assert this.getClassString().contains("Hello");
        assert this.getClassString().contains("Hello") | this.getClassString().contains("hello");
    }

}