package com.avatar.demo.bean;

public class Banner3D {
    private int background;
    private int mid;
    private int foreground;

    public Banner3D(int background, int mid, int foreground) {
        this.background = background;
        this.mid = mid;
        this.foreground = foreground;
    }

    public int getBackground() {
        return background;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public int getForeground() {
        return foreground;
    }

    public void setForeground(int foreground) {
        this.foreground = foreground;
    }
}
