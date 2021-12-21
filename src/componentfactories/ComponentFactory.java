package componentfactories;

import toyproducts.components.Engine;
import toyproducts.components.RotorBlade;
import toyproducts.components.Wheel;

public interface ComponentFactory {
    
    Wheel createWheel();
    Engine createEngine();
    RotorBlade createRotorBlade();
    
}
