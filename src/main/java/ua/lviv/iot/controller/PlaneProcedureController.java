package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.dto.assembler.PlaneDtoAssembler;
import ua.lviv.iot.service.PlaneProcedureService;

@RestController
@RequestMapping(value = "/api/airports")
public class PlaneProcedureController {
    @Autowired
    private PlaneProcedureService planeProcedureService;
    @Autowired
    private PlaneDtoAssembler planeDtoAssembler;

    @GetMapping(value = "maxPassengers")
    public ResponseEntity<Integer> getMaxPassengers() {
        return new ResponseEntity<>(planeProcedureService.getMaxPassengers(),HttpStatus.OK);
    }
}
