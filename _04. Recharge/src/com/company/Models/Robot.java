package com.company.Models;

import com.company.Interfaces.IRechargeable;

public class Robot extends Worker implements IRechargeable {
    private int capacity;
    private int currentPower;

    public Robot(String id, int capacity) {
        super(id);
        this.capacity = capacity;
    }

    public void setCurrentPower(int currentPower) {
        this.currentPower = currentPower;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCurrentPower() {
        return currentPower;
    }

    @Override
    public void work(int hours) {
        if (hours > this.currentPower) {
            hours = currentPower;
        }
        super.work(hours);
        this.currentPower -= hours;
    }

    @Override
    public void recharge() {
        this.currentPower = this.capacity;
    }
}
