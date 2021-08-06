package th.ac.camt.automatedtest.tdd.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import th.ac.camt.automatedtest.tdd.service.Item.ScoreItem;
import th.ac.camt.automatedtest.tdd.service.Item.exception.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ScoreGradingTest {
//    @Test
//    public void testGrading() {
//        ScoreGrading grad = new ScoreGrading();
//        assertThat(grad.grading(1),is(equalTo("F")));
//        assertThat(grad.grading(51),is(equalTo("D")));
//        assertThat(grad.grading(61),is(equalTo("C")));
//        assertThat(grad.grading(71),is(equalTo("B")));
//        assertThat(grad.grading(80),is(equalTo("A")));
//        assertThat(grad.grading(100),is(equalTo("A")));
//        assertThat(grad.grading(101),is(equalTo("?")));
//        assertThat(grad.grading(-69),is(equalTo("?")));
//    }

//    @Test
//    public void testScoregrading(){
//        ScoreGrading gradM = new ScoreGrading();
//        assertThat(gradM.gradingMultiple(1,2,3),is(equalTo(Grade.F)));
//        assertThat(gradM.gradingMultiple(10,20,30),is(equalTo(Grade.D)));
//        assertThat(gradM.gradingMultiple(11,34,0,22),is(equalTo(Grade.C)));
//        assertThat(gradM.gradingMultiple(20,20,25,10),is(equalTo(Grade.B)));
//        assertThat(gradM.gradingMultiple(100,2),is(equalTo(Grade.A)));
//    }

    @Test
    public void gradingTest(){

        Assertions.assertThrows(NullScoreException.class, ()->{
            ScoreGrading exception = new ScoreGrading();
            ScoreItem pii = new ScoreItem("Pii",null, 100.0);
            exception.grading(pii);
        });
        Assertions.assertThrows(NullMaxScoreException.class, ()->{
            ScoreGrading exception = new ScoreGrading();
            ScoreItem pii = new ScoreItem("Pii",10.0, null);
            exception.grading(pii);
        });
        Assertions.assertThrows(MaxScoreIsZeroExecption.class, ()->{
            ScoreGrading exception = new ScoreGrading();
            ScoreItem pii = new ScoreItem("Pii",10.0, 0.0);
            exception.grading(pii);
        });
        Assertions.assertThrows(Over100Exception.class, ()->{
            ScoreGrading exception = new ScoreGrading();
            ScoreItem pii = new ScoreItem("Pii",105.0, 100.0);
            exception.grading(pii);
        });
        Assertions.assertThrows(ScoreLessThanZeroException.class, ()->{
            ScoreGrading exception = new ScoreGrading();
            ScoreItem pii = new ScoreItem("Pii",-10.0, 0.0);
            exception.grading(pii);
        });
        Assertions.assertThrows(ScoreMoreThanMaxScoreException.class, ()->{
            ScoreGrading exception = new ScoreGrading();
            ScoreItem pii = new ScoreItem("Pii",35.0, 32.0);
            exception.grading(pii);
        });
    }
}
