package com.projetosti.cardapio.burgers;

import java.math.BigDecimal;

public record BurgersRequestDTO(String nome, String descricao, BigDecimal preco, String imagem) {
}
