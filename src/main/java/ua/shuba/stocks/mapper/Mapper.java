package ua.shuba.stocks.mapper;

public interface Mapper <D, E>{
    D toDto(E e);
    E toEntity(D d);
}
