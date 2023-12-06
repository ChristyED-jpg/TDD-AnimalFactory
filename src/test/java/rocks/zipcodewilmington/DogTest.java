package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }


    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`

    @Test
    public void testNewDog() {
        //Given
        Date birthDate = new Date();
        Integer id = 0;
        String name = "Milo";

        //when
        Dog dog = new Dog(name, birthDate, id);
        dog.setName(name);

        //then
        Assert.assertNotNull(name);
    }


    // TODO - Create tests for `speak`

    @Test
    public void testSpeak() {
        //Given
        Date birthDate = new Date();
        Integer id = 0;
        String name = "Milo";

        //when
        Dog dog = new Dog(name, birthDate, id);
        String expected = "bark!";

        //then
        Assert.assertNotNull(expected);
    }


    // TODO - Create tests for `setBirthDate(Date birthDate)`

    @Test
    public void testBirtDate() {
        // Given
        Date birthDate = new Date();
        Integer id = 0;
        String name = "Milo";

        //when
        Dog dog = new Dog(name, birthDate, id);
        dog.setBirthDate(birthDate);


        // then
        Assert.assertNotNull(birthDate);

    }

    // TODO - Create tests for `void eat(Food food)`

    @Test
    public void testEat() {
        // Given
        Date birthDate = new Date();
        Integer id = 0;
        String name = "Milo";

        // when
        Dog dog = new Dog(name, birthDate, id);
        Food food = new Food();
        dog.eat(food);

        //then
        Assert.assertNotNull(food);
    }

    // TODO - Create tests for `Integer getId()`

    @Test

    public void testGetId() {
        // Given
        Date birthDate = new Date();
        Integer id = 0;
        String name = "Milo";

        // when
        Dog dog = new Dog(name, birthDate, id);
        dog.getId();

        //then
        Assert.assertNotNull(0);

    }

    // TODO - Create test to check Animal inheritance;
    @Test
    public void testAnimal() {
        Date birthDate = new Date();
        Integer id = 0;
        String name = "Milo";

        Dog dog = new Dog(name, birthDate, id);

        Assert.assertTrue(dog instanceof Animal);
    }

    // TODO - Create test to check Mammal inheritance;

    @Test
    public void testMammal() {
        Date birthDate = new Date();
        Integer id = 0;
        String name = "Milo";

        Dog dog = new Dog(name, birthDate, id);

        Assert.assertTrue(dog instanceof Mammal);



    }


}











