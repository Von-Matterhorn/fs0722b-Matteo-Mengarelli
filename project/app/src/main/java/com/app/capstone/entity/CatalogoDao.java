package com.app.capstone.entity;

import com.app.capstone.repository.CatalogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CatalogoDao {

    @Autowired
    private CatalogoRepository repository;

    public void save(Catalogo catalogo){
        repository.save(catalogo);
    }

    public List<Catalogo> getCatalogo(){
        List<Catalogo> catalogo = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(catalogo::add);
        return catalogo;
    }

    public void delete(Long id) { repository.deleteById(id);}
}
