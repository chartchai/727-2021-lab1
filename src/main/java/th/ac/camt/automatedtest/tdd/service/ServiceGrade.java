package th.ac.camt.automatedtest.tdd.service;

public class ServiceGrade {

    public double exchangeGrade(Grade students, int score){

        switch (students) {
            case A:
                var b = 90 <= score;
                break;
            case B:
                score = 80;
                break;
            case C:
                score =70 ;
                break;
            case F:
                score =60;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + students);
        }
        return score;
    }
}
