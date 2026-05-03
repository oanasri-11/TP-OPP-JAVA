public abstract  class Animal{

  static int numberAnimals = 0;

  private int uniquenumber;
  private int age;
  private double weight;
  private Healthstatus healthstatus;


  public Animal(int age, double weight, Healthstatus healthstatus) {
    numberAnimals ++ ;
    this.uniquenumber = numberAnimals;
    this.age = age;
    this.weight = weight;
    this.healthstatus = healthstatus;
  }


  



}