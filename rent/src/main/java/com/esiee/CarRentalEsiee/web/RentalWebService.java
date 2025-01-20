package com.esiee.CarRentalEsiee.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RentalWebService {

    Logger logger = LoggerFactory.getLogger(RentalWebService.class);

    @GetMapping("/bonjour")
    public String sayHello(){
        return "Bonjour !";
    }

    @PutMapping(value = "/cars/{plateNumber}") public void rent(
            @PathVariable("plateNumber") String plateNumber,
            @RequestParam(value="rent", required = true)boolean rent,
            @RequestBody Dates dates){

        logger.info("Plate number:" + plateNumber);
        logger.info("Rent: " + rent);
        logger.info("Dates: " + dates);
    }
    @PutMapping(value = "/voiture/{plateNumber}")
    @ResponseStatus(HttpStatus.OK)
    public void rentOrGetBack(
            @PathVariable("plateNumber") String plateNumber,
            @RequestParam(value="rent", required = true)boolean rent) throws Exception{

    }

    @GetMapping("/cars/{plateNumber}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Car aCar(@PathVariable("plateNumber") String plateNumber) throws Exception{
        return null;
    }

    @GetMapping("/cars")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<Car> listOfCar() {
        return null;
    }
}