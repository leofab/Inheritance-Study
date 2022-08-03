public class CodeTest {

  public static void main(String[] args){

    // Creation of objects

    Employee e = new Employee();
    Lawyer l = new Lawyer();
    Secretary s = new Secretary();
    Marketeer m = new Marketeer();
    LegalSecretary ls = new LegalSecretary();

    System.out.println(e.getVacationDays());
    System.out.println(l.getLawyerPosition());
    System.out.println(l.getSalary());
    System.out.println(s.getVacationDays());
    System.out.println(m.getHours());
    System.out.println(m.getVacationDays());
    System.out.println(m.getSalary());
    System.out.println(ls.getVacationDays());

  }
}
