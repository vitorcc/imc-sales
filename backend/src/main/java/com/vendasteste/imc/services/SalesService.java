package com.vendasteste.imc.services;

import com.vendasteste.imc.entities.Sale;
import com.vendasteste.imc.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesService {

    @Autowired
    private SaleRepository saleRepository;

    public List<Sale> findSales(){
        return saleRepository.findAll();
    }
}
