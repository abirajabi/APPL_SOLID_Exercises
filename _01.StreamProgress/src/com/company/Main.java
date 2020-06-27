package com.company;

import com.company.Models.File;
import com.company.Models.Music;
import com.company.Models.StreamProgressInfo;

public class Main {

    public static void main(String[] args) {
	// write your code here
        File file = new File("Test", 12, 12);
        Music music = new Music("Some name", "Cool", 15, 2222);

        StreamProgressInfo streamFileInfo = new StreamProgressInfo(file);
        StreamProgressInfo streamMusicInfo = new StreamProgressInfo(music);

        System.out.println(streamFileInfo.calculateCurrentPercent());
        System.out.println(streamMusicInfo.calculateCurrentPercent());
    }
}
