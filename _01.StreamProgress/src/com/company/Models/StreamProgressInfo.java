package com.company.Models;

import com.company.Interface.IStreamable;

public class StreamProgressInfo {
    private IStreamable file;

    public StreamProgressInfo(IStreamable file) {
        this.file = file;
    }

    public int calculateCurrentPercent(){
        return file.getBytesSent() * 100 / file.getLength();
    }
}
