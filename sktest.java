//javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar
//java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore
import static org.junit.Assert.*;
import org.junit.*;
public class sktest {
    @Test
    public void addition() {
        assertEquals(0, sk.add(0,0));
    }
}
