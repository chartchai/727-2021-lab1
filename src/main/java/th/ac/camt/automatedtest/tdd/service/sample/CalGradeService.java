package th.ac.camt.automatedtest.tdd.service.sample;

import th.ac.camt.automatedtest.tdd.service.sample.exception.ScoreMoreThanMaxScoreException;

public class CalGradeService {
    public Grade calGrade(ScoreItem item){
        if (item.getMaxScore() < item.getScore()){
//            throw  new ScoreMoreThanMaxScoreException();
        }
        return null;
    }
}
