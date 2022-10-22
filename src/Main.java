public class Main {

    public static void main(String[] args) {

        Cat mursik = new Cat("Мурзик", 3);
        mursik.meow();
        Cat begemot = new Cat("Бегемот", -5);
        begemot.meow();

        System.out.println();
        System.out.println("Домашнее задание 1 к уроку 2.1");
        System.out.println("Задания 1 и 2");
        System.out.println();

        Human maksim = new Human("   ", "Минск", 35, "бренд-менеджера");
        maksim.greeting();
        Human any = new Human("Аня", "Москва", 29, "методиста образовательных программ");
        any.greeting();
        Human katy = new Human("Катя", "Калининград", 28, "продакт-менеджера");
        katy.greeting();
        Human artem = new Human("Артём", "Москва", 27, "директора по развитию бизнеса");
        artem.greeting();
        System.out.println();

    }

}