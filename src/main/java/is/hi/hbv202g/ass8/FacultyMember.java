package is.hi.hbv202g.ass8;

/**
 * @author Ester Jenný (ejb7)
 **/
public class FacultyMember extends User {
    private String department;

    public FacultyMember(String name, String department) {
        super(name);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


}
