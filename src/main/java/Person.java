package unimanager;

class Person {
    String firstname;
    String lastname;

    /* Constructor */
    public Person(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }

    /* Setter */
    public void setFirstname(String value){
        this.firstname = value;
    }

    public void setLastname(String value){
        this.lastname = value;
    }

    /* Getter */
    public String getFirstname(){
        return this.firstname;
    }

    public String getLastname(){
        return this.lastname;
    }

    /* Print */
    public void printPerson(){
        System.out.println("First Name: " + firstname);
        System.out.println("Last Name: " + lastname);
        System.out.println("--");
    }
}
