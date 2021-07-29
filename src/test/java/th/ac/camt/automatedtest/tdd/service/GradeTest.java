package th.ac.camt.automatedtest.tdd.service;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class GradeTest {

    @Test
    public void testGrade(){
    ServiceGrade number = new ServiceGrade();
    assertThat(number.exchangeGrade(Grade.A,92),
            is(equalTo(Grade.A)));
    }
}