package com.example.currencyConverter.repository;

import com.example.currencyConverter.model.ExchangeRate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeRateRepository extends JpaRepository<ExchangeRate, Integer> {
    ExchangeRate findBySourceAndTargetCurrency(String sourceCurrency, String targetCurrency);
}
