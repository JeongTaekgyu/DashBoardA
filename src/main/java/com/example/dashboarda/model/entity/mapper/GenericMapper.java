package com.example.dashboarda.model.entity.mapper;

import java.util.List;

public interface GenericMapper <D, E> {
                            // Dto, Entity
    D toDto(E e);
    E toEntity(D d);

    List<D> toDtoList(List<E> entityList);
    List<E> toEntityList(List<D> dtoList);
}
