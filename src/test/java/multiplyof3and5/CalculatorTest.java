package multiplyof3and5;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void init(){
        calculator = new Calculator();
    }

    @Test
    public void shouldReturn3from5 (){
        //given
        int input = 5;

        //when
        int result = calculator.calculate(input);

        //then
        assertThat(result,is(3));
    }

    @Test
    public void shouldReturn14from7 (){
        //given
        int input = 7;

        //when
        int result = calculator.calculate(input);

        //then
        assertThat(result,is(14));
    }

    @Test
    public void shouldReturn23from10 (){
        //given
        int input = 10;

        //when
        int result = calculator.calculate(input);

        //then
        assertThat(result,is(23));
    }

    @Test
    public void shouldReturn60from16 (){
        //given
        int input = 16;

        //when
        int result = calculator.calculate(input);

        //then
        assertThat(result,is(60));
    }

    @Test
    public void shouldReturn45from15 (){
        //given
        int input = 15;

        //when
        int result = calculator.calculate(input);

        //then
        assertThat(result,is(45));
    }


}
