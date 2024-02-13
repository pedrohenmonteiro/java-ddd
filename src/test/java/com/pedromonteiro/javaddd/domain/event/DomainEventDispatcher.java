package com.pedromonteiro.javaddd.domain.event;

public interface DomainEventDispatcher {
    
    void notify(DomainEvent event); 
    void register(String eventName, DomainEventHandler<?> eventHandler);
    void unregister(String eventName, DomainEventHandler<?> eventHandler);
    void unregisterAll();
}
