package com.app.capstone.controller;

import com.app.capstone.entity.catalogo;
import com.app.capstone.entity.catalogoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
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
