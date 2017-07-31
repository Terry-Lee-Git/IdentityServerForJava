package com.identity.services;

import com.identity.events.infrastructure.Event;
import com.identity.events.infrastructure.EventTypes;
import com.identity.services.interfaces.IEventService;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

/**
 * Created by simonzh on 7/29/2017.
 */
@Service
public class DefaultEventService implements IEventService {
    @Override
    public CompletableFuture RaiseAsync(Event evt) {
        return null;
    }

    @Override
    public Boolean CanRaiseEventType(EventTypes evtType) {
        return null;
    }
}
