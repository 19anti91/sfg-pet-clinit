package guru.springframework.sfgpetclinic.model;

/**
 * Created by Anti1991 on 10/8/2018
 */
public class Person extends BaseEntity {


    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
