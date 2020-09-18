import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ApplesTest {

    private Apples a;

    @BeforeEach
    public void init() {
        a = new Apples();
    }

    @Test
    public void getAppleHappyTest (){
        Assertions.assertEquals ("apple pie", a.getApple());
    }

}