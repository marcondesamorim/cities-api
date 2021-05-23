# Cities.api 

 API Rest de consulta de cidades do Brasil com dados comparativos. 

#### Descrição

Projeto de conclusão do BootCamp everis Quality Assurance Beginner, com André Gomes como instrutor.


#Modificações implementadas

Foi sugerido que fizessemos alguma modificação criativa no projeto original do curso.

##Saída do by-math

Modifiquei a saída do comando by-math de forma mais amigável, apenas por exercicio, sabendo que uma api-restful não deve implentar tal saida.

ex.: "The distance between cities is 7,71mi".

A saída modifica a unidade de distância conforme a unidade que é passada.

##Implementação de menor distância

Adicionei um rotina para calcular a cidade mais prôxima.

Deve-se passar o id da cidade de interesse e a api retornar o registro da cidade mais prôxima a ela.

ex. : "http://localhost:8080/distances/nearest?id=2610"

saída: 

{
    "id": 2663,
    "name": "Lagoa Seca",
    "uf": 15,
    "ibge": 2508307,
    "geolocation": "(-7.15535020828247,-35.8490982055664)",
    "location": {
        "x": -7.15535020828247,
        "y": -35.8490982055664
    }
}
