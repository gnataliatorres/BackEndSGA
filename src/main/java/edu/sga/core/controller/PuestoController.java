package edu.sga.core.controller;


import edu.sga.core.bs.dao.PuestoRepository;
import edu.sga.core.eis.bo.Puesto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/v1/puesto",produces = MediaType.APPLICATION_JSON_VALUE)
public class PuestoController {


    @Autowired
    private PuestoRepository puestoRepository;
    //@CrossOrigin(origins = {"http://localhost:9090","http://localhost:9300"})
    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Puesto> getAll(){
        return  puestoRepository.findAll();
    }
}
