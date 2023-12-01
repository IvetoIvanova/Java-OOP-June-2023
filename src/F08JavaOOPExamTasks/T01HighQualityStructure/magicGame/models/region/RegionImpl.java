package F08JavaOOPExamTasks.T01HighQualityStructure.magicGame.models.region;

import F08JavaOOPExamTasks.T01HighQualityStructure.magicGame.models.magicians.Magician;
import F08JavaOOPExamTasks.T01HighQualityStructure.magicGame.models.magicians.Wizard;

import java.util.Collection;

public class RegionImpl implements Region{
    @Override
    public String start(Collection<Magician> magicians) {

        while (true){
            int wizardsTotalDamage = 0;
            for(Magician magician:magicians){
                if(magician.getUsername().equals("Wizard")){
                    wizardsTotalDamage+=magician.getMagic().getBulletsCount();
                }
            }
            for(Magician magician:magicians){
                if(magician.getUsername().equals("BlackWidow")){
                    int health = magician.getHealth();
                    if(health>0){
                        magician.takeDamage(wizardsTotalDamage);
                    }
                }
            }

            boolean blackWidowsDefeated = true;
            for(Magician magician: magicians){
                if(magician.getUsername().equals("BlackWidow")&& magician.getHealth()>0){
                    blackWidowsDefeated = false;
                    break;
                }
            }
            if(blackWidowsDefeated){
                return "Wizard win!";
            }

            int blackWidowsTotalDamage = 0;
            for(Magician magician : magicians){
                if(magician.getUsername().equals("BlackWidow")){
                    blackWidowsTotalDamage += magician.getMagic().getBulletsCount();
                }
            }
            for(Magician magician : magicians){
                if(magician.getUsername().equals("Wizard")){
                    int health = magician.getHealth();
                    if(health>0){
                        magician.takeDamage(blackWidowsTotalDamage);
                    }
                }
            }
            boolean wizardDefeated = true;
            for(Magician magician: magicians){
                if(magician.getUsername().equals("Wizard")&& magician.getHealth()>0){
                    wizardDefeated = false;
                    break;
                }
            }
            if(wizardDefeated){
                return "Black widows win!";
            }
        }
    }
}
