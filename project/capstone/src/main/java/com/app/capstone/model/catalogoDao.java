package com.app.capstone.model;

import com.app.capstone.repository.catalogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class catalogoDao {

    @Autowired
    private catalogoRepository repository;

    public void save(catalogo Catalogo){
        repository.save(Catalogo);
    }

    public List<catalogo> getCatalogo(){
        List<catalogo> Catalogo = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(Catalogo::add);
        return Catalogo;
    }

    public void delete(Long id) { repository.deleteById(id);}
}
