package com.example.nolonolo.service;

import com.example.nolonolo.model.Cartellone;

import java.util.List;

public interface ICartelloneService {

    List<Cartellone> list();

    Cartellone create(Cartellone cartellone);

    Cartellone retrieve(Long id);

    Cartellone update(Cartellone cartellone);

    void delete(Long id);

}
