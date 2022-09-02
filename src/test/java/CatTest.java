import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;
    @Test
    public void getFoodTest() throws Exception{
        Cat cat = new Cat(feline);
        cat.getFood();
        Mockito.verify(feline).eatMeat();
        //assertEquals(("Для хищника должен возвращаться список - Животные, Птицы, Рыба"), List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }

    @Test
    public void getSoundTest(){
        Cat cat = new Cat(feline);
        assertEquals("Должна возвращаться строка Мяу", "Мяу", cat.getSound());
    }
}
