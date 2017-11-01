package com.udemy.ood.transaction.service;

import com.udemy.ood.transaction.common.Accounting;

public class Account {

	private Accounting accountingService;

	public Account(Accounting accountingService) {
		this.accountingService = accountingService;
	}
}
