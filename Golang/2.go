package main

import ("fmt")


type Carro struct {
	Marca     string
	Modelo    string
	Ano       int
	velocidade int
}


func (c *Carro) Detalhes() string {
	return fmt.Sprintf("Marca: %s, Modelo: %s, Ano: %d", c.Marca, c.Modelo, c.Ano)
}

func (c *Carro) Acelerar(incremento int) string {
	if incremento < 0 {
		return "O valor de incremento deve ser positivo."
	}
	c.velocidade += incremento
	return fmt.Sprintf("%s %s acelerou. Velocidade atual: %d km/h", c.Marca, c.Modelo, c.velocidade)
}


func (c *Carro) Frear(decremento int) string {
	if decremento < 0 {
		return "O valor de decremento deve ser positivo."
	}
	if c.velocidade-decremento < 0 {
		c.velocidade = 0
	} else {
		c.velocidade -= decremento
	}
	return fmt.Sprintf("%s %s freou. Velocidade atual: %d km/h", c.Marca, c.Modelo, c.velocidade)
}

func (c *Carro) ExibirVelocidade() string {
	return fmt.Sprintf("Velocidade atual do %s %s: %d km/h", c.Marca, c.Modelo, c.velocidade)
}

func main() {
	
	carroTeste := Carro{
		Marca:  "Toyota",
		Modelo: "Corolla",
		Ano:    2020,
	}


	fmt.Println(carroTeste.Acelerar(50))
	fmt.Println(carroTeste.Frear(20))
	fmt.Println(carroTeste.ExibirVelocidade())
}
