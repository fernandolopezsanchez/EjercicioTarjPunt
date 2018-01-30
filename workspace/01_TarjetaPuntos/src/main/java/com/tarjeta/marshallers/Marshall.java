package com.tarjeta.marshallers;

public interface Marshall<E,D> {

	D marshall(E entity);

	E unMarshall(D dto);

}