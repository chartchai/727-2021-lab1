package th.ac.camt.automatedtest.tdd.service;

public class Adder {
    public int add(int x,int y){

        int first = x;
        int second =y;
        int result = first + second;
        if (result < 0){
            return 0;
        }
        return result;
    }
}
