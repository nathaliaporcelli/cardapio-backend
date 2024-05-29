package com.projetosti.cardapio.burgers;

import java.math.BigDecimal;

public record BurgersResponseDTO(Long id, String nome, String descricao, BigDecimal preco, String imagem) {

    public BurgersResponseDTO(Burgers burgers){
        this(burgers.getId(), burgers.getNome(), burgers.getDescricao(), burgers.getPreco(), burgers.getImagem());

    }
}
