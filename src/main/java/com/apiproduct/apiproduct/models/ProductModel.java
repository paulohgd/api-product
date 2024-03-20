package com.apiproduct.apiproduct.models;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "tbProducts")
public class ProductModel {
        private static final long serialVersionUID = 1l;

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private UUID idProduct;
        private String name;
        private BigDecimal value;

        public UUID getIdProduct() {
            return idProduct;
        }

        public void setIdProduct(UUID idProduct) {
            this.idProduct = idProduct;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public BigDecimal getValue() {
            return value;
        }

        public void setValue(BigDecimal value) {
            this.value = value;
        }
}
