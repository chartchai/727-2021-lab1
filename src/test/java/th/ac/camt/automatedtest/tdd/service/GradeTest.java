package th.ac.camt.automatedtest.tdd.service;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class GradeTest {

    @Test
    public void testGrade(){
        ServiceGrade number = new ServiceGrade();
        assertThat(number.GradeCalculated(90 ),is(equalTo(Grade.A)));
        assertThat(number.GradeCalculated(85 ),is(equalTo(Grade.B)));
        assertThat(number.GradeCalculated(77 ),is(equalTo(Grade.C)));
        assertThat(number.GradeCalculated(69 ),is(equalTo(Grade.F)));

    }

    @Test
    public void testTotalGrade(){
        ServiceGrade total = new ServiceGrade();
        assertThat(total.TotalGrade(11,34,0,2),is(equalTo(Grade.F)));
        assertThat(total.TotalGrade(12,21,15,28),is(equalTo(Grade.B)));
        assertThat(total.TotalGrade(10,25,30,19),is(equalTo(Grade.A)));
        assertThat(total.TotalGrade(9,14,27,10),is(equalTo(Grade.C)));

        assertThat(total.TotalGrade(14,21,15,23),is(equalTo(Grade.B)));
        assertThat(total.TotalGrade(16,22,20,18),is(equalTo(Grade.A)));
    }
}