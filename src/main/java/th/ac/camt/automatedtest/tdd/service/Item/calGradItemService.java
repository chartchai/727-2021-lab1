package th.ac.camt.automatedtest.tdd.service.Item;

import th.ac.camt.automatedtest.tdd.service.Grade;
import th.ac.camt.automatedtest.tdd.service.Item.exception.*;

public class calGradItemService {
    public Grade calGradItem(ScoreItem item){
        Double avg;
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
        }else {
             avg = (item.getScore()/item.getMaxScore())*100;
        }
         return grading(avg);

    }

    public Grade grading(double avg){
        if(avg >= 80){
            return Grade.A;
        }else if(avg > 70 && avg < 80){
            return Grade.B;
        }else if(avg > 60 && avg <= 70){
            return Grade.C;
        }else if(avg > 50 && avg <= 60){
            return Grade.D;
        }else {
            return Grade.F;
        }
    }
}
