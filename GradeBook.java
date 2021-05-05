/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author MARLIAN
 */
public class GradeBook {

    private static Object[] getAverage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private String courseName;
    private final int[] grades;
    private int student;
    
    public GradeBook(String name, int[] gradeArray)
    {
    courseName = name;
    grades = gradeArray;
    }
    public void setCourseName(String name)
    {
    courseName = name;
    }
    public String getCourseName()
    {
        return courseName;
    }
    public void displayMessage()
    {
    System.out.printf("welcome to the grade book for\n%s!", getCourseName());
    }
     public static void outputGrades()
    {
     outputGrades();
    System.out.printf("\nClass average is % 2f\n",getAverage());   
    }
    
    
    
    public int getMximum()
    {
    int highGrade = grades[0];
    
    for (int grade : grades)
    {
    if (grade > highGrade)
        highGrade = grade;
    }
    return highGrade;
    }
      for(int count = 0; count < frequency.length; count++)
    {
        //output bar label("00-09:",....)
        if(count==10)
            System.out.printf("%5d:", 100);
        else
            System.out.printf("%02d - %02d:",
                    count * 10, count * 10 + 9);
        
        for(int stars =0; stars < frequency [counter]; stars++ )
        System.out.print("*");
        
        System.out.println();
    }
    public void OutputGrades()
    {
    System.out.println("the grade are:\n");
    for(int student =0; student < grades.length; student++);
    System.out.printf("Student %2d: %3d\n", student +1, grades[student]);
    }
}
