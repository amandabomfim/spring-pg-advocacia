package br.com.fiap.springpgadvocacia.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "TB_ADVOCACIA_TIPO_DE_ACAO")
public class TipoDeAcao {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_TIPO_DE_ACAO")
    @SequenceGenerator(
            name = "SQ_TIPO_DE_ACAO",
            sequenceName = "SQ_TIPO_DE_ACAO",
            initialValue = 1,
            allocationSize = 1
    )
    @Column(name = "ID_TIPO_DE_ACAO")
    private Long id;

    @Column(name = "NM_TIPO_DE_ACAO")
    private String nome;


}

