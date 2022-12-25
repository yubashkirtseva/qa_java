import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParamTest {
    private final int kittenCount;
    private final int expectedCount;


    public FelineParamTest(int kittenCount, int expectedCount){
        this.kittenCount = kittenCount;
        this.expectedCount = expectedCount;
    }

    @Parameterized.Parameters
    public static Object[][] getSumData(){
        return new Object[][]{
                {0, 0},
                {2, 2},
                {100, 100}
        };
    }

    @Test
    public void getKittensReturnKittensCount(){
        Feline feline = new Feline();
        int actualCount = feline.getKittens(kittenCount);
        assertEquals(expectedCount, actualCount);
    }


}
