package F08JavaOOPExamTasks.T01HighQualityStructure.magicGame.models.magics;

public class RedMagic extends MagicImpl {
    private final static int BULLET_THAT_RED_MAGIC_CAN_FIRE = 1;

    public RedMagic(String name, int bulletsCount) {
        super(name, bulletsCount);
    }

    @Override
    public int fire() {
        if (getBulletsCount() >= BULLET_THAT_RED_MAGIC_CAN_FIRE) {
            return getBulletsCount() - BULLET_THAT_RED_MAGIC_CAN_FIRE;
        }
        return 0;
    }


}
