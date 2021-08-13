package th.ac.camt.automatedtest.tdd.service.Item;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import th.ac.camt.automatedtest.tdd.service.Grade;
import th.ac.camt.automatedtest.tdd.service.Item.exception.NullScoreException;
import th.ac.camt.automatedtest.tdd.service.ScoreGrading;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import static org.junit.jupiter.api.Assertions.*;

class calGradItemServiceTest {

    @Test
    void calGradItemTest() {
        calGradItemService cal = new calGradItemService();
        ScoreItem pii = new ScoreItem("Pii",10.0,200.0);
        assertThat(cal.calGradItem(pii),is(equalTo(Grade.F)));
        ScoreItem kong = new ScoreItem("Kong",98.0,100.0);
        assertThat(cal.calGradItem(kong),is(equalTo(Grade.A)));
        ScoreItem ploy = new ScoreItem("Ploy", 23.0, 30.0);
        assertThat(cal.calGradItem(ploy),is(equalTo(Grade.B)));
        ScoreItem arm = new ScoreItem("Arm", 10.0,15.0);
        assertThat(cal.calGradItem(arm),is(equalTo(Grade.C)));
        ScoreItem game = new ScoreItem("Game", 14.0, 25.0);
        assertThat(cal.calGradItem(game),is(equalTo(Grade.D)));

        Assertions.assertThrows(NullScoreException.class, ()->{
            calGradItemService exception = new calGradItemService();
            ScoreItem pii1 = new ScoreItem("Pii",null, 100.0);
            exception.calGradItem(pii1);
        });
    }
}