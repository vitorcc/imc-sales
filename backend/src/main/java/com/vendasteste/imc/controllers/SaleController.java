package com.vendasteste.imc.controllers;

import com.vendasteste.imc.entities.Sale;
import com.vendasteste.imc.services.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SalesService salesService;

    @GetMapping
    public List<Sale> findSales(){
        return salesService.findSales();
    }

}
