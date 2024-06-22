package com.wellsfargo.counselor.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Security {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long securityId;
	@Column(nullable = false)
	private String name;
	@ManyToOne
	@JoinColumn(name = "portfolioId",nullable=false)
	private Portfolio portfolio;
	@Column(nullable = false)
	private String category;
	@Column(nullable = false)
	private double purchasePrice;
	@Column(nullable = false)
	private  LocalDate purchaseDate;
	@Column(nullable = false)
	private  int quantity;
	
	protected Security() {
	}

	public Security(String name, Portfolio portfolio, String category, double purchasePrice, LocalDate purchaseDate,
			int quantity) {
		this.name = name;
		this.portfolio = portfolio;
		this.category = category;
		this.purchasePrice = purchasePrice;
		this.purchaseDate = purchaseDate;
		this.quantity = quantity;
	}

	public long getSecurityId() {
		return securityId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Portfolio getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(Portfolio portfolio) {
		this.portfolio = portfolio;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}	
	
	
	
}
