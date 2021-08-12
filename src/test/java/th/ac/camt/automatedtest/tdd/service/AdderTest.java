package th.ac.camt.automatedtest.tdd.service;

import junitparams.naming.TestCaseName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.Matchers.*;
import junitparams.*;

import static junitparams.JUnitParamsRunner.*;



class AdderTest {
    @Test
    public void Add(){
    Adder adder = new Adder();
        assertThat(adder.Add(1,2),is(equalTo(3)));
        assertThat(adder.Add(-1,2),is(equalTo(1)));
        assertThat(adder.Add(0,2),is(equalTo(2 )));
        assertThat(adder.Add(2,2),is(equalTo(4 )));
        assertThat(adder.Add(-1,0),is(equalTo(0)));
        assertThat(adder.Add(0,0),is(equalTo(0)));
    }

    //update test case
    @Test
    @Parameters({"1,2" , "-1,2", "0,2" , "2,2" , "-1,0" , "0,0"})
    public void param_object(String... args){
        assertThat(args).isEqualTo(new String[]{("0")});
    }

    @Test
    @Parameters({"1,2", "2,2","2,6"})
    public void paramsInAnnotation(String x, Integer y) {

    }

    @Test
    @Parameters(method = "name01")
    public void ParamsWithVarargs(String... args) {
        assertThat(args).isEqualTo(new String[]{"A","B"});
    }
    private Object name01(){
        return new Object[]{
                new String[]{"A","B"}
        };
    }

    @Test
    @Parameters({ "value1, value2", "value3, value4" })
    @TestCaseName("[{index}] {method}: {params}")
    public void X1(String param1, String param2){}

    @Test
    @Parameters
    public void parama_in_default_method(String p1, Integer p2){}
    private Object parametersForParams_in_defaul_method(){
        return new Object[]{new Object[]{"A",1} , new Object[]{"B",2}};
    }
}