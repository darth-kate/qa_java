import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTest {
    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        assertEquals("Метод должен возвращать строку Кошачьи", "Кошачьи", feline.getFamily());
    }

    @Test
    public void eatMeatTest() throws Exception{
        Feline feline = new Feline();
        assertEquals("Для хищника должен возвращаться список - Животные, Птицы, Рыба", List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getKittensTest(){
        Feline feline = new Feline();
        assertEquals("Должен возвращаться один котенок", 1, feline.getKittens());
    }

    @Test
    public void getKittensWithArgumentTest(){
        Feline feline = new Feline();
        assertEquals("Должно возвращаться три котенка", 3, feline.getKittens(3));
    }

    @Test
    public void getFoodTest() throws Exception{
        Feline feline = new Feline();
        assertEquals("Для хищника должен возвращаться список - Животные, Птицы, Рыба", List.of("Животные", "Птицы", "Рыба"), feline.getFood());
    }


}
