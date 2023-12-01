package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.AnimalWarehouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {



    // TODO - Create tests for `void add(Cat cat)`

    @Test
    public void testadd(Cat cat){
        // Given
        AnimalWarehouse<Cat> catHouse = new AnimalWarehouse<>();
        //When
         new AnimalWarehouse<>().add(cat);
        // then
        Assert.assertEquals(cat);

    }

    // TODO - Create tests for `void remove(Integer id)`

    @Test
    public void testremove(Integer id){

    }
    // TODO - Create tests for `void remove(Cat cat)`

    @Test
    public void testremove(Cat cat){

    }
    // TODO - Create tests for `Cat getCatById(Integer id)`

    @Test
    public void  testgetCatById(Integer id){

    }
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void testgetnumberOfCats(){

    }
}
