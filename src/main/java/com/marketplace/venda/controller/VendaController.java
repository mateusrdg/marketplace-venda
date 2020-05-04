package com.marketplace.venda.controller;

import com.marketplace.venda.model.dto.VendaDTO;
import com.marketplace.venda.service.MQService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
@RequestMapping (value = "/vendas")
public class VendaController  {

    @Autowired
    private MQService service;

    @PostMapping
    public ResponseEntity enviar(@Valid @NotNull @RequestBody VendaDTO venda){
        service.enviarParaFilaVenda(venda);
        return ResponseEntity.ok(venda);
    }

}
