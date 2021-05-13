package com.harsh.farmermanagementdemo1.bankAccountsData;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Transactions {

    private List<Transaction> transactionList;
}
