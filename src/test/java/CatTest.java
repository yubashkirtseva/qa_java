import com.example.Cat;
import com.example.Feline;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class CatTest {

    private Feline feline;

    @Test
    public void getSoundReturnsValidValue() {
        Cat cat = new Cat(feline);
        String expected = "Мяу";
        String actual = cat.getSound();
        assertEquals(expected, actual);
    }
}

