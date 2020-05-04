package com.marketplace.venda.service;

import com.marketplace.venda.model.dto.VendaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

@Service
public class MQTeste {

    @Autowired
    private MQService service;

    public void testDatabase(){
        List<VendaDTO> produtos = Arrays.asList(
                VendaDTO.builder().compradorId(1L).vendedorId(0L).data(Calendar.getInstance()).build(),
                VendaDTO.builder().compradorId(2L).vendedorId(0L).data(Calendar.getInstance()).build(),
                VendaDTO.builder().compradorId(3L).vendedorId(0L).data(Calendar.getInstance()).build(),
                VendaDTO.builder().compradorId(4L).vendedorId(0L).data(Calendar.getInstance()).build(),
                VendaDTO.builder().compradorId(5L).vendedorId(0L).data(Calendar.getInstance()).build(),
                VendaDTO.builder().compradorId(6L).vendedorId(0L).data(Calendar.getInstance()).build());

        produtos.forEach(service::enviarParaFilaVenda);
    }
}
