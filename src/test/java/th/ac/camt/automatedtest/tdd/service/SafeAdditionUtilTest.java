package th.ac.camt.automatedtest.tdd.service;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import junitparams.naming.TestCaseName;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

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
    @Parameters({"88|A", "44|b"})
    @TestCaseName("[{index}] {method}: {params}")
    public void  TestGraedParaM(int score, String grade){
        ServiceGrade serviceGrade = new ServiceGrade();
        assertThat(serviceGrade.GradeCalculated(score),is(grade));
    }


    @Test
    @Parameters(method = "TestParam")
    public void testParam(int[] input,String expectedResult){
        ServiceGrade serviceGrade = new ServiceGrade();
        assertThat(serviceGrade.TotalGrade(input),is(expectedResult));
    }

    public Object TestParam(){
        return new Object[][]{
            {new int[]{39,78,98}, "A"},
            {new int[]{9,83,32}, "b"},
            {new int[]{3,71,11}, "c"}
        };
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
