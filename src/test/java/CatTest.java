import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by aivanenk on 16.02.2016.
 */
public class CatTest {

     public double speed;
     public String name;

    @BeforeMethod()
     public void setPreconditions()
    {
      speed=12.6;
        name="Siamese";
        System.out.print("Preconditions are set"+"\n");
    };

    @Test()
    public void comparisonOfSpeed()
    {
        Cat BarsikTest = new Cat(12.6, "Siamese");
        Assert.assertEquals(BarsikTest.getMaxSpeed(),speed);
        System.out.print("Speed test result"+"\n");

    }


    @Test()
    public void comparisonOfName()
    {
        Cat BarsikTest = new Cat(16.66, "Siamese");
        Assert.assertEquals(BarsikTest.getSortName(),name);
        System.out.print("Name test result"+"\n");
    }

    @AfterMethod()
    public void afterTest()
    {
        System.out.println("Test was executed"+"\n");
    }

}
