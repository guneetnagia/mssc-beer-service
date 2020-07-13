package com.guneet.msscbeerservice.web.mappers;

import com.guneet.msscbeerservice.domain.Beer;
import com.guneet.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);
    Beer beetDtoToBeer(BeerDto dto);
}
