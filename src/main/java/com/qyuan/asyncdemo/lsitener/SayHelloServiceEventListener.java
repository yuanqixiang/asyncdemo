package com.qyuan.asyncdemo.lsitener;

import com.qyuan.asyncdemo.event.CallSayHelloServiceEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SayHelloServiceEventListener {
    @EventListener
    public void handleCallSayHelloServiceEvent(CallSayHelloServiceEvent event) {
        log.info("CallSayHelloServiceEvent, time: " + event.getTime());
    }
}
