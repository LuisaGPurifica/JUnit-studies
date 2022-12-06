package com.oreilly.junit4.business;

import java.util.List;

import com.oreilly.junit4.exception.DifferentCurrenciesException;
import com.oreilly.junit4.model.Amount;
import com.oreilly.junit4.model.Product;

public interface ClientBO {

	Amount getClientProductsSum(List<Product> products) throws DifferentCurrenciesException;

}
