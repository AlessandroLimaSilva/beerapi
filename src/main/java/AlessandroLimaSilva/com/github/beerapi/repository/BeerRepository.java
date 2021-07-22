package AlessandroLimaSilva.com.github.beerapi.repository;
/*
*Esta Interface tem a responsabilidade de todos a transações (CRUD) com o banco de dados
* Atraves da Interface JpaRepository que possui metodos de operações junto ao BD
*É um gerente de operações do BD
* Em suma todas os metodos adicionais em relação as operaçoes junto ao BD
* Serão implementadas nessa Interface
*
 */

import AlessandroLimaSilva.com.github.beerapi.entity.Beer;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface BeerRepository extends JpaRepository<Beer, Long> {

    Optional<Beer> findByName(String name);
}
