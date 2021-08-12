package th.ac.camt.automatedtest.tdd.service;

public class Adder {
    public int Add(int x,int y){

        int first = x;
        int second =y;
        int result = first + second;
        if (result < 0){
            return 0;
        }
        return result;
    }

    public String ParamsWithVarargs(String... args){
        return null;
    }

}
