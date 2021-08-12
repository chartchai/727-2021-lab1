package th.ac.camt.automatedtest.tdd.service;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class SafeAdditionUtilTest {

    private  Adder serviceUnderTest  = new Adder();

    @Test
    @Parameters({
            "1,2",
            "2,2",
            "-1,0",
            "-9,-1",
            "0,0"
    })
    public void MthodName(int a,int b , int exprctedValud){
        assertEquals(exprctedValud , serviceUnderTest.SafeAdd(a, b));
    }

    @Test
    @Parameters(method = "parametersToTestAdd")
    public void whenWithNamedMethod_thenSafeAdd(
            int a, int b, int expectedValue) {

        assertEquals(expectedValue, serviceUnderTest.SafeAdd(a,b));
    }

    private Object[] parametersToTestAdd() {
        return new Object[] {
                new Object[] { 1, 2, 3 },
                new Object[] { -10, 30, 20 },
                new Object[] { Integer.MAX_VALUE, 2, Integer.MAX_VALUE },
                new Object[] { Integer.MIN_VALUE, -8, Integer.MIN_VALUE }
        };
    }
}
