package com.app.capstone.controller;

import com.app.capstone.entity.Catalogo;
import com.app.capstone.entity.CatalogoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class CatalogoController {

    @Autowired
    private CatalogoDao catalogoDao;

    @GetMapping("/store/games")
    public List<Catalogo> getCatalogo() {
        return catalogoDao.getCatalogo();
    }

    @PostMapping("/store/save")
    public void save(@RequestBody Catalogo catalogo) {
        catalogoDao.save(catalogo);
    }

}
