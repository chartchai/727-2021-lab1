package th.ac.camt.automatedtest.tdd.service;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.Matchers.*;
class AdderTest {
    @Test
    public void Test(){
    Adder adder = new Adder();
        assertThat(adder.add(1,2),is(equalTo(2)));
        assertThat(adder.add(-1,2),is(equalTo(0)));
        assertThat(adder.add(0,2),is(equalTo(2 )));
        assertThat(adder.add(2,2),is(equalTo(4 )));
        assertThat(adder.add(-1,0),is(equalTo(0)));
        assertThat(adder.add(0,0),is(equalTo(0)));
    }
}