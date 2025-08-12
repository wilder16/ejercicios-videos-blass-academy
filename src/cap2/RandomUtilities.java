package cap2;

import java.util.Random;

public class RandomUtilities {

    public static int generarRandomInt(int min, int max, Random random) {
        return random.nextInt(max - min + 1) + min;
    }

    public static double generarRandomDouble(int min, int max, Random random) {
        return (max - min) * random.nextDouble() + min;
    }
}
