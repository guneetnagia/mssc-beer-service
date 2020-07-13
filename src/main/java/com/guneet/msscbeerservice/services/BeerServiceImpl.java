package com.guneet.msscbeerservice.services;

import com.guneet.msscbeerservice.repositories.BeerRepository;
import com.guneet.msscbeerservice.web.model.BeerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@RequiredArgsConstructor
@Service
public class BeerServiceImpl implements BeerService{

    private final BeerRepository beerRepository;

    @Override
    public BeerDto getBeerById(UUID beerId) {
        return null;
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return null;
    }

    @Override
    public BeerDto updateBeer(BeerDto beerDto) {
        return null;
    }
}
