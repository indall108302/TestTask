package org.example.entity;

import java.io.Serializable;

public class SaleId implements Serializable {
    private Long cheque_num;
    private Long date_sale;

    public SaleId(Long cheque_num, Long date_sale) {
        this.cheque_num = cheque_num;
        this.date_sale = date_sale;
    }
}
