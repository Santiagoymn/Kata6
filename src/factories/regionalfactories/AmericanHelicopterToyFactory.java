package factories.regionalfactories;

import factories.ToyFactory;
import toyproducts.Toy;
import toyproduct.models.AmericanHelicopterToy;


public class AmericanHelicopterToyFactory extends ToyFactory{
    
    @Override
    public Toy createToy(Integer serialNumber){
        return new AmericanHelicopterToy(serialNumber);          
    }
    
}
