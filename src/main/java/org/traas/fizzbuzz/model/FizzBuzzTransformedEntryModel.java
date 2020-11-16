package org.traas.fizzbuzz.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import org.traas.fizzbuzz.observer.FizzBuzzEntryMessage;
import org.traas.fizzbuzz.observer.FizzBuzzEntryQueueObserver;

public final class FizzBuzzTransformedEntryModel {

    public final int FLUSH_QUEUE_SIZE = 10;

    private static FizzBuzzTransformedEntryModel INSTANCE;

    private final Queue<String> transformedEntryQueue;

    private FizzBuzzEntryQueueObserver observer;

    private FizzBuzzTransformedEntryModel() {        
        transformedEntryQueue = new LinkedBlockingQueue<String>();
    }

    public synchronized static FizzBuzzTransformedEntryModel getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new FizzBuzzTransformedEntryModel();
        }
        return INSTANCE;
    }
 
    public synchronized void addEntry(String s) {
        transformedEntryQueue.add(s);

        if (transformedEntryQueue.size() >= FLUSH_QUEUE_SIZE) {
            flushQueue();           
        }
    }

    private void notify(List<String> entries) {
        if (null != observer) {
            observer.observe(new FizzBuzzEntryMessage(entries));
        }
    }

    public synchronized void flushQueue() {
        notify(new ArrayList(transformedEntryQueue));
        transformedEntryQueue.clear();           
    }

    public void setObserver(FizzBuzzEntryQueueObserver observer) {
        this.observer = observer;
    }
}