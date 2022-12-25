import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    private Feline feline = new Feline();

    @Test
    public void eatMeatReturnsListOfFoodForFeline() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> expectedListOfFoodForFeline = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualListOfFoodForFeline = feline.eatMeat();
        assertEquals(expectedListOfFoodForFeline, actualListOfFoodForFeline);
    }

    @Test
    public void getFamilyReturnsFeline() {
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void getKittensWithoutArgumentReturnsKittensCount(){
        Mockito.when(feline.getKittens(1)).thenReturn(1);
        int expectedCount = 1;
        int actualCount = feline.getKittens();
        assertEquals(expectedCount, actualCount);
    }

}
