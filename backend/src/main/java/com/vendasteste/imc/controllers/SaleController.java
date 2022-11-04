package com.vendasteste.imc.controllers;

import com.vendasteste.imc.entities.Sale;
import com.vendasteste.imc.services.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SalesService salesService;

    @GetMapping
    public Page<Sale> findSales(
            @RequestParam(value="minDate", defaultValue = "") String minDate,
            @RequestParam(value="maxDate", defaultValue = "") String maxDate,
            Pageable pageable
    ){
        return salesService.findSales(minDate, maxDate, pageable);
    }

}
