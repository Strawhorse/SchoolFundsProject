public class Student {

    private int studentID;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    // constructor for student
    public Student(int studentID, String name, int grade) {
        this.studentID = studentID;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 110000;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getStudentID() {
        return studentID;
    }

    public void payFee(int i) {
        feesPaid += i;
        School.updateTotalMoneyEarned(i);
    }
}


