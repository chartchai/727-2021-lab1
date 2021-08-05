package th.ac.camt.automatedtest.tdd.service;

public class ScoreGrading {
    public int grading(int score){
        return 0;
    }


    public Grade gradingMultiple(int... score){
        int sum = 0;
        for ( int i = 0; i < score.length; i++) {
            sum = score[i] + sum;
        };

        if(sum >= 80){
            return Grade.A;
        }else if(sum > 70){
            return Grade.B;
        }else if(sum > 60){
            return Grade.C;
        }else if(sum > 50){
            return Grade.D;
        }else {
            return Grade.F;
        }
    }
}
