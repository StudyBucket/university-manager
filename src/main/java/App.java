package unimanager;

public class App {

    public static void main(String[] args) {
        /* prepare some demo data */
        Lecturer[] lecturerArray = new Lecturer[3];
        lecturerArray[0] = (new Lecturer("Ludwig Mies", "van der Rohe", 101));
        lecturerArray[1] = (new Lecturer("László", "Moholy-Nagy", 102, "Formmeister"));
        lecturerArray[2] = (new Lecturer("Anni", "Albers", 103, "Werkstattmeisterin"));

        Student[] studentArray = new Student[4];
        studentArray[0] = (new Student("Max", "Muster", 1));
        studentArray[1] = (new Student("János", "Kovács", 2));
        studentArray[2] = (new Student("John", "Doe", 3));
        studentArray[3] = (new Student("Ivan", "Horvat", 4));

        /* print out demo data */
        System.out.println("-----------------------------");
        System.out.println("| Bauhaus university-manager |");
        System.out.println("-----------------------------\n\n");

        System.out.println("Registered Lecturers\n");
        for( Lecturer l: lecturerArray ){
            l.printPerson();
        }

        System.out.println("\n\nEnrolled Students\n");
        for( Student s: studentArray ){
            s.printPerson();
        }
    }
}
