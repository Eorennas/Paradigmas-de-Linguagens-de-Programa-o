package main

import (
	"fmt"
	"sync"
)


type Configuracao struct {
	Parametro1 string
	Parametro2 string
}


var instancia *Configuracao
var once sync.Once 

func GetInstancia() *Configuracao {
	once.Do(func() {
		
		instancia = &Configuracao{
			Parametro1: "Valor padrão 1",
			Parametro2: "Valor padrão 2",
		}
	})
	return instancia
}

func main() {

	config1 := GetInstancia()
	config2 := GetInstancia()


	config1.Parametro1 = "Novo valor 1"

	
	fmt.Println(config1 == config2)            
	fmt.Println("Parametro1 de config2:", config2.Parametro1) // "Novo valor 1"
}
