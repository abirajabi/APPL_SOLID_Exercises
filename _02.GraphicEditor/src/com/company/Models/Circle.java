package com.company.Models;

import com.company.Interfaces.IShape;

public class Circle implements IShape {
    @Override
    public String draw() {
        return "I'm Circle";
    }
}
