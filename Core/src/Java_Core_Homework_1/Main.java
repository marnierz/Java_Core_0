package Java_Core_Homework_1;

public class Main {
    public static void main (String[] args) {
        Human h = new Human("Вова", 1,400);
        Human u = new Human("Аня", 1,450);
        Cat c = new Cat("Трикс", 2,600);
        Cat a = new Cat("Серебряночка", 3,900);
        Robot r = new Robot("Поля", 6,1000);
        Robot o = new Robot("Электроник",10,100);
        Wall wall1 = new Wall("высокая кирпичная стена", 5);
        Wall wall2 = new Wall("низкая деревянная стена", 2);
        Track track1 = new Track("трудная дорожка", 900);
        Track track2 = new Track("легкая дорожка", 300);
        Team[] team = {h, u, c, a, r, o};
        Hurdle[] hurdle1 = {wall1, wall2, track1, track2};

        for (int i = 0; i < team.length; i++) {
            for (int j = 0; j < hurdle1.length; j++) {
                if (hurdle1[j] instanceof Wall) {
                    team[i].jump();

                }
            }

        }

        System.out.println( "высота высокой  стены " + wall1.getHeight());
        System.out.println( "высота низкой стены " + wall2.getHeight());
        System.out.println( "длина сложной дорожки " + track1.getLength());
        System.out.println( "длина легкой дорожки " + track2.getLength());

    }
}
