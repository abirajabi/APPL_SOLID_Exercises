package com.company.Models;

import com.company.Interfaces.ISleeper;

public class Employee extends  Worker implements ISleeper {
    public Employee(String id) {
        super(id);
    }

    @Override
    public void sleep() {
        // sleep ...
    }
}
