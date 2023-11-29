package F06Reflection.Exercise.T03BarracksWarsANewFactory;

import F06Reflection.Exercise.T03BarracksWarsANewFactory.interfaces.Repository;
import F06Reflection.Exercise.T03BarracksWarsANewFactory.interfaces.Runnable;
import F06Reflection.Exercise.T03BarracksWarsANewFactory.interfaces.UnitFactory;
import F06Reflection.Exercise.T03BarracksWarsANewFactory.core.Engine;
import F06Reflection.Exercise.T03BarracksWarsANewFactory.core.factories.UnitFactoryImpl;
import F06Reflection.Exercise.T03BarracksWarsANewFactory.data.UnitRepository;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}
