package com.pavelchak.DTO.impl;

import com.pavelchak.DTO.DTO;
import com.pavelchak.controller.PersonController;
import com.pavelchak.domain.CityEntity;
import org.springframework.hateoas.Link;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;


public class CityDTO extends DTO<CityEntity> {
    public CityDTO(CityEntity city, Link link) {
        super(city, link);
//        add(linkTo(methodOn(PersonController.class).getAllPersonByCityID(getEntity().)));
    }

    public Long getCityId() { return getEntity().getId(); }

    public String getCity() {
        return getEntity().getCity();
    }
}
