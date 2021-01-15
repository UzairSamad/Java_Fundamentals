package com.testproject;

public class UIControl {
    private boolean isEnabled = false;

    public UIControl( ) {
        System.out.println("UI CoNTROL");
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
