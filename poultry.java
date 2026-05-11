public class Poultry extends Livestockzone{

    private int egg_count = 0;

    public Poultry(String name  , double L , double l ) {
        super(name ,  L ,  l );
    }
    public void recordProduction(double value){
        egg_count += (int)value;
    }

}
