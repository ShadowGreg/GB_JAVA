public class RandomNum {
    protected static Integer getRandomNum(Integer min, Integer max) {
        int range = Math.abs(max - min) + 1;
        return ((int) (Math.random() * range) + (min <= max ? min : max));
    }
}
