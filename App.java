//64050355 Jirapat Pichai
public class App {
    public static void main(String[] args) {
        Student jirapat = new Student.StudentBuilder("Jirapat", "KMITL")
            .setAge(21)
            .build();
        System.out.println(jirapat);
    }
}
