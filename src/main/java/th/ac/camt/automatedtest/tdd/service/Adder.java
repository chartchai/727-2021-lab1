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

    public int SafeAdd(int a , int b){
        long resulf = ((long) a + b );
        if (resulf > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }else if (resulf <  Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return (int) resulf;
    }

}
