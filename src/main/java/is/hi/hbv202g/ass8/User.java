package is.hi.hbv202g.ass8;

/**
 * @author Ester Jenný (ejb7)
 **/
public abstract class User {
    private String name;
    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
