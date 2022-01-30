package proje6.testClass;

import proje6.lessons.LessonClass;
import proje6.lessons.Music;
import proje6.student.StudentClass;

public class MainClass3 {

    public static void main(String[] args)  {


        StudentClass studentClass = new StudentClass("Gerard", "Captain2005","France" );

        LessonClass lessonClass = new Music(studentClass);

        studentClass.setClassNameAndScore(lessonClass.getClassNameAndScore());

        System.out.println(studentClass);



    }
     /*
        MainClass3 run edin
        Enter: Art
        Exception in thread "main" java.lang.RuntimeException: You class name is not a valid class name.
       */
}