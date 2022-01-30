package proje6.testClass;

import proje6.lessons.LessonClass;
import proje6.lessons.Music;
import proje6.student.StudentClass;

public class MainClass2 {
    public static void main(String[] args)  {


        StudentClass studentClass = new StudentClass("Origiii", "CornerTakenQuickly","England" );
        LessonClass lessonClass = new Music(studentClass);
        studentClass.setClassNameAndScore(lessonClass.getClassNameAndScore());
        System.out.println(studentClass);



    }

    /*
        MainClass2 run edin
        Enter: Math
        Enter: Science
        Enter: Music

        sonuc asagidaki gibi olmali
        StudentClass{username='Origiii',
        password='CornerTakenQuickly'
        Price of the school is £6500 Location of the school is England
        Class names and score for it {Math=32, Science=59, Music=7}}

         */
}