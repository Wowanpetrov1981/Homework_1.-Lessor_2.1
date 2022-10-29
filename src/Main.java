public class Main {

    public static void main(String[] args) {

        Cat mursik = new Cat("Мурзик", 3);
        mursik.meow();
        Cat begemot = new Cat("Бегемот", -5);
        begemot.meow();

        System.out.println();
        System.out.println("ООП. Часть 2. Домашнее задание 1 к уроку 2.1");
        System.out.println("Задания 1 и 2");
        System.out.println();

        Human maksim = new Human("Максим", "Минск", 1987, "бренд-менеджера");
        System.out.println(maksim);
        Human any = new Human("Аня", "Москва", 1993, "методиста образовательных программ");
        System.out.println(any);
        Human katy = new Human("Катя", "Калининград", 1994, "продакт-менеджера");
        System.out.println(katy);
        Human artem = new Human("Артём", "Москва", 1995, "директора по развитию бизнеса");
        System.out.println(artem);
        Human vladimir = new Human("Владимир", "Казань", 2001, "безрабоного");
        System.out.println(vladimir);
        System.out.println();

        Flower roze = new Flower("Роза обыкновенная", "Голландия", 35.59, 4);
        System.out.println(roze);
        Flower chrysanthemum = new Flower("Хризантема", "", 15, 5);
        System.out.println(chrysanthemum);
        Flower pion = new Flower("Пион", "Англия", 69.9, 1);
        System.out.println(pion);
        Flower gypsophila = new Flower("Гипсофила", "Турция", 19.5, 10 );
        System.out.println(gypsophila);
    }

}