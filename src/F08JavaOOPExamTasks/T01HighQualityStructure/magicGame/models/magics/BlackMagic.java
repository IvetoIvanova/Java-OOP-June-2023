package F08JavaOOPExamTasks.T01HighQualityStructure.magicGame.models.magics;

public class BlackMagic extends MagicImpl {
    private final static int BULLET_THAT_BLACK_MAGIC_CAN_FIRE = 10;

    public BlackMagic(String name, int bulletsCount) {
        super(name, bulletsCount);
    }

    @Override
    public int fire() {
        if (getBulletsCount() >= BULLET_THAT_BLACK_MAGIC_CAN_FIRE) {
            return getBulletsCount() - BULLET_THAT_BLACK_MAGIC_CAN_FIRE;
        }
        return 0;
    }
}
