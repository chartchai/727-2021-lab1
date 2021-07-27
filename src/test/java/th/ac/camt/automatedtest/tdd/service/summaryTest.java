package th.ac.camt.automatedtest.tdd.service;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class summaryTest {
    //test cases created by Pee
    @Test
    public void testSummary(){
        summary es = new summary();
        assertThat(es.sum(1,2),is(equalTo(3)));
        assertThat(es.sum(-1,2),is(equalTo(1)));
        assertThat(es.sum(0,2),is(equalTo(2)));
        assertThat(es.sum(2,2),is(equalTo(4)));
        assertThat(es.sum(-1,0),is(equalTo(0)));
        assertThat(es.sum(0,0),is(equalTo(0)));
    }
}
