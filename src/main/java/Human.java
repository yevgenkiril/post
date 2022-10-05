import java.time.LocalDate;
import java.util.Objects;

public class Human {
    private static int id;
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private final int identifier;

    public Human(String firstName, String lastName, LocalDate birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        id+=id;
        identifier = id;
    }

    public int getIdentifier() {
        return identifier;
    }

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

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return identifier == human.identifier && Objects.equals(firstName, human.firstName) && Objects.equals(lastName, human.lastName) && Objects.equals(birthday, human.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, birthday, identifier);
    }
}
