package F08JavaOOPExamTasks.T01HighQualityStructure.magicGame.models.magicians;

import magicGame.Utils.StringUtils;
import F08JavaOOPExamTasks.T01HighQualityStructure.magicGame.common.ExceptionMessages;
import F08JavaOOPExamTasks.T01HighQualityStructure.magicGame.models.magics.Magic;

public abstract class MagicianImpl implements Magician {
    private String username;
    private int health;
    private int protection;
    private boolean isAlive;
    private Magic magic;

    public MagicianImpl(String username, int health, int protection, Magic magic) {
        this.setUsername(username);
        this.setHealth(health);
        this.setProtection(protection);
        this.setMagic(magic);
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAlive() {
        return isAlive;
    }

    @Override
    public Magic getMagic() {
        return magic;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getProtection() {
        return protection;
    }

    private void setUsername(String username) {
        if (StringUtils.isNullOrEmpty(username)) {
            throw new NullPointerException(ExceptionMessages.INVALID_MAGICIAN_NAME);
        }
        this.username = username;
    }

    private void setHealth(int health) {
        if (health < 0) {
            throw new IllegalArgumentException(ExceptionMessages.INVALID_MAGICIAN_HEALTH);
        }
        this.health = health;
    }

    private void setProtection(int protection) {
        if (health < 0) {
            throw new IllegalArgumentException(ExceptionMessages.INVALID_MAGICIAN_PROTECTION);
        }
        this.protection = protection;
    }

    private void setAlive(boolean alive) {
        if (health > 0) {
            isAlive = alive;
        }
    }

    private void setMagic(Magic magic) {
        if (magic == null) {
            throw new NullPointerException(ExceptionMessages.INVALID_MAGIC);
        }
        this.magic = magic;
    }

    @Override
    public void takeDamage(int points) {
        this.protection -= points;

        if (protection == 0) {
            this.health += points;
        } else {
            this.health -= points;
        }

        if (health <= 0) {
            isAlive = false;
        }
    }
}
