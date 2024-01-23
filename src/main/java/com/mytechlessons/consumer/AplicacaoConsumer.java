package com.mytechlessons.consumer;

import com.mytechlessons.eventos.ConsumidorEvento;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AplicacaoConsumer {

    public static void main(String[] args) {
        AplicacaoConsumer app = new AplicacaoConsumer();
        app.iniciar();
    }

    private void iniciar() {
        log.info("Iniciando a aplicação...");
        ConsumidorEvento producer = new ConsumidorEvento();
        producer.executar();
    }
}
