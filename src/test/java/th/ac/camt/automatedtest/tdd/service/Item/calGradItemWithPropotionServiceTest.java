package th.ac.camt.automatedtest.tdd.service.Item;

import org.junit.jupiter.api.Test;
import th.ac.camt.automatedtest.tdd.service.Grade;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

class calGradItemWithPropotionServiceTest {

    @Test
    void calGradeProportion() {
        calGradItemWithPropotionService cal = new calGradItemWithPropotionService();
        List<PropotionScoreItem> list = new ArrayList();
        PropotionScoreItem pii = new PropotionScoreItem("Calculus",10.0,200.0, 3.0);
        PropotionScoreItem pii1 = new PropotionScoreItem("SE103",90.0,100.0, 2.0);
        PropotionScoreItem pii2 = new PropotionScoreItem("Software testing",15.0,30.0, 1.0);
        list.add(pii);
        list.add(pii1);
        list.add(pii2);
//        assertThat(cal.calGradeProportion(list),is(equalTo(ScoreItem("Pii"))));



    }
}