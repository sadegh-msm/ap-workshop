package Salamat;

public abstract class Person {
    //name of person
    private String name;

    /**
     * cunstructor for Person
     * @param name
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     * getter for name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *setter for name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}

