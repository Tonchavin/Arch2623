import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Fabric.GemGenerator;
import Fabric.GoldGenerator;
import Fabric.ItemGenerator;
import Fabric.SilverGenerator;

public class App {
    public static void main(String[] args) throws Exception {
        ItemGenerator f1 = new GemGenerator();
        f1.openReward();
        ItemGenerator f2 = new GoldGenerator();
        f2.openReward();
        ItemGenerator f3 = new SilverGenerator();
        f3.openReward();

        Random rnd = ThreadLocalRandom.current();

        List<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new GoldGenerator());
        generatorList.add(new GemGenerator());
        generatorList.add(new SilverGenerator());

        int gemCounter = 0;
        int goldCounter = 0;
        int counter = 0;

        for (int i = 0; i < 20; i++) {
            boolean generet = true;
           // while (generet) {

                int index = rnd.nextInt(3);

                if (index == 0) {
                    gemCounter++;
                }

                if (index == 1) {
                    goldCounter++;
                }                

                generatorList.get(index).openReward();
                // int index = rnd.nextInt(2);
                // System.out.println(index);
                // generatorList.get(index).openReward();
           // }
        }
    }
}
