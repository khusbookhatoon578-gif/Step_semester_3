package Practice8_problems;

abstract class Delivery {
    double weight, distance;

    Delivery(double weight, double distance) {
        this.weight = weight;
        this.distance = distance;
    }

    abstract double calculateFee();
}

class StandardDelivery extends Delivery {
    StandardDelivery(double w, double d) {
        super(w, d);
    }

    double calculateFee() {
        return 5 + 0.5 * weight + 0.1 * distance;
    }
}

class ExpressDelivery extends Delivery {
    ExpressDelivery(double w, double d) {
        super(w, d);
    }

    double calculateFee() {
        return 15 + weight + 0.2 * distance;
    }
}

class InternationalDelivery extends Delivery {
    double customsFee;

    InternationalDelivery(double w, double d, double c) {
        super(w, d);
        customsFee = c;
    }

    double calculateFee() {
        return 25 + 2 * weight + 0.5 * distance + customsFee;
    }
}

public class P3_DeliveryFeeCalculator {
}