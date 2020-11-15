package lab1;

import javax.swing.*;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class AdvancedJavaCourse extends Course{


    private String prerequisites;



    public AdvancedJavaCourse(String courseName, String courseNumber,int credits,String prerequesit) {
        super(courseName, courseNumber,credits);
        this.setPrerequisites(prerequesit);
    }

    public void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }
    
    @Override
    public String toString() {
        return super.toString() + "AdvancedJavaCourse{" +
                "prerequisites='" + prerequisites + '\'' +
                '}';
    }

}
