import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", 10, 600, "red", 200);
        Car car2 = new Car("BMW", 5, 1200, "blue", 220);

        car1.getInfo();
        car2.getInfo();
        car1.road("Ленина 96");
        car1.start();
        car1.road("Ленина 96");
        car1.stop();

        car2.road("Пушкина 54");
        System.out.println();

        Race race1 = new Race("test",
                new ArrayList<>(Arrays.asList(new Car("Subaru", 10, 1000, "white", 260),
                        new Car("Honda", 5, 5000, "black", 300))),
                "Золотое кольцо", 250);
        race1.start();
    }

}
