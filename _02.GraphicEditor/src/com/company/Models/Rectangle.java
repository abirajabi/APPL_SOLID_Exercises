package com.company.Models;

import com.company.Interfaces.IShape;

public class Rectangle implements IShape {

    @Override
    public String draw() {
        return "I'm Rectangle";
    }
}
