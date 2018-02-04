package com.company;

public class Speed {

    private String acelerate;
    private String decelerate;

    public Speed(String acelerate, String decelerate) {
        this.acelerate = acelerate;
        this.decelerate = decelerate;
    }

    public String getAcelerate() {
        return acelerate;
    }

    public void setAcelerate(String acelerate) {
        this.acelerate = acelerate;
    }

    public String getDecelerate() {
        return decelerate;
    }

    public void setDecelerate(String decelerate) {
        this.decelerate = decelerate;
    }
}
