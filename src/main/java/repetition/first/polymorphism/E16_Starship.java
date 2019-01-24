package repetition.first.polymorphism;

class AlertStatus {
    public String getStatus() {
        return "None";
    }
}

class RedAlertStatus extends AlertStatus {
    public String getStatus() {
        return "Red";
    }
}

class YellowAlertStatus extends AlertStatus {
    public String getStatus() {
        return "Yellow";
    }
}

class GreenAlertStatus extends AlertStatus {
    public String getStatus() {
        return "Green";
    }
}

class Startship {
    private AlertStatus status = new GreenAlertStatus();

    public void setStatus(AlertStatus istatus) {
        status = istatus;
    }

    public String toString() {
        return status.getStatus();
    }
}

public class E16_Starship {
    public static void main(String[] args) {
        Startship eprise = new Startship();
        System.out.println(eprise);
        eprise.setStatus(new YellowAlertStatus());
        System.out.println(eprise);
        eprise.setStatus(new RedAlertStatus());
        System.out.println(eprise);
    }
}
