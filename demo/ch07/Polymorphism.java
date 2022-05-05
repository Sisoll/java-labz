package demo.ch07;

public class Polymorphism {

    public static void main(String[] args) {
        drive(new Toyota());
        drive(new BMW());
    }

    static void drive(Car car) {
        car.accelerate();
    }

    interface Car {
        // 開規格書
        void accelerate();
    }

    abstract static class AbstractCar implements Car {
        @Override
        public void accelerate() {
            // Template pattern
            System.out.println(getName() + ": 0 ~ 100 加速要 " + getTotalSeconds());
        }

        abstract String getName();

        abstract String getTotalSeconds();
    }

    static class Toyota extends AbstractCar {
        @Override
        String getName() {
            return "Toyota";
        }

        @Override
        String getTotalSeconds() {
            return "15 秒";
        }
    }

    static class BMW extends AbstractCar {
        @Override
        String getName() {
            return "BMW";
        }

        @Override
        String getTotalSeconds() {
            return "8 秒";
        }
    }
}
