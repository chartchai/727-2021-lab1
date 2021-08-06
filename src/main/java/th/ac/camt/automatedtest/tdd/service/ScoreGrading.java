package th.ac.camt.automatedtest.tdd.service;

import th.ac.camt.automatedtest.tdd.service.Item.ScoreItem;
import th.ac.camt.automatedtest.tdd.service.Item.exception.*;

public class ScoreGrading {
    public Grade grading(ScoreItem item){
        if(item.getMaxScore() == null){
            throw new NullMaxScoreException();
        } else if (item.getScore() == null){
            throw new NullScoreException();
        } else if (item.getScore() < 0){
            throw new ScoreLessThanZeroException();
        } else if (item.getMaxScore() == 0){
            throw new MaxScoreIsZeroExecption();
        } else if (item.getScore() > 100){
            throw new Over100Exception();
        } else if (item.getMaxScore() < item.getScore()){
            throw new ScoreMoreThanMaxScoreException();
        }
        return null;
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
