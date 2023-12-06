package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.AnimalWarehouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void testAdd(){
        // Given (some
        String name = "";
        Date birthDate = new Date();
        Integer Id = 1;
        Dog dog = new Dog(name, birthDate, Id);
        AnimalWarehouse<Dog> dogHouse = new AnimalWarehouse<>();

        //when
        dogHouse.add(dog);
        Integer expected = 1;  // checking if one dog
        Integer actual = dogHouse.getNumberOfAnimals(); //  checking if the dog


        //then
        Assert.assertEquals(expected, actual);
    }

     @Test
    // TODO - Create tests for `void remove(Integer id)`
     public void testremovebyid(){
         // Given
         String name = "";
         Date birthDate = new Date();
         Integer Id = 1;
         Dog dog = new Dog(name, birthDate, Id);
         AnimalWarehouse<Dog> dogHouse = new AnimalWarehouse<>();
         //when
         dogHouse.removeAnimalById(Id);
         Integer expected =0;
         Integer actual = dogHouse.getNumberOfAnimals();
         // then
         Assert.assertEquals(expected, actual);
     }

    // TODO - Create tests for `void remove(Dog dog)`



}
