public class Course {
    private String courseName;
    private String code;

    public Course(String courseName,String code){
        this.courseName = courseName;
        this.code = code;
    }

    public String getCourseName(){
        return getCourseName();

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public double calcAvarage(Student[] students){
        double avarage=0.0;
        for( int i =0; i<students.length;i++){
            avarage += students[i].g
        }
        return 0.0;
    }
}
