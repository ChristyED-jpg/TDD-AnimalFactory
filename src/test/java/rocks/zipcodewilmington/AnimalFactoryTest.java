package rocks.zipcodewilmington;

import com.thoughtworks.qdox.model.BeanProperty;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 *
 */


public class AnimalFactoryTest {

  //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
  @Test
  public void testAnimalCreateDog() {
    // Given

    String name = "";
    Date birthDate = new Date();

    //When

    Dog dog =  AnimalFactory.createDog(name, birthDate);

    // Then
     Assert.assertNotNull( dog );

  }


  //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
  @Test
  public void testAnimalCreateCat(){

    //Given
    String name = "";
    Date birthDate = new Date();

    //When
    Cat cat = AnimalFactory.createCat(name, birthDate);

    // then
    Assert.assertNotNull(cat);

  }


}