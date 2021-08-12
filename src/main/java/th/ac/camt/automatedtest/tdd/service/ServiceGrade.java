package th.ac.camt.automatedtest.tdd.service;

import th.ac.camt.automatedtest.tdd.service.Exception.ScoreOverspendException;
import th.ac.camt.automatedtest.tdd.service.Exception.ScoreZeroException;

public class ServiceGrade {

    public Grade GradeFinal(int score){
        return null;
    }

    public Grade CalGradeItemArry(ScoreItem item, int... scores){
        for (int i = 0; i < scores.length; i++) {
            int score = (item.score/item.maxScore)*100;
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
        return null;
    }

    public Grade CalGrade(ScoreItem item){
        if (item.score == 0){
            throw new ScoreZeroException();
        }if (item.score == null){
            throw new NullPointerException();
        }if (item.score < 0){
            throw new ScoreOverspendException();
        }
        int scores  = (item.score/item.maxScore)*100;
            if (scores >= 80){
                return Grade.A;
            }if (scores > 70){
                return Grade.B;
            }if (scores > 60){
                return Grade.C;
            }if (scores > 50){
                return Grade.D;
            }else {
                return Grade.F;
            }
    }

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
