package th.ac.camt.automatedtest.tdd.service;

public class ScoreItem {
    String name;
    Integer score;
    Integer maxScore;

    public ScoreItem(String name, Integer score, Integer maxScore) {
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(int maxScore) {
        this.maxScore = maxScore;
    }
}
