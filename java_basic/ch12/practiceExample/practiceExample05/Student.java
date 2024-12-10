package ch12.practiceExample.practiceExample05;

public class Student {
    private String studentNum;

    public Student(String studentNum) {
        this.studentNum = studentNum;
    }

    public String getStudentNum() {
        return studentNum;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student target) {
            if(studentNum.equals(target.studentNum)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hashCode = studentNum.hashCode();
        return hashCode;
    }
}
