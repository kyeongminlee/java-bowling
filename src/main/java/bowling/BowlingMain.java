package bowling;

import bowling.controller.BowlingController;

public class BowlingMain {
    public static void main(String[] args) {
        BowlingController controller = new BowlingController();
        controller.start();
    }
}
