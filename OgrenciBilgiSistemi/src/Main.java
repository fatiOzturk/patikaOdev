public class Main {
    public static void main(String[] args) {
        Course matematik = new Course("Matematik","MAT101","MAT");
        Course fizik = new Course("Fizik","FZK101","FZK");
        Course kimya = new Course("Kimya","KMY101","KMY");

        Teacher matTeacher = new Teacher("Fulya Hoca","3211","MAT");
        Teacher fizTeacher = new Teacher("Dilruba Hoca","1909","FZK");
        Teacher kimTeacher = new Teacher("Ahmet Hoca","1906","KMY");



        matematik.addTeacher(matTeacher);
        fizik.addTeacher(fizTeacher);
        kimya.addTeacher(kimTeacher);

        Student s1 = new Student("Bilo",123,5,matematik,fizik,kimya);
        s1.addBulkExamNote(78,80,56);
        s1.addBulkVerbalNote(60,75,90);
        s1.isPass();

        Student s2 = new Student("Maho",124,5,matematik,fizik,kimya);
        s2.addBulkExamNote(80,80,80);
        s2.addBulkVerbalNote(90,90,90);
        s2.isPass();

        Student s3 = new Student("Feyzo",125,5,matematik,fizik,kimya);
        s3.addBulkExamNote(50,40,50);
        s3.addBulkVerbalNote(70,70,70);
        s3.isPass();
    }
}