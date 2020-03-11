package pl.zzpj2020.solid.ocp.usa.solution;

public class SpeedLimitFineCalculator {

    public double calcualateSpeedLimitFine(StateSpeedFine speedFine, int speed) {
        if(speedFine.getMaxSpeed() > speed)
            return speedFine.calculateFine(speed);
        return 0.0;
    }

}
