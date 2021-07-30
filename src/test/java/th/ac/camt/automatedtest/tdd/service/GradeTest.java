package th.ac.camt.automatedtest.tdd.service;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class GradeTest {

    @Test
    public void testGrade(){
        ServiceGrade number = new ServiceGrade();
        assertThat(number.exchangeGrade(90 ),is(equalTo(Grade.A)));
        assertThat(number.exchangeGrade(85 ),is(equalTo(Grade.B)));
        assertThat(number.exchangeGrade(77 ),is(equalTo(Grade.C)));
        assertThat(number.exchangeGrade(69 ),is(equalTo(Grade.F)));
    }
}