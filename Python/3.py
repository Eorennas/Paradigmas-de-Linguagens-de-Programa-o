class ContaBancaria:
    def __init__(self, titular, saldo_inicial=0):
        self.titular = titular
        self.__saldo = saldo_inicial 


    def depositar(self, valor):
        if valor > 0:
            self.__saldo += valor
            print(f"Depósito de R${valor:.2f} realizado com sucesso!")
        else:
            print("O valor de depósito deve ser positivo.")


    def sacar(self, valor):
        if valor > 0:
            if valor <= self.__saldo:
                self.__saldo -= valor
                print(f"Saque de R${valor:.2f} realizado com sucesso!")
            else:
                print("Saldo insuficiente.")
        else:
            print("O valor de saque deve ser positivo.")

  
    def consultar_saldo(self):
        return f"Saldo atual: R${self.__saldo:.2f}"

  
    @property
    def saldo(self):
        return self.__saldo


conta = ContaBancaria("João", 1000)


print(conta.consultar_saldo())
conta.depositar(500)
print(conta.consultar_saldo())
conta.sacar(300)
print(conta.consultar_saldo())
conta.sacar(1500)  
