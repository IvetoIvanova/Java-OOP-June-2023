package F08JavaOOPExamTasks.T03UnitTesting.archeologicalExcavations;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExcavationTests {
    private Archaeologist archaeologist1;
    private Archaeologist archaeologist2;
    private Excavation testExcavation;

    @Before
    public void setup() {
        testExcavation = new Excavation("Stone", 10);
        archaeologist1 = new Archaeologist("Mike", 5.5);
        archaeologist2 = new Archaeologist("Ben", 10.5);
    }


    @Test
    public void testExcavation() {
        Excavation excavation = new Excavation("Klara", 5);
        Assert.assertEquals(excavation.getName(), "Klara");
        Assert.assertEquals(excavation.getCapacity(), 5);
        Assert.assertEquals(0, excavation.getCount());
    }


    @Test(expected = IllegalArgumentException.class)
    public void testSetCapacityBelowZeroShouldThrow() {
        Excavation excavation = new Excavation("Dictionary", -5);
    }

    @Test(expected = NullPointerException.class)
    public void testSetNameNullShouldThrow() {
        Excavation excavation = new Excavation(null, 5);
    }

    @Test(expected = NullPointerException.class)
    public void testSetNameNullEmptyShouldThrow() {
        Excavation excavation = new Excavation("", 5);
    }

    @Test(expected = NullPointerException.class)
    public void testSetNameWhitespaceShouldThrow() {
        Excavation excavation = new Excavation(" ", 5);
    }

    @Test
    public void testAddArchaeologistSuccessful() {
        testExcavation.addArchaeologist(archaeologist1);
        Assert.assertEquals(1, testExcavation.getCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddArchaeologistWithNoCapacityShouldTrow() {
        Excavation excavation = new Excavation("Stone", 1);
        excavation.addArchaeologist(archaeologist1);
        excavation.addArchaeologist(archaeologist2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddArchaeologistWithDuplicateNameShouldTrow() {
        testExcavation.addArchaeologist(archaeologist1);
        testExcavation.addArchaeologist(archaeologist1);
    }

    @Test
    public void testRemoveArchaeologistSuccessfully() {
        testExcavation.addArchaeologist(archaeologist1);
        Assert.assertTrue(testExcavation.removeArchaeologist(archaeologist1.getName()));
        Assert.assertEquals(0, testExcavation.getCount());
    }

    @Test
    public void testRemoveArchaeologistUnsuccessfully() {
        testExcavation.addArchaeologist(archaeologist1);
        Assert.assertFalse(testExcavation.removeArchaeologist(archaeologist2.getName()));
        Assert.assertEquals(1, testExcavation.getCount());
    }

}
