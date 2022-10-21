import java.time.YearMonth;

public class Human {

    String name;
    String town;
    int age;
    String job;
    int year = YearMonth.now().getYear();
    int yearOfBirth = year - age;

    Human(String name, String town, int age, String job) {

        if (name != "" && town != "" && job != "") {
            this.name = name;
            this.town = town;
            this.job = job;
        } else {
            System.out.println("Информация не указана");
        }
        this.yearOfBirth = year - age;
        if (age >= 0) {
            this.age = age;
        } else {
            this.age = Math.abs(age);
        }
    }

    void greeting() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + job + ". Будем знакомы.");

    }






}










