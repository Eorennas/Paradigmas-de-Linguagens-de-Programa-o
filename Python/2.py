class Carro:
    def __init__(self, marca, modelo, ano):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano
        self._velocidade = 0  


    def detalhes(self):
        return f"Marca: {self.marca}, Modelo: {self.modelo}, Ano: {self.ano}"


    def acelerar(self, incremento):
        if incremento < 0:
            return "O valor de incremento deve ser positivo."
        self._velocidade += incremento
        return f"{self.marca} {self.modelo} acelerou. Velocidade atual: {self._velocidade} km/h"

   
    def frear(self, decremento):
        if decremento < 0:
            return "O valor de decremento deve ser positivo."
        self._velocidade = max(0, self._velocidade - decremento)
        return f"{self.marca} {self.modelo} freou. Velocidade atual: {self._velocidade} km/h"


    @property
    def velocidade(self):
        return self._velocidade


    def exibir_velocidade(self):
        return f"Velocidade atual do {self.marca} {self.modelo}: {self.velocidade} km/h"



carro_teste = Carro("Toyota", "Corolla", 2020)

# Exibindo os resultados
print(carro_teste.acelerar(50))
print(carro_teste.frear(20))
print(carro_teste.exibir_velocidade())
