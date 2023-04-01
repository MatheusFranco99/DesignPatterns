
class Car {
    private String make;
    private String model;
    private int year;
    private int engineSize;
    private int numDoors;

    private Car(Builder builder) {
        this.make = builder.make;
        this.model = builder.model;
        this.year = builder.year;
        this.engineSize = builder.engineSize;
        this.numDoors = builder.numDoors;
    }

    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public int getEngineSize() {
        return engineSize;
    }
    public int getNumDoors() {
        return numDoors;
    }

    public String toString() {
        return "Car: " + make + "," +
                         model + "," +
                         year + "," +
                         engineSize + "," +
                         numDoors + ".";
    }

    public static class Builder {
        private String make;
        private String model;
        private int year;
        private int engineSize;
        private int numDoors;
        
        public Builder() {}

        
        public Builder make(String make) {
            this.make = make;
            return this;
        }
        
        public Builder model(String model) {
            this.model = model;
            return this;
        }
        
        public Builder year(int year) {
            this.year = year;
            return this;
        }

        public Builder engineSize(int engineSize) {
            this.engineSize = engineSize;
            return this;
        }
        
        public Builder numDoors(int numDoors) {
            this.numDoors = numDoors;
            return this;
        }
        
        public Car build() {
            return new Car(this);
        }
    }
}

class main {

    public static void main(String[] args) {
        Car car = new Car.Builder()
            .make("Toyota")
            .model("Corolla")
            .year(2020)
            .engineSize(1)
            .numDoors(4)
            .build();
        System.out.println(car);
    }
}
