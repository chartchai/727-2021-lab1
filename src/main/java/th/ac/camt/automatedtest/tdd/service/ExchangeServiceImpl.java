package th.ac.camt.automatedtest.tdd.service;

public class ExchangeServiceImpl {

    public double exchange(CurrencyEnum source, CurrencyEnum target,double amount){
        double result = 0.00;
        if(source==CurrencyEnum.USD && target==CurrencyEnum.THB){
            result = amount*32.74;
        }if(source==CurrencyEnum.THB && target==CurrencyEnum.EURO){
            result = amount/38.65;
        }if (source.equals(CurrencyEnum.THB) && target.equals(CurrencyEnum.USD)){
            result = amount/32.74;
        }if (source.equals(target)){
            result = amount;
        }if (source.equals(CurrencyEnum.EURO) && target.equals(CurrencyEnum.USD)){
            result = amount*1.18;
        }if (source.equals(CurrencyEnum.USD) && target.equals(CurrencyEnum.EURO)){
            result = amount*0.85;
        }

        return result;
    }


}
