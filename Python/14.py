class Configuracao:
    _instancia = None

    def __new__(cls):
        if cls._instancia is None:
            
            cls._instancia = super(Configuracao, cls).__new__(cls)

            cls._instancia.parametro1 = "Valor padrão 1"
            cls._instancia.parametro2 = "Valor padrão 2"
        return cls._instancia

    def __init__(self):
       
        pass


config1 = Configuracao()
config2 = Configuracao()


config1.parametro1 = "Novo valor 1"


print(config1 is config2) 
print(config2.parametro1)  
