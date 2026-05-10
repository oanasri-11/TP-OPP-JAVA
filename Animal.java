public abstract  class Animal{

  static int numberAnimals = 0;

  private int uniquenumber;
  private int age;
  private double weight;
  private Healthstatus healthstatus;


  public Animal(int age, double weight, Healthstatus healthstatus) {// we can say the are the same ,we can reomove one of them 
    numberAnimals ++ ;
    this.uniquenumber = numberAnimals;
    this.age = age;
    this.weight = weight;
    this.healthstatus = healthstatus;
  }
  public void registerAnimal(int age, double weight, Healthstatus healthstatus){
    this.age = age;
    this.weight = weight;
    this.healthstatus = healthstatus;
  }
  public int getUniquenumber(){
      return uniquenumber;
  }
  public int getAge(){
    return age;
  }
  public double getWeight(){
    return weight;
  }
  public Healthstatus getHealthstatus(){
    return healthstatus;
  }

  public void loghealsthevent(Healthstatus status ,double weight){
    this.healthstatus = status;
    this.weight = weight; 
  }



  



}