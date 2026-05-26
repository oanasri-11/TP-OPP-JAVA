public class Poultryzone extends Livestockzone{

    private int egg_count = 0;

    public Poultryzone(String name  , double L , double l ) {
        super(name ,  L ,  l );
        type = ZoneType.Poultryzone;
    }

    public void recordProduction(double value){
        record.recordEggCount(egg_count);
    }


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
