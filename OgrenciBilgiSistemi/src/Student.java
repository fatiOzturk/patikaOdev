public class Student {
    String name;
    int studentNumber;
    int classes;
    Course matematik;
    Course fizik;
    Course kimya;
    double avarageMatematik, avarageFizik, avarageKimya;
    double avarage;
    boolean isPass;

    Student(String name, int studentNumber, int classes, Course matematik, Course fizik, Course kimya) {

        this.name = name;
        this.studentNumber = studentNumber;
        this.classes = classes;
        this.matematik = matematik;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }

    public void addBulkExamNote(int matematik, int fizik, int kimya) {

        if (matematik >= 0 && matematik <= 100) {
            this.matematik.examNote = matematik;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.examNote = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.examNote = kimya;
        }
    }

    public void addBulkVerbalNote(int matematik, int fizik, int kimya) {

        if (matematik >= 0 && matematik <= 100) {
            this.matematik.verbalNote = matematik;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.verbalNote = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.verbalNote = kimya;
        }
    }

    public void isPass() {
        if ((this.matematik.examNote == 0 || this.fizik.examNote == 0 || this.kimya.examNote == 0
                || this.matematik.verbalNote == 0 || this.fizik.verbalNote == 0 || this.kimya.verbalNote == 0)) {
            System.out.println("Notlar tam olarak girilmedi.");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarageMatematik = this.matematik.examNote * 0.80 + this.matematik.verbalNote * 0.20;
        this.avarageFizik = this.fizik.examNote * 0.70 + this.fizik.verbalNote * 0.30;
        this.avarageKimya = this.kimya.examNote * 0.60 + this.kimya.verbalNote * 0.40;
        this.avarage = (avarageMatematik + avarageFizik + avarageKimya) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu Ort : " + this.avarageMatematik);
        System.out.println("Fizik Notu Ort : " + this.avarageFizik);
        System.out.println("Kimya Notu Ort : " + this.avarageKimya);
    }
}

