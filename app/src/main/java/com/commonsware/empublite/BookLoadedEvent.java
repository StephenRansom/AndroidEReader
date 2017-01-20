package com.commonsware.empublite;

/**
 * Created by XKDVD on 1/20/2017.
 */

public class BookLoadedEvent {
    private BookContents contents = null;

    public BookLoadedEvent(BookContents contents){
        this.contents=contents;
    }

    public BookContents getBook(){
        return(contents);
    }
}
