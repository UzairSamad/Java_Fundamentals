package com.testproject;

public class UIControl {
    private boolean isEnabled = false;
    public String overRideValue = "Hello Inheritence";

    public UIControl(boolean isEnabled) {
        System.out.println("UI CoNTROL");
        this.isEnabled = isEnabled;
    }
// function setting just static value
    public void setOverRideValue(String value){
        this.overRideValue = "In UI";
    }

    public  void enable(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }
      public  void disable(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }
    public boolean isEnabled() {
        return isEnabled;
    }
}
