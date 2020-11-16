package org.traas.fizzbuzz.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import org.traas.fizzbuzz.domain.FizzBuzzEntry;
import org.traas.fizzbuzz.observer.FizzBuzzEntryMessage;
import org.traas.fizzbuzz.observer.FizzBuzzEntryQueueObserver;

public final class FizzBuzzEntryModel {

    public final int FLUSH_QUEUE_SIZE = 10;

    private static FizzBuzzEntryModel INSTANCE;

    private final Queue<FizzBuzzEntry> transformedEntryQueue;

    private FizzBuzzEntryQueueObserver observer;

    private boolean debug = false;

    private FizzBuzzEntryModel() {        
        transformedEntryQueue = new LinkedBlockingQueue<FizzBuzzEntry>();
    }

    public synchronized static FizzBuzzEntryModel getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new FizzBuzzEntryModel();
        }
        return INSTANCE;
    }
 
    public synchronized void addEntry(FizzBuzzEntry entry) {
        transformedEntryQueue.add(entry);

        if (transformedEntryQueue.size() >= FLUSH_QUEUE_SIZE) {
            flushQueue();           
        }
    }

    private void notify(List<FizzBuzzEntry> entries) {
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

    public boolean getDebug() {
        return debug;
    }

    public void setDebug(boolean debug) {
        this.debug = debug;
    }
}