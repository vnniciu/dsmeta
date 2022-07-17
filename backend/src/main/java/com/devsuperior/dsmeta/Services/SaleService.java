package com.devsuperior.dsmeta.Services;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SaleService {

    @Autowired
    private SaleRepository repository;

    public List<Sale> findSales() {
        return repository.findAll();
    }

}
