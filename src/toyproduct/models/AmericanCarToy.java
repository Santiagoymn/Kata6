package toyproduct.models;

import componentfactories.ComponentFactory;
import componentfactories.regionalcomponentfactories.AmericanComponentFactory;
import toyproducts.Toy;
import toyproducts.components.Engine;
import toyproducts.components.Wheel;


public class AmericanCarToy implements Toy {
    private final Integer serialNumber;
    private final String type = "car";
    private final ComponentFactory factory;
    private Engine engine;
    private final Wheel[] wheels = new Wheel[4];

    public AmericanCarToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
        this.factory = new AmericanComponentFactory();
    }


    @Override
    public Integer getSerialNumber() {
        return serialNumber;
    }

    public String getType() {
        return type;
    }
    
    
    @Override
    public void pack(){
        System.out.printf("Packing '%s' '%d'\n", this.type, this.serialNumber);
        
    }
    
    @Override
    public void label(){
        System.out.printf("Labelling '%s' '%d'\n",  this.type,this.serialNumber);   
    }
    
    @Override
    public void prepare() {
        this.engine = this.factory.createEngine();
        for (int i = 0; i < wheels.length; i++) {
            this.wheels[i] = this.factory.createWheel();      
        } 
    }

    @Override
    public String toString() {
        return "AmericanCarToy{" + "serialNumber=" + serialNumber + '}';
    }
    
}
