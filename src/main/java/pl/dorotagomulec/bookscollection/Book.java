package pl.dorotagomulec.bookscollection;

import lombok.*;



@AllArgsConstructor
@Data
public class Book {

    @NonNull
    private String title;
    private String author;
    private int pages;
    boolean isFinished;
}
