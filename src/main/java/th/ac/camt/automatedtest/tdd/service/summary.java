package th.ac.camt.automatedtest.tdd.service;

import static th.ac.camt.automatedtest.tdd.service.Adder.*;

public class summary {
    public int sum(int firstInput, int secondInput){
        int A =  firstInput;
        int B = secondInput;
        int result = A + B;
        if(result < 0){
            result = 0;
        }
        return result;
    }
}
