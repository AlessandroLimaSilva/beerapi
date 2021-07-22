package AlessandroLimaSilva.com.github.beerapi.entity;

import AlessandroLimaSilva.com.github.beerapi.enums.BeerType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
*Esta classe representa o objeto cerveja,ou o mapeamento de entidade
* Devido a ser um projeto rest este objeto é construido visando a sua utilização
* junto a um banco de dados.
* Ja que devido a estrutura do projeto é construida visando que este objeto
* seja instanciado e gerenciado pelo springboot junto ao banco de dados
*
 */

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Beer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private String brand;

    @Column(nullable = false)
    private int max;

    @Column(nullable = false)
    private int quantity;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BeerType type;
}
