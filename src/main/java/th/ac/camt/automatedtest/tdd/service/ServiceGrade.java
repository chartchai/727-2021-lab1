package th.ac.camt.automatedtest.tdd.service;

public class ServiceGrade {

    public Grade exchangeGrade( int score){

        if (score >= 90){
            return Grade.A;
        }if(score >= 80){
            return Grade.B;
        }if (score >= 70){
            return Grade.C;
        }else{
            return Grade.F;
        }
    }
}
