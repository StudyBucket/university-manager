package unimanager;

class Lecturer extends Person {
    int employeeId;
    String academicDegree;

    /* Constructors */
    public Lecturer(String firstname, String lastname, int employeeId, String academicDegree){
        super(firstname, lastname);
        this.employeeId = employeeId;
        this.academicDegree = academicDegree;
    }

    public Lecturer(String firstname, String lastname, int employeeId){
        super(firstname, lastname);
        this.employeeId = employeeId;
    }

    /* Setter */
    public void setEmployeeId(int value){
        this.employeeId = value;
    }

    public void setAcademicDegree(String value){
        this.academicDegree = value;
    }

    /* Getter */
    public int getEmployeeId(){
        return this.employeeId;
    }

    public String getAcademicDegree(){
        return this.academicDegree;
    }

    /* Print */
    public void printPerson(){
        System.out.println("First Name: " + firstname);
        System.out.println("Last Name: " + lastname);
        System.out.println("Degree: " + academicDegree);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("--");
    }
}
