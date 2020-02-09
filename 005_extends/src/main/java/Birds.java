public class Birds extends Animals{
    float flightSpeed;

    public Birds() {
    }

    // 这样的构造函数一般会写吗？　TODO
//    public Birds(float flightSpeed) {
//        this.flightSpeed = flightSpeed;
//    }

    public Birds(int age, int weight, float flightSpeed) {
        super(age, weight);
        this.flightSpeed = flightSpeed;
    }

    public void fly() {
        System.out.println("I'm flying at speed " + flightSpeed + " km/h.");
    }

    public float getFlightSpeed() {
        return flightSpeed;
    }

    public void setFlightSpeed(float flightSpeed) {
        this.flightSpeed = flightSpeed;
    }

    @Override
    public String toString() {
        return "Birds{" +
            "flightSpeed=" + flightSpeed +
            '}';
    }
}
