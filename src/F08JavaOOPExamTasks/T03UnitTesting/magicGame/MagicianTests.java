package F08JavaOOPExamTasks.T03UnitTesting.magicGame;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class MagicianTests {

    @Test(expected = NullPointerException.class)
    public void testSetUsernameShouldThrow(){
        new Magician(null,5);
    }

    @Test(expected = NullPointerException.class)
    public void testSetUsernameShouldThrowOnWhitespace(){
        new Magician(" ",5);
    }

    @Test(expected = NullPointerException.class)
    public void testSetUsernameShouldThrowOnBelowOne(){
        new Magician("",10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetHealthShouldThrowOnNegative(){
        new Magician("Iris", -1);
    }

    @Test(expected = IllegalStateException.class)
    public void testTakeDamageWhenAlreadyDead(){
        Magician magician = new Magician("Iris", 0);
        magician.takeDamage(10);
    }

    @Test
    public void testTakeDamageWithNegativeHealth(){
        Magician magician = new Magician("Iris", 10);
        magician.takeDamage(10);
        assertEquals("Expected health to be 0 as damage is greater than health", 0, magician.getHealth());
    }

    @Test
    public void testTakeDamage(){
        Magician magician = new Magician("Tom", 100);
        magician.takeDamage(20);
        assertEquals("Expected health to be decreased by 20", 80, magician.getHealth());
    }

    @Test
    public void testTakeDamageHealthBecomeZero(){
        Magician magician = new Magician("Berry", 50);
        magician.takeDamage(70);
        assertEquals(0, magician.getHealth());
    }

    @Test(expected = NullPointerException.class)
    public void testAddNullMagic(){
        Magician magician = new Magician("Merry",80);
        magician.addMagic(null);
    }

    @Test
    public void testRemoveMagic(){
        Magic magic1 = new Magic("Ice", 8);
        Magic magic2 = new Magic("Fire", 10);

        Magician magician = new Magician("Ben", 5);
        magician.addMagic(magic1);
        magician.addMagic(magic2);
        boolean isRemoved = magician.removeMagic(magic2);

        assertTrue(isRemoved);
        assertEquals(1, magician.getMagics().size());
        assertFalse(magician.getMagics().contains(magic2));

    }

    @Test
    public  void testGetMagicWithInvalidName(){
        Magic magic1 = new Magic("Ice", 8);
        Magic magic2 = new Magic("Fire", 10);

        Magician magician = new Magician("Ben", 5);
        magician.addMagic(magic1);
        magician.addMagic(magic2);

        Magic foundMagic = magician.getMagic("Thunderstorm");
        assertNull(foundMagic);
    }

    @Test
    public void testGetMagicWithValidName(){
        Magic magic1 = new Magic("Ice", 8);
        Magic magic2 = new Magic("Fire", 10);

        Magician magician = new Magician("Ben", 5);
        magician.addMagic(magic1);
        magician.addMagic(magic2);

        Magic foundMagic = magician.getMagic("Ice");
        assertNotNull(foundMagic);
        assertEquals("Ice", foundMagic.getName());
        assertEquals(8, foundMagic.getBullets());
    }

    @Test
    public void testGetUsername(){
        String expectedUsername = "John";
        Magician magician = new Magician(expectedUsername, 5);
        String actualUsername = magician.getUsername();
        Assert.assertEquals(expectedUsername, actualUsername);
    }


}
