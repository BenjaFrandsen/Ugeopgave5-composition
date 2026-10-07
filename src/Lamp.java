public class Lamp {


    private int watt;
    private boolean isOn;

    public Lamp(int watt) {
        this.watt = watt;
        this.isOn = false;

    }

    public void turnOn() {
        if (!isOn) {
            this.isOn = true;
            System.out.println("Lamp turned on");
        } else {
            System.out.println("Lamp is already on");
        }
    }

    public void turnOff() {
        if (isOn = true) {
            isOn = false;
            System.out.println("Lamp turned off");
        } else {
            System.out.println("Lamp is already off");
        }

    }

    public int getWatt() {
        return watt;
    }

    public boolean isOn() {
        return isOn;
    }


    @Override
    public String toString() {
        return "Lamp{" +
                "watt=" + watt +
                ", isOn=" + isOn +
                '}';
    }
}
