package adapter.adapter;

import adapter.adapter.api.LibraryAPI;
import adapter.adapter.api.LibraryAPIv2;

import java.time.LocalDate;

public class APIAdapter implements LibraryAPI {

    private final LibraryAPIv2 apIv2;
    private final User user;


    public APIAdapter(LibraryAPIv2 apIv2, User user) {
        this.apIv2 = apIv2;
        this.user = user;
    }

    @Override
    public boolean isAviable(String bookTitle) {
        return apIv2.numberOfAviableCopies(bookTitle)>0;
    }

    @Override
    public LocalDate dueDate(String bookTitle, String pesel) {
        return apIv2.dueDate(bookTitle, user.getFirstName(), user.getLastName(), user.getDateOfBirth());
    }

    @Override
    public boolean reserve(String bookTitle, String pesel) {
        return apIv2.reserve(bookTitle, user.getFirstName(), user.getLastName(), user.getDateOfBirth());
    }
}




