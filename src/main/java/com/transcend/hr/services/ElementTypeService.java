package com.transcend.hr.services;

import com.transcend.hr.domain.ElementType;

import java.util.Optional;

public interface ElementTypeService {

    //list methods to use in the element service
    //Lists all elements

    Iterable<ElementType> listAllElementTypes();

    Optional<ElementType> getElementTypeById(Integer id);

    ElementType saveElementType(ElementType elementType);

    Iterable<ElementType> saveElementTypeList(Iterable<ElementType> elementTypeIterable);

    //delete

    void deleteElementType(Integer id);


}
