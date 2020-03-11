package pl.zzpj2020.solid.ocp.usa.solution;

public class SCSpeedFine implements StateSpeedFine {
    @Override
    public int getMaxSpeed() {
        return 0;
    }

    @Override
    public double calculateFine(int speed) {
        return speed * 2;
    }
}
