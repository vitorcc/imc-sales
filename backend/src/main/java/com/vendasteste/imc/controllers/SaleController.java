package com.vendasteste.imc.controllers;

import com.vendasteste.imc.entities.Sale;
import com.vendasteste.imc.services.SalesService;
import com.vendasteste.imc.services.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SalesService salesService;
    @Autowired
    private SmsService smsService;

    @GetMapping
    public Page<Sale> findSales(
            @RequestParam(value="minDate", defaultValue = "") String minDate,
            @RequestParam(value="maxDate", defaultValue = "") String maxDate,
            Pageable pageable
    ){
        return salesService.findSales(minDate, maxDate, pageable);
    }
    @GetMapping("/{id}/notification")
    public void notifySms(@PathVariable Long id){
        smsService.sendSms(id);
    }

}
