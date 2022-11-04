public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name,double salary, int workHours,int hireYear){
        this.name = name;
        this.workHours=workHours;
        this.hireYear = hireYear;
        this.salary = salary;

    }
    public double tax(){
        if (this.salary >=1000){
            double tax = this.salary*0.03;
            return tax;
        } else
            return salary;
    }
    double bonus(){
        if (workHours>40){
            double bonus= (workHours-40)*30;
            return bonus;
        } else
            return 0;
    }
    public double raiseSalary(){
        int workYear=2021-hireYear;
        double salaryIncrease;
        if (workYear<10){
            salaryIncrease = this.salary*0.05;
            return salaryIncrease;
        } else if (workYear>9 && workYear<20) {
            salaryIncrease =this.salary*0.1;
            return salaryIncrease;
        } else if (workYear>19) {
            salaryIncrease =this.salary*0.15;
            return salaryIncrease;
        }
        return 0;
    }
    public String toString(){

        double totalSalary = salary -tax() + bonus() + raiseSalary();
        double salaryWithTaxAndBonus = salary +bonus() - tax();
        System.out.println("Adı : "+name);
        System.out.println("Maaşı : "+ salary);
        System.out.println("Çalışma Saati : "+ workHours);
        System.out.println("Başlangıç Yılı : "+hireYear);
        System.out.println("Vergi : "+tax());
        System.out.println("Bonus : "+bonus());
        System.out.println("Maaş artışı : "+raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : "+salaryWithTaxAndBonus);
        System.out.println("Toplam Maaş : "+totalSalary);


        return null;
    }


}
