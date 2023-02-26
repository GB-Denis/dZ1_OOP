import java.util.List;
import java.util.Random;

public class Race {
        protected String name;
        protected Track track;
        protected List<Car> cars;

        public Race(String name, List<Car> cars, String trackName, int trackSize) {
            this.name = name;
            this.track = new Track(trackName, trackSize);
            this.cars = cars;
        }

        public void start(){

            System.out.printf("Tpaсса %s, растояние %d метров\n", track.name, track.size);
            for (int i = 0; i < cars.size(); i++) {
                System.out.printf("Участник %s, готов!\n", cars.get(i).getModel());
            }
            System.out.println("!СТАРТ!");
            System.out.printf("Участник %s победил!\n", raсeGo().getModel());
        }

        private Car raсeGo() {
            Random random = new Random();
            while (true){
                for (Car car : cars) {
                    if (car.getWay() >= track.size()) {
                        return car;
                    }
                    int defWay = random.nextInt(50);
                    car.setWay(defWay);
                    System.out.printf("Участник %s проехал %d метров\n", car.getModel(), defWay);
                }
            }
        }
        private record Track(String name, int size){}
}
