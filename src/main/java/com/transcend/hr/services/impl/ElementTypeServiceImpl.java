package com.transcend.hr.services.impl;

import com.transcend.hr.domain.ElementType;
import com.transcend.hr.repositories.ElementTypeRepository;
import com.transcend.hr.services.ElementTypeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ElementTypeServiceImpl implements ElementTypeService {

    @Autowired
    private ElementTypeRepository elementTypeRepository;


    @Override
    public Iterable<ElementType> listAllElementTypes() {
        return elementTypeRepository.findAll();
    }

    @Override
    public Optional<ElementType> getElementTypeById(Integer id) {
        return elementTypeRepository.findById(id);
    }

    @Override
    public ElementType saveElementType(ElementType elementType) {
        return elementTypeRepository.save(elementType);
    }

    @Override
    public Iterable<ElementType> saveElementTypeList(Iterable<ElementType> elementTypeIterable) {
        return elementTypeRepository.saveAll(elementTypeIterable);
    }

    @Override
    public void deleteElementType(Integer id) {
        elementTypeRepository.deleteById(id);

    }
}
