package com.commonsware.empublite;

import java.util.List;

/**
 * Created by XKDVD on 1/20/2017.
 */

public class BookContents {
    List<Chapter> chapters;

    int getChapterCount(){
        return(chapters.size());
    }

    String getChapterFile(int position){
        return(chapters.get(position).file);
    }

    String getChapterTitle(int position){
        return(chapters.get(position).title);
    }

    static class Chapter{
        String file;
        String title;
    }
}
