package com.marketplace.venda.service;

import com.marketplace.venda.model.constantes.Fila;
import com.marketplace.venda.model.dto.RabbitObjectConfig;
import com.marketplace.venda.model.dto.VendaDTO;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class MQService {

    private static RabbitTemplate rabbitTemplate;

    public MQService(RabbitTemplate template){
        rabbitTemplate = template;
    }

    private void enviarParaFila(RabbitObjectConfig config) {
        rabbitTemplate.convertAndSend(config.getQueueName(), config.getMesssage());
    }

    public void enviarParaFilaVenda (VendaDTO venda) {
        enviarParaFila(RabbitObjectConfig.builder()
                .object(venda)
                .queueName(Fila.VENDA)
                .build());
    }

}
