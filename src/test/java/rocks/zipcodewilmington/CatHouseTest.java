package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.AnimalWarehouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {



    // TODO - Create tests for `void add(Cat cat)`

    @Test
    public void testadd() {
        // Given
        String name = "";
        Date birthDate = new Date();
        Integer Id = 1;
        Cat cat = new Cat(name, birthDate, Id);
        AnimalWarehouse<Cat> catHouse = new AnimalWarehouse<>();
        //When
        // check is a number was added to the cat house
        // catHouse is empty
        catHouse.add(cat);
        Integer expected = 1; // check is a number was added to the cat house
        Integer actual = catHouse.getNumberOfAnimals();// check if

        // then
       Assert.assertEquals(expected, actual);
    }


    // TODO - Create tests for `void remove(Integer id)`

    @Test
    public void testremovebyid(){
        // Given
        String name = "";
        Date birthDate = new Date();
        Integer Id = 1;
        Cat cat = new Cat(name, birthDate, Id);
        AnimalWarehouse<Cat> catHouse = new AnimalWarehouse<>();
        //when
        catHouse.removeAnimalById(Id);
        Integer expected =0;
        Integer actual = catHouse.getNumberOfAnimals();
        // then
        Assert.assertEquals(expected, actual);
    }


    // TODO - Create tests for `void remove(Cat cat)`

    @Test

    public void testremovecat(){
        // Given
        String name = "";
        Date birthDate = new Date();
        Integer Id = 1;
        Cat cat = new Cat(name, birthDate, Id);
        AnimalWarehouse<Cat> catHouse = new AnimalWarehouse<>();
        //When
        catHouse.removeAnimal(cat);
        Integer expected = 0;
        Integer actual = catHouse.getNumberOfAnimals();
        //then
        Assert.assertEquals(expected,actual);

    }
    // TODO - Create tests for `Cat getCatById(Integer id)`

    @Test
    public void  testgetCatById(){
        // Given
        String name = "";
        Date birthDate = new Date();
        Integer Id = 1;
        Cat cat = new Cat(name, birthDate, Id);
        AnimalWarehouse<Cat> catHouse = new AnimalWarehouse<>();
        // when
        catHouse.getAnimalById(1);
        Integer expected = 0;
        Integer actual = catHouse.getNumberOfAnimals();
        //then
        Assert.assertEquals(expected,actual);

    }
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void testgetnumberOfCats(){
        //Given
        String name = "";
        Date birthDate = new Date();
        Integer Id = 1;
        Cat cat = new Cat(name, birthDate, Id);
        AnimalWarehouse<Cat> catHouse = new AnimalWarehouse<>();
        //when
        catHouse.getNumberOfAnimals();
        Integer expected = 0;
        Integer actual = catHouse.getNumberOfAnimals();
        //then
        Assert.assertEquals(expected, actual);

    }




    }

