package com.unicesumar.ecommerce.model.entities;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Sale extends Entity {
    /*
        id UUID PRIMARY KEY,
        user_id UUID NOT NULL,
        payment_method TEXT NOT NULL,
        sale_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
        FOREIGN KEY (user_id) REFERENCES users(uuid),
     */

    private UUID userId;
    private List<Product> products;
    private PaymentMethod paymentMethod;
    private String paymentAuthCode;
    private LocalDateTime saleDate;

    public Sale(UUID userId, List<Product> products, PaymentMethod paymentMethod, String paymentAuthCode, LocalDateTime saleDate) {
        super();
        this.userId = userId;
        this.products = products;
        this.paymentMethod = paymentMethod;
        this.paymentAuthCode = paymentAuthCode;
        this.saleDate = saleDate;
    }

    public Sale(UUID uuid, UUID userId, List<Product> products, PaymentMethod paymentMethod, String paymentAuthCode, LocalDateTime saleDate) {
        super(uuid);
        this.userId = userId;
        this.products = products;
        this.paymentMethod = paymentMethod;
        this.paymentAuthCode = paymentAuthCode;
        this.saleDate = saleDate;
    }

    public UUID getUserId() {
        return userId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public String getPaymentAuthCode() {
        return paymentAuthCode;
    }

    public LocalDateTime getSaleDate() {
        return saleDate;
    }
}
