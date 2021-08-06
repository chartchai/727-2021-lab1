package th.ac.camt.automatedtest.tdd.service.sample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import th.ac.camt.automatedtest.tdd.service.sample.exception.ScoreMoreThanMaxScoreException;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

class CalGradeServiceTest {

    @Test
    void calGrade() {
        CalGradeService gradeService = new CalGradeService();
        ScoreItem scoreItem = new ScoreItem("somchai",20,21);
        assertThat(gradeService.calGrade(scoreItem),is(equalTo(Grade.A)));
        scoreItem = new ScoreItem("p",10,200);
        assertThat(scoreItem,is(equalTo(Grade.F)));
    }
    @Test
    void scoreMoreThanMaxScoreExceptionTest(){

        Assertions.assertThrows(ScoreMoreThanMaxScoreException.class,()->{
            CalGradeService gradeService = new CalGradeService();
            ScoreItem scoreItem = new ScoreItem("somchai",25,21);
            gradeService.calGrade(scoreItem);
        });
    }
}