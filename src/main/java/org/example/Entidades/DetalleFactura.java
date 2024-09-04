package org.example.Entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
@Builder
@AllArgsConstructor
@Setter
@Getter
@ToString
public class DetalleFactura implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private int cantidad;
    private int subtotal;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_articulo")
    private Articulo articulo;


}