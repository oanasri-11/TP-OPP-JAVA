public class Ruminateszone extends Livestockzone{

private double milk_yield;

public Ruminateszone(String name , double L , double l) {
    super(name , L , l);
    type = ZoneType.ruminateszone;
  }

  public void recordProduction(double value){
    record.recordMilkYield(milk_yield);
  }

  public void addAnimal(Animal a) throws WrongAnimalSpecieException{

    if( a.getSpecie() != AnimalSpecie.ruminant) throw new WrongAnimalSpecieException();  
    a.setZone(this);

    GPScollars gs = new GPScollars(this , this.longitude , this.latitude );
    gs.setAnimal(a);
    gpsCollars.add(gs);

    BiometricSensor bs = new BiometricSensor(this , this.longitude , this.latitude );
    bs.setAnimal(a);
    bioSensors.add(bs);
    
    animals.add(a);
}


}
