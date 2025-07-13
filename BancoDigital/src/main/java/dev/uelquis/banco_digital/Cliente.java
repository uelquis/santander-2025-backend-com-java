package dev.uelquis.banco_digital;

import lombok.*;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Cliente {
    @Getter @Setter
    private String nome;

}
