package br.com.catalisa.stockz.model.dto;

import br.com.catalisa.stockz.enums.TipoTransacao;

import java.time.LocalDateTime;

public class TransacaoResponse {
    private String  tipoTransacao;

    private Integer quantidade;

    private ProdutoDTOResponse produto;

    private String reponsavelTransacao;

    private String cargoResponsavel;

    private LocalDateTime dataHoraEntrada;
}
