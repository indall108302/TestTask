package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;


@Entity
@Table(name = "Sale")
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(SaleId.class)
public class SaleEntity {
    @Id
    @Column(name = "cheque_num")
    private Long chequeNumber;

    @Id
    @Column(name = "date_sale", nullable = false)
    private LocalDate dateSale;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private ClientEntity client;
}
