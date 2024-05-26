package person;

public class Person {
    private int personId;
    private String personName;
    private int personAge;

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public Person(int personId, String personName, int personAge) {
        this.personId = personId;
        this.personName = personName;
        this.personAge = personAge;
    }

    @Override
    public String toString() {
        return "Person [personId=" + personId + ", personName=" + personName + ", personAge=" + personAge + "]";
    }

}
