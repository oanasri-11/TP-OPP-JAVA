public class Poultry extends Livestockzone{

    private int egg_count = 0;

    public Poultry(String name  , double L , double l ) {
        super(name ,  L ,  l );
    }
    public void recordProduction(double value){
        egg_count += (int)value;
    }

  //  public void recordProduction(double d){}

    public void addAnimal(Animal a) throws WrongAnimalSpecieException{

        if( a.getSpecie() != AnimalSpecie.poultry) throw new WrongAnimalSpecieException();  
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
