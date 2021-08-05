package th.ac.camt.automatedtest.tdd.service.Item;

public class ScoreItem {
    String name;
    Double score;
    Double maxScore;

    public ScoreItem(String name, Double score, Double maxScore) {
        this.name = name;
        this.score = score;
        this.maxScore = maxScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Double getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(Double maxScore) {
        this.maxScore = maxScore;
    }

//    public static int calculateGrade(int score, int maxScore){
//        return (score/maxScore)*100;
//    }
}
