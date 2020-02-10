import java.util.Arrays;

public class Eagles extends Birds{
    String[] preyList;

    public Eagles() {
    }

    public Eagles(int age, int weight, float flightSpeed, String[] preyList) {
        super(age, weight, flightSpeed);
        this.preyList = preyList;
    }

    public void hunt(String preyName) {
        System.out.println("I'm hunting: " + preyName);
    }

    @Override
    public String toString() {
        return "Eagles{"
            + "age=" + getAge()
            + ", weight=" + getWeight()
            + ", preyList=" + Arrays.toString(preyList)
            + ", flightSpeed=" + flightSpeed +
            '}';
    }

    public String[] getPreyList() {
        return preyList;
    }

    public void setPreyList(String[] preyList) {
        this.preyList = preyList;
    }
}
