package com.app.capstone.controller;

import com.app.capstone.model.catalogo;
import com.app.capstone.model.catalogoDao;
import com.app.capstone.repository.catalogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class catalogoController {

    @Autowired
    private catalogoDao CatalogoDao;

    @GetMapping("/store/games")
    public List<catalogo> getCatalogo() {
        return CatalogoDao.getCatalogo();
    }

    @PostMapping("/store/save")
    public void save(@RequestBody catalogo Catalogo) {
        CatalogoDao.save(Catalogo);
    }

}
