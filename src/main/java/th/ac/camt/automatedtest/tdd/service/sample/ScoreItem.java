package th.ac.camt.automatedtest.tdd.service.sample;

public class ScoreItem {
    String name;
    int score;
    int maxScore;

    public ScoreItem(String name, int score, int maxScore) {
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
