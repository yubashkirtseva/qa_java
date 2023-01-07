import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    private Feline feline;

    public LionTest() throws Exception {
    }

    @Test
    public void getKittensReturnValidKittensCount() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int expectedCount = 1;
        int actualCount = lion.getKittens();
        assertEquals(expectedCount, actualCount);

    }

    @Test
    public void getFoodReturnsValidList() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = lion.getFood();
        assertEquals(expected, actual);
    }

    @Test
    public void constructorThrowsExceptionOnUnsupportedSex() {
        Exception exception = null;
        try {
            Lion lion = new Lion("Лев", feline);
        } catch (Exception ex) {
            exception = ex;
        }
        assertEquals("Используйте допустимые значения пола животного - самей или самка", exception.getMessage());

    }

}



