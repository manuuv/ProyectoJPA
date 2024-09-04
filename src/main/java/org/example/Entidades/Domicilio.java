package org.example.Entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Builder
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table
public class Domicilio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreCalle;
    private int numero;
//    @OneToOne(mappedBy = "domicilio")
//    private Cliente cliente;
}
