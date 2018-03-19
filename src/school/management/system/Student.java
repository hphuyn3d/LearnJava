package school.management.system;

/**
 * Created by Hung Huynh on 4/18/2018
 * This class is responsible for keeping track
 * of the students fees, name, id, grade, and fees paid.
 */
public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * To create a new Student object by initializing.
     * Fees for every student is going to be $30k/year.
     * Fews paid initially is 0.
     * @param id id for the student: unique value.
     * @param name name of the student.
     * @param grade grade of the student.
     */
    public Student(int id, String name, int grade){
        feesPaid = 0;
        feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // Not going to alter student's name and ID

    /**
     * Used to update the students grade.
     * @param grade the new grade of the student.
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Add the fees to the feespaid field.
     * The school is going to receive the funds.
     * @param fees the fees that the student has paid.
     */
    public void updateFeesPaid(int fees) {
        feesPaid += fees;
    }

    /**
     *
     * @return id of the student.
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return name of the student.
     */
    public String getName() {
        return name;
    }

    /**
     * @return the grade of the student.
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return fees paid by the student.
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return the total fees left for the student.
     */
    public int getFeesTotal() {
        return feesTotal;
    }
}


