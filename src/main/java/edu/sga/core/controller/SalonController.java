package edu.sga.core.controller;

import edu.sga.core.bs.dao.SalonRepository;
import edu.sga.core.eis.bo.Salon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/v1/salon",produces = MediaType.APPLICATION_JSON_VALUE)
public class SalonController {
    @Autowired
    private SalonRepository salonRepository;
    //@CrossOrigin(origins = {"http://localhost:9090","http://localhost:9300"})
    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Salon> getAll(){
        return  salonRepository.findAll();
    }

}
