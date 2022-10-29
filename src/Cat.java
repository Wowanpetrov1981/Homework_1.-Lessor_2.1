public class Cat {

    String name;
    int age;

    Cat(String name, int age) {
       // if () {

        //}
        this.name = name;

        if (age >= 0) {
            this.age = age;
        } else {
            this.age = Math.abs(age);
        }

    }

    void meow() {
        System.out.println("Мяу!");
        System.out.println("Меня завут " + name);
        System.out.println("Мне " + age + " лет");
    }
}
