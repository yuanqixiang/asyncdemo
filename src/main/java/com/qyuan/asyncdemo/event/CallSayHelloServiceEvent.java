package com.qyuan.asyncdemo.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

import java.time.LocalDateTime;

@Getter
public class CallSayHelloServiceEvent extends ApplicationEvent {

    private final LocalDateTime time;

    public CallSayHelloServiceEvent(Object source, LocalDateTime time) {
        super(source);
        this.time = time;
    }
}
