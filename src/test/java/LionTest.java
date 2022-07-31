import com.example.Lion;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();
    @Test
    public void ExceptionTest() throws Exception{
        exceptionRule.expect(Exception.class);
        exceptionRule.expectMessage("Используйте допустимые значения пола животного - самец или самка");
        Lion lion = new Lion("Некто");
    }
    @Mock
    Feline feline;

    @Test
    public void GetKittensTest(){
        Lion lion = new Lion(feline);
        lion.getKittens();
        Mockito.verify(feline).getKittens();
        //assertEquals("Должен возвращаться один котенок", 1, lion.getKittens());
    }

    @Test
    public void GetFoodTest() throws Exception{
        Lion lion = new Lion(feline);
        lion.getFood();
        Mockito.verify(feline).getFood();
        //assertEquals("Для хищника должен возвращаться список - Животные, Птицы, Рыба", List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}