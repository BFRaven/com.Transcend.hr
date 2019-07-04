//package services;
//
//import com.transcend.hr.Application;
//import com.transcend.hr.domain.Element;
//import com.transcend.hr.services.ElementService;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotNull;
//import static org.junit.Assert.assertNull;
//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@WebAppConfiguration
//public class ElementServiceTest  {
//
//    @Autowired
////    TODO: fix syntax err
//    private ElementService elementService;
//
//    @Test
//    public void elementServiceSaveTest() {
//        Element element = new Element("ServiceTest");
//
////         save element, verify has an ID after saving
//        assertNull(element.getId());
//        elementService.saveElement(element);
//        assertNotNull(element.getId());
//
//        //fetch
//        //    TODO: fix syntax err
//        Element fetchedElement = elementService.getElementById(element.getId());
//        assertNotNull(fetchedElement);
//        assertEquals(element.getId(), fetchedElement.getId());
//
//        //update
//        // changing this value to "Laptop" and leaving the assert equals to email, will not pass a test
//        fetchedElement.setElementName("Email");
//        elementService.saveElement(fetchedElement);
//
////    TODO: fix syntax err
//        Element updatedElement = elementService.getElementById(element.getId());
//        assertEquals(updatedElement.getElementName(), "Email");
//
//    }
//    }


