package app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GraderTest {

    @Test
    void gradeLessThanSixtyShouldBeF() {
       Grader grader = new Grader();
       Character character = grader.determineLetterGrade(50);
       assertEquals('F', character);
    }

    @Test
    void gradeLessThanSeventyShouldBeD() {
       Grader grader = new Grader();
       Character character = grader.determineLetterGrade(65);
       assertEquals('D', character);
    }

    @Test
    void gradeLessThanEightyShouldBeC() {
       Grader grader = new Grader();
       Character character = grader.determineLetterGrade(75);
       assertEquals('C', character);
    }

    @Test
    void gradeLessThanNinetyShouldBeB() {
       Grader grader = new Grader();
       Character character = grader.determineLetterGrade(85);
       assertEquals('B', character);
    }

    @Test
    void gradeNinetyGreaterShouldBeA() {
       Grader grader = new Grader();
       Character character = grader.determineLetterGrade(91);
       assertEquals('A', character);
    }
}
