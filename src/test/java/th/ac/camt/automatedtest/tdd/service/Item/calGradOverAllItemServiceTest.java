package th.ac.camt.automatedtest.tdd.service.Item;

import org.junit.jupiter.api.Test;
import th.ac.camt.automatedtest.tdd.service.Grade;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

class calGradOverAllItemServiceTest {

    @Test
    void calGradOverAllItem() {
        calGradOverAllItemService cal = new calGradOverAllItemService();
        List<ScoreItem> list = new ArrayList<>();
        //pii = 5
        ScoreItem pii = new ScoreItem("Pii",10.0,200.0);
        //Kong = 90
        ScoreItem kong = new ScoreItem("Kong",90.0,100.0);
        //ploy = 50
        ScoreItem ploy = new ScoreItem("Ploy", 15.0, 30.0);
        list.add(pii);
        list.add(kong);
        list.add(ploy);
        //avg = 48.33333
        assertThat(cal.calGradOverAllItem(list),is(equalTo(Grade.F)));
    }
}