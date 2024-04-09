package app;

/**
 * Grader
 */
public class Grader {
    
    public char determineLetterGrade(int gradeInDecimal) {
        if(gradeInDecimal < 0) throw new IllegalArgumentException("Grade must be equals or greater than 0");

        if     ( gradeInDecimal < 60 ) return 'F';
        else if( gradeInDecimal < 70 ) return 'D';
        else if( gradeInDecimal < 80 ) return 'C';
        else if( gradeInDecimal < 90 ) return 'B';
        else return 'A';
    }
}
