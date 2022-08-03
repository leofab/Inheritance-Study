public class CodeTest {

  public static void main(String[] args){

    // Creation of objects

    Employee e = new Employee();
    Lawyer l = new Lawyer("kenth");
    Secretary s = new Secretary();
    Marketeer m = new Marketeer();
    LegalSecretary ls = new LegalSecretary();

    Lawyer l1 = new Lawyer("john");
    Lawyer l2 = new Lawyer("john");
    Lawyer l3 = l2;

    //comparing the references of objects
    System.out.println(l1 == l2); // false
    //comparing the content of objects
    System.out.println(l2 == l3); //true

    System.out.println(e.getVacationDays());
    System.out.println(l.getLawyerPosition());
    System.out.println(l.getSalary());
    System.out.println(s.getVacationDays());
    System.out.println(m.getHours());
    System.out.println(m.getVacationDays());
    System.out.println(m.getSalary());
    System.out.println(ls.getVacationDays());

    // POlyMorphism - the same code used by different types of objects

    Employee[] employees = new Employee[10];
    employees[0] = l;
    employees[1] = s;
    employees[2] = m;
    employees[3] = ls;

    Employee employee1 = new Lawyer();
    Employee employee2 = new Secretary();
    Employee employee3 = new Marketeer();
    Employee employee4 = new LegalSecretary();

    //employee3.insideMarket(); it doest not recognize insideMarket cause its declared as Employee

    ((Marketeer) employee3).insideMarket(); // the right way to declare the method
    m.insideMarket();
  }
}
