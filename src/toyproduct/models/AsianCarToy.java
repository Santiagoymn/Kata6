package toyproduct.models;

import toyproducts.Toy;


public class AsianCarToy implements Toy {
    private final Integer serialNumber;
    private final String type = "car";

    public AsianCarToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
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
    public String toString() {
        return "AsianCarToy{" + "serialNumber=" + serialNumber + '}';
    }
    
    
}
