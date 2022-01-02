package engine.floatyHorizonProduction.yudlunkon;

import java.util.Random;

public class funFacts {
    public static void fact() {
        Random random = new Random();
        int factNum = random.nextInt(1);

        if (factNum == 1){
            System.out.println("Fun fact: the name of the engine was made with a random letters generator!");
        }
    }
}
