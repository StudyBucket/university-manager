package unimanager;

class Student extends Person {
    int studentId;

    /* Constructor */
    public Student(String firstname, String lastname, int studentId){
        super(firstname, lastname);
        this.studentId = studentId;
    }

    /* Setter */
    public void setStudentId(int value){
        this.studentId = value;
    }

    /* Getter */
    public int getStudentId(){
        return this.studentId;
    }

    /* Print */
    public void printPerson(){
        System.out.println("First Name: " + firstname);
        System.out.println("Last Name: " + lastname);
        System.out.println("Student ID: " + studentId);
        System.out.println("--");
    }
}
