public class Professor {
    private Student student;

    public void setStudent(Student student) {
        this.student = student;
        student.setAdvisor(this);
    }

    public void advise() {
        student.advise("상담 내용");
    }
}

public class Student {
    private Professor advisor;

    public void setAdvisor(Professor advisor) {
        this.advisor = advisor;
    }

    public void advise(String msg) {
        System.out.println(msg);
    }

    public class Main {
        public static void main(String[] args) {
            Professor hongGilDong = new Professor();
            Student manSup = new Student();
            hongGilDong.setStudent(manSup);
            hongGilDong.advise();
        }
    }
}