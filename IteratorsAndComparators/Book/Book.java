package Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book {
    //-	title: String
    //-	year: int
    //-	authors: List<String>
    //-	setTitle(String)
    //-	setYear(String)
    //-	setAuthors(String…)
    //+	getTitle(): String
    //+	getYear(): int
    //+	getAuthors(): List<String>
    private String title;
    private int year;
    private List<String>authors;

    public Book(String title, int year, String... authors) {
        this.title = title;
        this.year = year;
        this.authors = new ArrayList<>(Arrays.asList(authors));
    }

    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    private void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    private void setAuthors(List<String> authors) {
        this.authors = authors;
    }
}
