package Practice8_problems;

abstract class Transport {
    double distance;

    Transport(double distance) {
        this.distance = distance;
    }

    abstract double calculateFare();
}

class Bus extends Transport {

    Bus(double distance) {
        super(distance);
    }

    double calculateFare() {
        return Math.min(10, 2 + distance * 0.1);
    }
}

class Train extends Transport {

    Train(double distance) {
        super(distance);
    }

    double calculateFare() {
        return 3 + distance * 0.15;
    }
}

class Metro extends Transport {
    double factor;

    Metro(double distance, double factor) {
        super(distance);
        this.factor = factor;
    }

    double calculateFare() {
        return (1.5 + distance * 0.2) * factor;
    }
}

public class P5_PublicTransportFareCalculator {
}
