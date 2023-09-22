import java.util.Calendar;

public class Student extends Human{
    private String studies;

    public Student() {
    }

    public Student(String name, String surname, String email, int phoNo, boolean gender, int birthYear, String studies) {
        super(name, surname, email, phoNo, gender, birthYear);
        this.studies = studies;
    }

    public void setStudies(String studies){
        this.studies = studies;
    }
    public String getStudies(){
        return this.studies;
    }
    public int getAge(){
        return Calendar.getInstance().get(Calendar.YEAR) - this.birthYear;
    }
    public int getAge(int currYear){
        return currYear - this.birthYear;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studies='" + this.studies + '\'' +
                ", name='" + this.name + '\'' +
                ", surname='" + this.surname + '\'' +
                ", email='" + this.email + '\'' +
                ", phoNo=" + this.phoNo +
                ", gender=" + this.gender +
                ", birthYear=" + this.birthYear +
                '}';
    }

    public static void classIntro(){
        System.out.println("klase skirta kurti studentams");
    }
}
