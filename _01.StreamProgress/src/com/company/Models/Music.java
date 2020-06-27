package com.company.Models;

import com.company.Interface.IStreamable;

public class Music implements IStreamable {
    private String artist;
    private String album;
    private int length;
    private int bytesSent;

    public Music(String artist, String album, int length, int bytesSent) {
        this.artist = artist;
        this.album = album;
        this.length = length;
        this.bytesSent = bytesSent;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setBytesSent(int bytesSent) {
        this.bytesSent = bytesSent;
    }

    @Override
    public int getLength() {
        return this.length;
    }

    @Override
    public int getBytesSent() {
        return this.bytesSent;
    }
}
