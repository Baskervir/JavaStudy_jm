public class Student {
    private Stirng name;
    private Vector<Course> courses;

    public Student(String name) {
        this.name = name;
        courses = new Vector<Course>();
    }

    public void registerCourse(Course course) {
        courses.add(course);
    }

    public void dropCourse(Course course) {
        if (course.contains(course)) {
            courses.remove(course);
        }
    }

    public Vector<Course> getCourses() {
        return courses;
    }

    public class Course {
        private String name;
    }

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}