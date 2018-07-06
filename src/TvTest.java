public class TvTest {
    public static void main(String[] args) {
        Televisor tv1 = new Televisor("Philips", false);
        tv1.showStatus();
        System.out.println();
        tv1.turnOn();
        tv1.showStatus();
        tv1.turnOff();
        System.out.println();
        tv1.showStatus();
    }
}
