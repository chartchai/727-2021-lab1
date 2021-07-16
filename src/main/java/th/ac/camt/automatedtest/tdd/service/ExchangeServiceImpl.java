package th.ac.camt.automatedtest.tdd.service;

public class ExchangeServiceImpl {

    public double exchange(CurrencyEnum source, CurrencyEnum target, double amount) {

        double exchangeRate = 0;
        switch (source) {
            case USD:
                switch (target) {
                    case USD:
                        exchangeRate = 1;
                        break;
                    case THB:
                        exchangeRate = 32.74;
                        break;
                    case EURO:
                        exchangeRate = 0.85;
                        break;
                }
                break;
            case EURO:
                switch (target) {
                    case USD:
                        exchangeRate = 1.18;
                        break;
                    case THB:
                        exchangeRate = 38.65;
                        break;
                    case EURO:
                        exchangeRate = 1;
                        break;
                }
                break;
            case THB:
                switch (target) {
                    case USD:
                        exchangeRate = 1 / 32.74;
                        break;
                    case THB:
                        exchangeRate = 1;
                        break;
                    case EURO:
                        exchangeRate = 1 / 38.65;
                        break;
                }
                break;
            default:
                exchangeRate = 1;
                break;

        }
        return amount * exchangeRate;
    }


}
