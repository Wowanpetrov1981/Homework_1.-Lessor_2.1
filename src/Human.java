import java.time.YearMonth;
import java.time.LocalDate;

public class Human {

    String name;
    private String town;
//    int age;
    String job;
//    int year = YearMonth.now().getYear();
    private int yearOfBirth;
    private static final String DEFAULT_STRING_VALUE = "Информация не указана";

    Human(String name, String town, int yearOfBirth, String job) {
        this.name = validOrDefault(name, DEFAULT_STRING_VALUE);
        setTown(town);
//        this.town = validOrDefault(town, DEFAULT_STRING_VALUE);
        this.job = validOrDefault(job, DEFAULT_STRING_VALUE);
        setYearOfBirth(yearOfBirth);
//        this.yearOfBirth = Math.max(yearOfBirth, 0);
//        this.yearOfBirth = year - age;
//        if (age >= 0) {
//            this.age = age;
//        } else {
//            this.age = Math.abs(age);
//        }

    }

    private String validOrDefault(String value, String defaultValue) {
        if (value == null || value.isEmpty() || value.isBlank()) {
            return defaultValue;
        } else {
            return value;
        }
    }

    public String getTown() {
        return town;
    }
    public void setTown(String town) {
        this.town = validOrDefault(town, DEFAULT_STRING_VALUE);
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = Math.abs(yearOfBirth);
    }

    private int getAgeInYears() {
        int currentYear = LocalDate.now().getYear();
        return currentYear - this.yearOfBirth;
    }

    @Override
    public  String toString () {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Мне  "
                + getAgeInYears() + " лет. Я работаю на должности " + job + ". Будем знакомы.";
    }


}










