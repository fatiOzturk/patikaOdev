public class Course {
    Teacher courseTeacher;
    String name;
    String prefix;
    String code;
    int examNote;
    int verbalNote;

    public Course (String name,String code,String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.examNote = 0;
        this.verbalNote = 0;
    }
    public void addTeacher(Teacher teacher){
        if (this.prefix.equals(teacher.branch)){
            this.courseTeacher = teacher;
            System.out.println("İşlem onaylandı. Yeni "+this.name+" öğretmeni : "+ this.courseTeacher.name);

        } else {
            System.out.println(teacher.name + " bu dersi veremez!");
        }
    }
    public void printTeacher(){
        if (courseTeacher != null) {
            System.out.println(this.name + "dersinin öğretmeni : "+ courseTeacher.name);
        } else {
            System.out.println(this.name + "dersine öğretmen atanmamıştır.");
        }
    }

}
