package lab1;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroJavaCourse extends Course{
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber,int credits,String prerequesit){
        super(courseName, courseNumber,credits);
        this.setPrerequisites(prerequesit);
    }


    public final String getPrerequisites() {
        return prerequisites;
    }

    public final void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    @Override
    public String toString() {
        return super.toString() + "IntroJavaCourse{" +
                "prerequisites='" + prerequisites + '\'' +
                '}';
    }
}
