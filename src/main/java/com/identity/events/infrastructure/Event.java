package com.identity.events.infrastructure;

import java.util.Date;
import java.util.concurrent.CompletableFuture;

/**
 * Created by zhangpengcheng on 17/7/11.
 */
public class Event {

    private String category;
    private String name;
    private EventTypes eventType;
    private int id;
    private String message;
    private String activityId;
    private Date timeStamp;
    private int processId;
    private String localIpAddress;
    private String remoteIpAddress;


    protected Event(String category, String name, EventTypes type, int id, String message) {
        if (category == null || name == null)
            throw new NullPointerException("category and name can not be null");

        this.category = category;
        this.name = name;
        eventType = type;
        this.id = id;
        this.message = message;
    }


    protected Event(String category, String name, EventTypes type, int id) {
        if (category == null || name == null)
            throw new NullPointerException("category and name can not be null");

        this.category = category;
        this.name = name;
        eventType = type;
        this.id = id;
        message = null;
    }

    protected static String obfuscate(String value) {
        String last4chars = "****";
        if (!value.isEmpty() && value.length() > 4) {
            last4chars = value.substring(value.length() - 4);
        }

        return "****" + last4chars;
    }

    protected CompletableFuture prepareAsync() {
        return CompletableFuture.completedFuture(null);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EventTypes getEventType() {
        return eventType;
    }

    public void setEventType(EventTypes eventType) {
        this.eventType = eventType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public int getProcessId() {
        return processId;
    }

    public void setProcessId(int processId) {
        this.processId = processId;
    }

    public String getLocalIpAddress() {
        return localIpAddress;
    }

    public void setLocalIpAddress(String localIpAddress) {
        this.localIpAddress = localIpAddress;
    }

    public String getRemoteIpAddress() {
        return remoteIpAddress;
    }

    public void setRemoteIpAddress(String remoteIpAddress) {
        this.remoteIpAddress = remoteIpAddress;
    }

}
