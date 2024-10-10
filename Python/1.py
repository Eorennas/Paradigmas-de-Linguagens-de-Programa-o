class Carro:
    def __init__(self, marca, modelo, ano):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano

    def detalhes(self):
        return f"Marca: {self.marca}, Modelo: {self.modelo}, Ano: {self.ano}"

carro1 = Carro("Hyundai", "Creta", 2020)
carro2 = Carro("Fiat", "Argo", 2018)
carro3 = Carro("Ford", "Mustang", 2022)

print(carro1.detalhes())
print(carro2.detalhes())
print(carro3.detalhes())
