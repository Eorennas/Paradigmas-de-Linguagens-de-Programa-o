package main

import (
	"fmt"
)

type ContaBancaria struct {
	titular string
	saldo   float64 
}

func NovaContaBancaria(titular string, saldoInicial float64) *ContaBancaria {
	return &ContaBancaria{
		titular: titular,
		saldo:   saldoInicial,
	}
}


func (c *ContaBancaria) Depositar(valor float64) {
	if valor > 0 {
		c.saldo += valor
		fmt.Printf("Depósito de R$%.2f realizado com sucesso!\n", valor)
	} else {
		fmt.Println("O valor de depósito deve ser positivo.")
	}
}


func (c *ContaBancaria) Sacar(valor float64) {
	if valor > 0 {
		if valor <= c.saldo {
			c.saldo -= valor
			fmt.Printf("Saque de R$%.2f realizado com sucesso!\n", valor)
		} else {
			fmt.Println("Saldo insuficiente.")
		}
	} else {
		fmt.Println("O valor de saque deve ser positivo.")
	}
}


func (c *ContaBancaria) ConsultarSaldo() string {
	return fmt.Sprintf("Saldo atual: R$%.2f", c.saldo)
}

func main() {
	
	conta := NovaContaBancaria("João", 1000)

	
	fmt.Println(conta.ConsultarSaldo())
	conta.Depositar(500)
	fmt.Println(conta.ConsultarSaldo())
	conta.Sacar(300)
	fmt.Println(conta.ConsultarSaldo())
	conta.Sacar(1500) 
