import java.util.Iterator;

public class Randoms implements Iterable<Integer> {
    protected Random random;

    public Randoms(int min, int max) {
        this.random = new Random(min, max);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return Random.random();
            }
        };
    }

    public static class Random {

        private static int min;
        private static int max;

        public Random(int min, int max) {
            Random.min = min;
            Random.max = max;
        }

        public static Integer random() {
            return (int) (Math.random() * ((max - min) + 1)) + min;
        }
    }


}