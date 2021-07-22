package AlessandroLimaSilva.com.github.beerapi.mapper;

import AlessandroLimaSilva.com.github.beerapi.dto.BeerDTO;
import AlessandroLimaSilva.com.github.beerapi.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);
    Beer toModel(BeerDTO beerDTO);
    BeerDTO toDTO(Beer beer);
}
