package lab3;

class Study {
    private String course;
    public Study(String course) {
        this.course = course;
    }

    public String printCourse() {
        System.out.println(this.course);
        return this.course;
    }
}

