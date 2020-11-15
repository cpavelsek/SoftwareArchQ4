package lab1;
import javax.swing.*;

public abstract class Course {
    
    String courseNumber;
    private String courseName;
    private double credits;

    public Course(String courseName2, String courseNumber2, int credits2) {
	}



	public void course(String courseNumber, String courseName, double credits){
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.credits = credits;
    }



    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    public final String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public final double getCredits() {
        return credits;
    }

    public final void setCredits(double credits) {
        if (credits < 0 || credits > 5.0) {
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.setCredits(credits);
    }

    @Override
    public String toString() {
        return "Course [courseName=" + courseName + ", courseNumber=" + courseNumber + ", credits=" + credits + "]";
    }

    
}
