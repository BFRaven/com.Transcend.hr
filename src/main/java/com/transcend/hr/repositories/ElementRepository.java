package com.transcend.hr.repositories;

import com.transcend.hr.domain.Element;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ElementRepository extends CrudRepository<Element, Integer> {

    //will auto generate required code from the structure of method name.
      Element findByElementName(String elementName);

      List<Element> findAllByElementName(String elementName);

    List<Element> findAllByElementNameIgnoreCase(String elementName);

}
