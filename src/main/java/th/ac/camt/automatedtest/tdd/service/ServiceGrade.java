package th.ac.camt.automatedtest.tdd.service;

public class ServiceGrade {

    public Grade  TotalGrade (int... scores){
        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            if (score >= 80){
                return Grade.A;
            }if (score > 70){
                return Grade.B;
            }if (score > 60){
                return Grade.C;
            }if (score > 50){
                return Grade.D;
            }else {
                return Grade.F;
            }
        }
        return Grade.A;
    }

    public Grade GradeCalculated( int score){
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
