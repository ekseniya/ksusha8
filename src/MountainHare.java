public class MountainHare {
    double weight;
    int age;
    int jumpLength;

    static String color;

    public MountainHare(int age, double weight, int jumpLength){
        this.age = age;
        this.weight = weight;
        this.jumpLength = jumpLength;
    }

    @Override
    public String toString() {
        return "Заяц-беляк: " +
                "age=" + age +
                ", weight=" + weight +
                ", jumpLength=" + jumpLength +
                ", color=" + color +
                '.';
    }
}