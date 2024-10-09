public class InterfaceTrials {
    interface Car {
        void drive();

        void stop();
    }

    static class SUV implements Car {

        public void drive() {
            System.out.println("Driving an SUV");
        }

        public void stop() {
            System.out.println("Stopping SUV");
        }
    }

    static class Sedan implements Car{
        public void drive() {
            System.out.println("Driving a Sedan");
        }
        public void stop() {
            System.out.println("Stopping Sedan");
        }
    }

    static class NullCar implements Car{
        public void drive() { }
        public void stop() { }
    }

    static class CarRentalService{
        private Car car;

        public CarRentalService(Car car) {
            this.car = car;
        }
        public void rent() {
            car.drive();
            car.stop();
        }
    }

    public static class Main{
        public static void main(String[] args) {
            Car suv = new SUV();
            Car sedan = new Sedan();
            Car nullCar = new NullCar();

            CarRentalService rentalService1 = new CarRentalService(suv);
            rentalService1.rent();

            CarRentalService rentalService2 = new CarRentalService(sedan);
            rentalService2.rent();

            CarRentalService rentalService3 = new CarRentalService(nullCar);
            rentalService3.rent();
        }
    }

}
