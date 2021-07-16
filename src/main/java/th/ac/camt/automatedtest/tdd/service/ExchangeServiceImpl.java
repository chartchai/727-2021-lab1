package th.ac.camt.automatedtest.tdd.service;

public class ExchangeServiceImpl {
    public double exchange(CurrencyEnum source, CurrencyEnum target,double amount){
        double result = 0.00;
        if(source==CurrencyEnum.USD && target==CurrencyEnum.THB){
            result = amount*32.74;

        }if(source==CurrencyEnum.THB && target==CurrencyEnum.EURO){
            result = amount/38.65;
        }
        return result;
    }

}
