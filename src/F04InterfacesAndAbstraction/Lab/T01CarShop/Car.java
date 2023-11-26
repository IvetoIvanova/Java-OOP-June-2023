package F04InterfacesAndAbstraction.Lab.T01CarShop;

import java.io.Serializable;

public interface Car extends Serializable {
    Integer TIRES = 4;

    String getModel();

    String getColor();

    Integer getHorsePower();
}
