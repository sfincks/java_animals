import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class main {
    public static void main(String[] args) {

//        Species.Dog Bobik = new Species.Dog("Бобик");
//        Species.Dog FirstDog = new Species.Dog();
//        Species.Cat Murzik = new Species.Cat("Мурзик");
//        Species.Cat FirstCat = new Species.Cat();
//
//        System.out.println(Bobik.getInfo());
//        System.out.println(FirstDog.getInfo());
//        System.out.println(Murzik.getInfo());
//        System.out.println(FirstCat.getInfo());
//
//
//        System.out.println(Bobik.voice());
//        System.out.println(Murzik.voice());
//
//        System.out.println(Bobik.run("Bobik"));
//        System.out.println(Bobik.run("Bobik"));
//        System.out.println(Bobik.run("Bobik"));
        /**
         * Подскажите можно ли как-то вывести имя объекта класса без введения переменной name?
         */

        int aniCount = 10;
        Random rand = new Random();
        int dogCount = 0;
        int catCount = 0;


        List<Animal> pack = new ArrayList<>();
        for (int i = 0; i < aniCount; i++) {
            if (rand.nextInt(2) == 0) {
                pack.add(new Species.Dog());
                dogCount++;
            }
            else{
                pack.add(new Species.Cat());
                catCount++;
            }

            System.out.println(pack.get(i).getInfo());
        }
        System.out.println();
        System.out.printf("dogCount: %d catCount: %d \n\n", dogCount, catCount);


        for (int i = 0; i < pack.size(); i++) {
            System.out.println(pack.get(i).voice());
        }

        System.out.println();

        for (int i = 0; i < pack.size(); i++) {
            pack.get(i).eat();
        }

    }
}