package com.pedromonteiro.javaddd.domain.event;

public interface DomainEventHandler<T extends DomainEvent> {
    
    void handle(T event);
}
