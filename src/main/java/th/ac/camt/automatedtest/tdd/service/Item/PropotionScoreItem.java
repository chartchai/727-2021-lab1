package th.ac.camt.automatedtest.tdd.service.Item;

public class PropotionScoreItem extends ScoreItem {
    Double weights;

    public PropotionScoreItem(String name, Double score, Double maxScore, Double weights) {
        super(name, score, maxScore);
        this.weights = weights;
    }
    public static double calculateGradWithPropotion(){

        return 0;
    }
}
