package edu.sga.core.controller;

import edu.sga.core.bs.dao.GrupoAcademicoRepository;
import edu.sga.core.eis.bo.GrupoAcademico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/v1/grupoacademico",produces = MediaType.APPLICATION_JSON_VALUE)
public class GrupoAcademicoController {
    @Autowired
    private GrupoAcademicoRepository grupoAcademicoRepository;
    //@CrossOrigin(origins = {"http://localhost:9090","http://localhost:9300"})
    @RequestMapping(method = RequestMethod.GET)
    public Iterable<GrupoAcademico> getAll(){
        return  grupoAcademicoRepository.findAll();
    }
}
