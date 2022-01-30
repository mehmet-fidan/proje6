package proje6.testClass;

import proje6.lessons.LessonClass;
import proje6.lessons.Music;
import proje6.student.StudentClass;

public class MainClas {

    public static void main(String[] args)  {


        StudentClass studentClass = new StudentClass("Gerard", "Captain2005", "Portugal");
        LessonClass lessonClass = new Music(studentClass);
        studentClass.setClassNameAndScore(lessonClass.getClassNameAndScore());
        System.out.println(studentClass);

    }

         /*
        MainClass run edin

        sonuc asagidaki gibi olmali
        Exception in thread "main" java.lang.AssertionError:
        Location should be one of the following [USA, England, France, Germany, Canada]


         */

}