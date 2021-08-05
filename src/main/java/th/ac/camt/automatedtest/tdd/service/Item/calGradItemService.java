package th.ac.camt.automatedtest.tdd.service.Item;

import th.ac.camt.automatedtest.tdd.service.Grade;

public class calGradItemService {
    public Grade calGradItem(ScoreItem item){

            double avg = (item.score/item.maxScore)*100;
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
