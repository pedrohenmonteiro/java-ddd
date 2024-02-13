package com.pedromonteiro.javaddd.domain.event;

import java.time.Instant;

public interface DomainEvent {
    
    Instant occurredOn();
}
