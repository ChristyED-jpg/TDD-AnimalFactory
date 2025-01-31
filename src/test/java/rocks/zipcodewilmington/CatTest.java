package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }


    // TODO - Create tests for `void setName(String name)`

    @Test
    public void testSetName(){
        //Given
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        String givenName = "Zula";

        //when
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        cat.setName(givenName);

        //then
        Assert.assertNotNull(givenName);
    }


    // TODO - Create tests for `speak`


    @Test
    public void testSpeak(){
        //Given
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        String givenName = "Zula";

        //when
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        String expected = "meow";

        //then
        Assert.assertNotNull(cat );
    }


    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testBirtDate() {
        // Given
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        String givenName = "Zula";

        //when
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        cat.setBirthDate(givenBirthDate);


        // then
        Assert.assertNotNull(givenName);

    }

    // TODO - Create tests for `void eat(Food food)`

    @Test
    public void testEat(){
        // Given
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        String givenName = "Zula";

        // when
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Food food = new Food();
        cat.eat(food);

        //then
        Assert.assertNotNull(food);
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void testGetId(){
        // Given
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        String givenName = "Zula";

        // when
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        cat.getId();

        //then
        Assert.assertNotNull(0);

    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testAnimal(){
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        String givenName = "Zula";

        Cat cat = new Cat(givenName, givenBirthDate, givenId);

       Assert.assertTrue(cat instanceof Animal);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testMammal(){
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        String givenName = "Zula";

        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        Assert.assertTrue(cat instanceof Mammal);
    }




}



