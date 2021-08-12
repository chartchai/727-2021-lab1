package th.ac.camt.automatedtest.tdd.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import th.ac.camt.automatedtest.tdd.service.Exception.ScoreOverspendException;
import th.ac.camt.automatedtest.tdd.service.Exception.ScoreZeroException;

import javax.print.attribute.standard.MediaSize;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class GradeTest {

    @Test
    public void testGrade(){
        ServiceGrade number = new ServiceGrade();
        assertThat(number.GradeCalculated(90 ),is(equalTo(Grade.A)));
        assertThat(number.GradeCalculated(85 ),is(equalTo(Grade.B)));
        assertThat(number.GradeCalculated(77 ),is(equalTo(Grade.C)));
        assertThat(number.GradeCalculated(69 ),is(equalTo(Grade.F)));

    }

    @Test
    public void testTotalGrade(){
        ServiceGrade total = new ServiceGrade();
        assertThat(total.TotalGrade(11,34,0,2),is(equalTo(Grade.F)));
        assertThat(total.TotalGrade(12,21,15,28),is(equalTo(Grade.B)));
        assertThat(total.TotalGrade(10,25,30,19),is(equalTo(Grade.A)));
        assertThat(total.TotalGrade(9,14,27,10),is(equalTo(Grade.C)));

        assertThat(total.TotalGrade(14,21,15,23),is(equalTo(Grade.B)));
        assertThat(total.TotalGrade(16,22,20,18),is(equalTo(Grade.A)));
    }

    @Test
    public void calGraed(){
        ServiceGrade cal = new ServiceGrade();
        ScoreItem a = new ScoreItem("A",66,68);
        assertThat(cal.CalGrade(a),is(equalTo(Grade.A)));
        ScoreItem b = new ScoreItem("B",72,88);
        assertThat(cal.CalGrade(a),is(equalTo(Grade.B)));
        ScoreItem C = new ScoreItem("C",34,90);
        assertThat(cal.CalGrade(a),is(equalTo(Grade.C)));
        ScoreItem d = new ScoreItem("d",31,61);
        assertThat(cal.CalGrade(a),is(equalTo(Grade.D)));
        ScoreItem f = new ScoreItem("f", 20,40 );
        assertThat(cal.CalGrade(a),is(equalTo(Grade.F)));
    }

    @Test
    public void CalGraedItem(){
        ServiceGrade calItem = new ServiceGrade();
        ScoreItem a = new ScoreItem("A",5,10);
        assertThat(calItem.CalGradeItemArry(a,5,8,43,78),is(equalTo(Grade.A)));
        ScoreItem b = new ScoreItem("B",3,5);
        assertThat(calItem.CalGradeItemArry(b,4,11,32,56),is(equalTo(Grade.B)));
    }

    @Test
    public void ChenckSore(){
        Assertions.assertThrows(ScoreZeroException  .class, () -> {
            ServiceGrade cal = new ServiceGrade();
            ScoreItem a = new ScoreItem("A",0,68);
            cal.CalGrade(a);
        });

        Assertions.assertThrows(NullPointerException.class, () -> {
                    ServiceGrade cal = new ServiceGrade();
                    ScoreItem a = new ScoreItem("A", null, null);
                    cal.CalGrade(a);
                });

            Assertions.assertThrows(ScoreOverspendException.class, () -> {
                ServiceGrade cal = new ServiceGrade();
                ScoreItem b = new ScoreItem("A", -23, -34);
                cal.CalGrade(b);
            });

        }
    }