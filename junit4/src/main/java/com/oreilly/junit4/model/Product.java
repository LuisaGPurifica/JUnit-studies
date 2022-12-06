package com.oreilly.junit4.model;

/**
 * Product Model API.
 */
public interface Product {

	long getId();

	String getName();

	ProductType getType();

	Amount getAmount();
}
