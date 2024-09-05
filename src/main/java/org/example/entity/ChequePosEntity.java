package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ChequePos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChequePosEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private ProductEntity product;

    @Column(nullable = false, name = "amount")
    private Integer amount;

    @Column(name = "price", nullable = false)
    private Double priceBeforeDiscount;

    @Column(name = "price_discount")
    private Double priceAfterDiscount;

    @Column(name = "discount")
    private Double appliedDiscount;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "cheque_num", referencedColumnName = "cheque_num"),
            @JoinColumn(name = "date_sale", referencedColumnName = "date_sale")
    })
    private SaleEntity sale;
}
