package com.company.Models;

import com.company.Interfaces.IShape;

public class Square implements IShape {
    @Override
    public String draw() {
        return "I'm Square";
    }
}
