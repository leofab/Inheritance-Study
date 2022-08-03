public class Lawyer extends Employee{

  // Add this method opvly for lawyers

  public char getLawyerPosition(){
    return 'm';
  }

  @Override
  public double getSalary() {
    return 4500;
  }
}
