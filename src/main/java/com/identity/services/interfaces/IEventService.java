package com.identity.services.interfaces;

import com.identity.events.infrastructure.Event;
import com.identity.events.infrastructure.EventTypes;

import java.util.concurrent.CompletableFuture;

/**
 * Created by zhangpengcheng on 17/7/11.
 * Interface for the event service
 */
public interface IEventService
{
    /**
     * Raises the specified event.
     * @param evt
     */
    CompletableFuture RaiseAsync(Event evt);

    /**
     * Indicates if the type of event will be persisted.
     * @param evtType
     * @return
     */
    Boolean CanRaiseEventType(EventTypes evtType);
}
