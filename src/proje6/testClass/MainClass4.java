package proje6.testClass;

import proje6.lessons.LessonClass;
import proje6.lessons.Music;
import proje6.student.StudentClass;

public class MainClass4 {
    public static void main(String[] args)  {


        StudentClass studentClass = new StudentClass("David", "Villa","England" );
        LessonClass lessonClass = new Music(studentClass);
        studentClass.setClassNameAndScore(lessonClass.getClassNameAndScore());
        System.out.println(studentClass);



    }
      /*
        MainClass4 run edin
        sonuc asagidaki gibi olmali
        Exception in thread "main" java.lang.AssertionError: Not able to find a username and password. Please sign up to website
       */
}
