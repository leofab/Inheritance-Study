public class Marketeer extends Employee {

  // this method is only for maketeer
  public boolean insideMarket(){

    return true;
  }

  @Override
  public int getHours() {

    // Make it 50 instead of 40
    return super.getHours() + 10;
  }

  @Override
  public int getVacationDays() {
    return super.getVacationDays() + 10;
  }

  @Override
  public double getSalary(){
    return super.getSalary() +1000;
  }

}
