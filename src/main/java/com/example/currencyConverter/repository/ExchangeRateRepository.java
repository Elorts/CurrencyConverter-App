package com.example.currencyConverter.repository;

import com.example.currencyConverter.model.ExchangeRate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeRateRepository extends JpaRepository<ExchangeRate, Integer> {
    ExchangeRate findBySourceCurrencyAndTargetCurrency(String sourceCurrency, String targetCurrency);
}
