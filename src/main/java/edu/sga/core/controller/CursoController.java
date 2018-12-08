package edu.sga.core.controller;


import edu.sga.core.bs.dao.CursoRepository;
import edu.sga.core.eis.bo.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/v1/curso",produces = MediaType.APPLICATION_JSON_VALUE)
public class CursoController {

    @Autowired
    private CursoRepository cursoRepository;
    @CrossOrigin(origins = {"http://localhost:9090","http://localhost:9300"})
    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Curso> getAll(){
        return  cursoRepository.findAll();
    }
}
