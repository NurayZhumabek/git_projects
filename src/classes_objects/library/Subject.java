package classes_objects.library;

public class Subject {
    String lesson;
    void info(){
        System.out.println("Subject:"+lesson);
    }

    @Override
    public String toString() {
        return "Subject{" +
                "lesson='" + lesson + '\'' +
                '}';
    }
}
