package F06Reflection.Exercise.T04BarracksWarsTheCommandsStrikeBack;

import F06Reflection.Exercise.T04BarracksWarsTheCommandsStrikeBack.interfaces.Repository;
import F06Reflection.Exercise.T04BarracksWarsTheCommandsStrikeBack.interfaces.Runnable;
import F06Reflection.Exercise.T04BarracksWarsTheCommandsStrikeBack.interfaces.UnitFactory;
import F06Reflection.Exercise.T04BarracksWarsTheCommandsStrikeBack.core.Engine;
import F06Reflection.Exercise.T04BarracksWarsTheCommandsStrikeBack.core.factories.UnitFactoryImpl;
import F06Reflection.Exercise.T04BarracksWarsTheCommandsStrikeBack.data.UnitRepository;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}
