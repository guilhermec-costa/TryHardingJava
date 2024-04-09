package app;

public enum EDaysOfWeek  {
    SUNDAY(6),
    MONDAY(2),
    TUESDAY(3),
    WEDSNESDAY(4),
    THURSDAY(5),
    FRIDAY(10),
    SATURDAY(9);
    
    // if it is not final, it can be modified externally the enum definition
    final int likeIt;
    EDaysOfWeek(int likeIt) {
        this.likeIt = likeIt;
    }
}
