import java.util.Vector;

public class Student {
    private Vector<Transcript> transcripts;
    private String name;

    public Student(String name) {
        this.name = name;
        transcripts = new Vector<Transcript>();
    }

    public void addTranscript(Transcript transcript) {
        transcripts.add(transcript);
    }
}