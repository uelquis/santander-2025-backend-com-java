package dev.uelquis.banco_digital;

import lombok.Data;

import java.util.List;

public @Data class Banco {
    private String name;
    private List<Conta> contas;
}
