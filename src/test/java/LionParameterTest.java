import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;



@RunWith(Parameterized.class)
public class LionParameterTest {
    private final String checkedSex;
    private final boolean expected;

    public LionParameterTest(String checkedSex, boolean expected) {
        this.checkedSex = checkedSex;
        this.expected = expected;
    }



    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void LionHasManeTest() throws Exception{
        Lion lion = new Lion(checkedSex);
        assertEquals(expected, lion.doesHaveMane());
    }

}

