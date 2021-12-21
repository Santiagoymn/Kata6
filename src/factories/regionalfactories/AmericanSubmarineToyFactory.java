package factories.regionalfactories;

import factories.ToyFactory;
import toyproduct.models.AmericanSubmarineToy;
import toyproducts.Toy;


public class AmericanSubmarineToyFactory extends ToyFactory{
    
    @Override
    public Toy createToy(Integer serialNumber){
        return new AmericanSubmarineToy(serialNumber);         
    }   
}
