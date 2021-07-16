package th.ac.camt.automatedtest.tdd.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
class ExchangeServiceImplTest {

    @Test
    public void testExchange(){
        ExchangeServiceImpl es = new ExchangeServiceImpl();
        assertThat(es.exchange(CurrencyEnum.USD,CurrencyEnum.THB,2),
                is(equalTo(65.48)));
        assertThat(es.exchange(CurrencyEnum.USD,CurrencyEnum.THB,4),
                is(equalTo(130.96)));

    }
}