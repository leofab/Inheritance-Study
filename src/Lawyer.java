public class Lawyer extends Employee{
  String nameLawyer;

  // Add this method opvly for lawyers

  public char getLawyerPosition(){
    return 'm';
  }

  @Override
  public double getSalary() {
    return 4500;
  }

  // Constructor
  public Lawyer(String nameLawyer){
    this.nameLawyer = nameLawyer;
  }

  public Lawyer() {
  }
}
