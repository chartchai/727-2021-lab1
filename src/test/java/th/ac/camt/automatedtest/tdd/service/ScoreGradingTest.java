package th.ac.camt.automatedtest.tdd.service;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ScoreGradingTest {
    @Test
    public void testGrading() {
        ScoreGrading grad = new ScoreGrading();
        assertThat(grad.grading(1),is(equalTo("F")));
        assertThat(grad.grading(51),is(equalTo("D")));
        assertThat(grad.grading(61),is(equalTo("C")));
        assertThat(grad.grading(71),is(equalTo("B")));
        assertThat(grad.grading(80),is(equalTo("A")));
        assertThat(grad.grading(100),is(equalTo("A")));
        assertThat(grad.grading(101),is(equalTo("?")));
        assertThat(grad.grading(-69),is(equalTo("?")));
    }
}
