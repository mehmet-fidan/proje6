package proje6.student;

import proje6.data.StudentData;
import proje6.school.SchoolLocation;

import java.util.LinkedHashMap;

public class StudentClass extends SchoolLocation {

  /*
    This class is child of the SchoolLocation
    Create 3 private instance variables
    String username and password
    Linked hash map key is String value is Integer name is classNameAndScore
    ------------------------------------------------------------------------------
    Bu sınıf   SchoolLocation sınıfının child sınıfıdır
    3 private instance variables oluşturun
    String username and password
    Linked hash map , key  String ve  value Integer ,  ismi  classNameAndScore
    */
    //-------------------------------------------------------------------------------------------------------

    private String username, password;
    private LinkedHashMap<String, Integer> classNameAndScore;



     /*
        Create an constructor
        three parameter String username, String password and  String studentSchoolLocation
        Call the setUsernameAndPassword method in the constructor
        ------------------------------------------------------------------------------
         String username, String password ve String studentSchoolLocation parametreleri olan constructor oluştur.
         constructor içinde setUsernameAndPassword methodunu çağır
     */
    //-------------------------------------------------------------------------------------------------------

    public StudentClass(String username, String password, String location) {
        super(location);
        this.username = username;
        this.password = password;
        setUsernameAndPassword(username, password);

    }


/*
    Create a method name is  setUsernamePassword
    Parameter is String username and String  password
    no return type
    Check if given username and password pair exist in the StudentData class
    You will use AddUserNameAndPassword method to check it(create a new LinkedHashMap and make it equal to AddUserNameAndPassword from the StudentData class)
    if the pair exists,  make instance variable username equal to parameter username, and make instance variable password equal to parameter password

    if it doesn't not exist then throw an RunTimeException which is "Not able to find a username and password. Please sign up to website"

     ------------------------------------------------------------------------------
        Parametreleri  String username ve  String  password olan ,
        return türü olmayan setUsernamePassword isimli methodu oluşturun
        StudentData sınıfında verilen kullanıcı adı ve parola çifti olup olmadığını kontrol edin
        Kontrol etmek için AddUserNameAndPassword methodunu kullanacaksınız
        (yeni bir LinkedHashMap oluşturun ve StudentData sınıfından AddUserNameAndPassword ile eşit yapın)
        çift varsa, instance variable username ile  parameter username eşitle,
        ve instance variable password ile parameter password eşitle
        Eğer çift yoksa   "Not able to find a username and password. Please sign up to website" olan RunTimeException fırlat
     */
    //-------------------------------------------------------------------------------------------------------

    public void setUsernameAndPassword(String username, String password) {
        StudentData studentData = new StudentData();

        LinkedHashMap<String, String> user = studentData.AddUserNameAndPassword();

        if (user.containsKey(username) && user.containsValue(password)) {
            this.username = username;
            this.password = password;
        } else {
            throw new RuntimeException("Not able to find a username and password. Please sign up to website");
        }

    }


    /*

        classNameAndScore için set methodunu oluşturun
     */

    //-------------------------------------------------------------------------------------------------------

    public void setClassNameAndScore(LinkedHashMap<String, Integer> classNameAndScore) {
        this.classNameAndScore = classNameAndScore;
    }



     /*
        classNameAndScore için get methodunu oluşturun
     */
    //-------------------------------------------------------------------------------------------------------

    public LinkedHashMap<String, Integer> getClassNameAndScore() {
        return classNameAndScore;
    }



    /*
    Create a toString method
    print username
          password
          Price
          schoolLocation
          ClassNameAndScore
     ------------------------------------------------------------------------------
     toString method  oluşturun
    print username
          password
          Price
          schoolLocation
          ClassNameAndScore
     */
    //-------------------------------------------------------------------------------------------------------


    @Override
    public String toString() {
        return "StudentClass{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                "  price='" + getPrice() + '\'' +
                ", location='" + getLocation()+ '\'' +
                ", classNameAndScore=" + classNameAndScore +
                '}';
    }
}