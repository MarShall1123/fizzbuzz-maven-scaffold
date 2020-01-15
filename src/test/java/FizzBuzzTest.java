import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {
    @ParameterizedTest
    @CsvSource({
            "1,'1'",
            "3,'Fizz'",
            "5,'Buzz'",
            "15,'FizzBuzz'"
    })

    void testPrint(int num,String aim){
        assertThat(new FizzBuzz(num).print(),is(aim));
    }

}
