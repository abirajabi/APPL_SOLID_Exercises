package com.company.Models;

import com.company.Interface.IStreamable;

public class File implements IStreamable {
    private String name;
    private int lenght;
    private int bytesSent;

    public File(String name, int lenght, int bytesSent) {
        this.name = name;
        this.lenght = lenght;
        this.bytesSent = bytesSent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public int getLength() {
        return this.lenght;
    }

    @Override
    public int getBytesSent() {
        return this.bytesSent;
    }
}
