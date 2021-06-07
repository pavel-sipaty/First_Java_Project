package Task10;

public class MonthUtils {

    public final static Month JAN = new Month("january", 31, 24);
    public final static Month FEB = new Month("february", 28, 20);
    public final static Month MAR = new Month("march", 31, 24);
    public final static Month APR = new Month("april", 30, 22);
    public final static Month MAY = new Month("may", 31, 24);
    public final static Month JUN = new Month("june", 30, 22);
    public final static Month JUL = new Month("july", 31, 24);
    public final static Month AUG = new Month("august", 31, 24);
    public final static Month SEP = new Month("september", 30, 22);
    public final static Month OCT = new Month("october", 31, 24);
    public final static Month NOV = new Month("november", 30, 22);
    public final static Month DEC = new Month("december", 31, 24);

    public final static Month[] Q1 = new Month[] {JAN, FEB, MAR};
    public final static Month[] Q2 = new Month[] {APR, MAY, JUN};
    public final static Month[] Q3 = new Month[] {JUL, AUG, SEP};
    public final static Month[] Q4 = new Month[] {OCT, NOV, DEC};
    public final static Month[] HALF_YEAR_1 = new Month[] {JAN, FEB, MAR, APR, MAY, JUN};
    public final static Month[] HALF_YEAR_2 = new Month[] {JUL, AUG, SEP, OCT, NOV, DEC};
    public final static Month[] YEAR = new Month[] {JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC};

    public static Month[] getQ1() {
        return new Month[] {JAN, FEB, MAR};
    }

    public static Month[] getQ2() {
        return new Month[] {APR, MAY, JUN};
    }

    public static Month[] getQ3() {
        return new Month[] {JUL, AUG, SEP};
    }

    public static Month[] getQ4() {
        return new Month[] {OCT, NOV, DEC};
    }

    public static Month[] getHalfYear1() {
        return new Month[] {JAN, FEB, MAR, APR, MAY, JUN};
    }

    public static Month[] getHalfYear2() {
        return new Month[] {JUL, AUG, SEP, OCT, NOV, DEC};
    }

    public static Month[] getYear() {
        return new Month[] {JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC};
    }















}
