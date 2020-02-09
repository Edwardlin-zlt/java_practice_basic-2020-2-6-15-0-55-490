public class Animals {
    private int age;
    private int weight;

    public Animals() {
    }

    public Animals(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("I'm eating.");
    }

    public void sleep() {
        System.out.println("I'm sleeping.");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animals{" +
            "age=" + age +
            ", weight=" + weight +
            '}';
    }
}
