package com.transcend.hr.services;

import com.transcend.hr.domain.Element;

import java.util.List;
import java.util.Optional;

public interface ElementService {

    //list methods to use in the element service
    //Lists all elements

    Iterable<Element> listAllElements();

    Optional<Element> getElementById(Integer id);

    Element saveElement(Element element);

    Iterable<Element> saveElementList(Iterable<Element> elementIterable);

    //delete

    void deleteElement(Integer id);

    // custom repo methods
    Element findByElementName(String elementName);

    List<Element> findAllByElementName(String elementName);

    List<Element> findAllByElementNameIgnoreCase(String elementName);

}
