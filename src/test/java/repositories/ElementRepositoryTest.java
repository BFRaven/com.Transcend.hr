//package repositories;
//
//import com.transcend.hr.configuration.RepositoryConfiguration;
//
//import com.transcend.hr.domain.Element;
//import com.transcend.hr.repositories.ElementRepository;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotNull;
//import static org.junit.Assert.assertNull;
//
//
//@RunWith(SpringJUnit4ClassRunner.class)
////@SpringApplicationConfiguration(classes = {RepositoryConfiguration.class}) deprecated
//
//    @SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//class ElementRepositoryTest {
//
//    @Autowired
//    private ElementRepository elementRepository;
//
//    @Test
//    public void testSaveElement() {
//        // setup element
//        Element element = new Element();
//        element.setElementName("Phone");
//
//        // save element, verify has an ID after saving
//        assertNull(element.getId());
//        elementRepository.save(element);
//        assertNotNull(element.getId());
//
//        //fetch
//        Element fetchedElement = elementRepository.findById(element.getId());
//        assertNotNull(fetchedElement);
//        assertEquals(element.getId(), fetchedElement.getId());
//
//        //update
//        // changing this value to "Laptop" and leaving the assert equals to email, will not pass a test
//        fetchedElement.setElementName("Email");
//        elementRepository.save(fetchedElement);
//
//        Element updatedElement = elementRepository.findById(element.getId());
//        assertEquals(updatedElement.getElementName(), "Email");
//
//    }
//
//    @Test
//    // testing how many elements are in the entity model, schema.
//    public void testSaveElementsList() {
//        List<Element> elementList = new ArrayList<>();
//
//        elementList.add(new Element("Phone"));
//        elementList.add(new Element("Email"));
//        elementList.add(new Element("Laptop"));
//        elementList.add(new Element("PayRate"));
//
//        elementRepository.save(elementList);
//
//        Iterable<Element> fetchedElementList = elementRepository.findAll();
//
//        int count = 0;
//
//        for(Element element : fetchedElementList) {
//            count++;
//        }
//
//        assertEquals(4, count);
//    }
//
//    @Test
//    public void testFindByName(){
//        Element element = new Element("FindTest1");
//        elementRepository.save(element);
//
//        Element foundByNameElement = elementRepository.findByElementName("FindTest1");
//
//        assertEquals(element.getId(), foundByNameElement.getId());
//    }
//
//    @Test
//    public void testFindAllByName(){
//        Element element1 = new Element("FindTest");
//        elementRepository.save(element1);
//
//        Element element2 = new Element("FindTest");
//        elementRepository.save(element2);
//
//        Element element3 = new Element("FindTest");
//        elementRepository.save(element3);
//
//
//
//        Element foundAllByNameElement = elementRepository.findByAllByElementName("FindTest");
//
//        assertEquals(3, foundAllByNameElement.size());
//    }
//
//
//}
