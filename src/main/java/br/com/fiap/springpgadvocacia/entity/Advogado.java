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
@Table(name = "TB_ADVOCACIA_ADVOGADO")
public class Advogado {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ADVOGADO")
    @SequenceGenerator(
            name = "SQ_ADVOGADO",
            sequenceName = "SQ_ADVOGADO",
            initialValue = 1,
            allocationSize = 1
    )
    @Column(name = "ID_ADVOGADO")
    private Long id;

    @Column(name = "NM_ADVOGADO")
    private String nome;

    @Column(name = "NR_ADVOGADO")
    private String numeroOAB;

}

