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

        assertThat(es.exchange(CurrencyEnum.THB, CurrencyEnum.USD, 1 ),
                is(closeTo(0.031,0.001)));
        assertThat(es.exchange(CurrencyEnum.THB, CurrencyEnum.USD, 5 ),
                is(closeTo(0.152,0.001)));
        assertThat(es.exchange(CurrencyEnum.THB,CurrencyEnum.EURO,10),
                is(closeTo(0.26,0.01)));

    }


}