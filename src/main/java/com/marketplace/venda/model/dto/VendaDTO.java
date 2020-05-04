package com.marketplace.venda.model.dto;

import lombok.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VendaDTO {

    private Long compradorId;
    private Long vendedorId;
    private Calendar data;
    private PagamentoDTO pagamento;
    private List<VendaItemDTO> itens = new ArrayList<>();

}
