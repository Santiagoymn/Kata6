package factories.regionalfactories;

import factories.ToyFactory;
import toyproducts.Toy;
import toyproduct.models.AmericanCarToy;


public class AmericanCarToyFactory extends ToyFactory{
    
    @Override
    public Toy createToy(Integer serialNumber){
        return new AmericanCarToy(serialNumber);         
    }   
}
