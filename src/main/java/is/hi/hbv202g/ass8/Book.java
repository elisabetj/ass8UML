package is.hi.hbv202g.ass8;

import java.util.List;

/**
 * @author Ester Jenný (ejb7)
 **/
public class Book {
    private String title;


    public Book(String title, List<Author> authors) {

        this.title = title;
    }

    public void addAuthor(Author author){
    }

    public List<Author> getAuthors() throws EmptyAuthorListException{

        return null;
    }

    public void setAuthors(List<Author> authors){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
