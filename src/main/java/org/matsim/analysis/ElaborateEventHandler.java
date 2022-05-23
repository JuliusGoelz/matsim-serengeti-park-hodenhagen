package org.matsim.analysis;

import org.matsim.api.core.v01.events.LinkLeaveEvent;
import org.matsim.api.core.v01.events.handler.LinkLeaveEventHandler;

public class ElaborateEventHandler implements LinkLeaveEventHandler {

    @Override
    public void handleEvent(LinkLeaveEvent linkLeaveEvent) {
        int hour = (int) (linkLeaveEvent.getTime() / 3600);
        // Hier fehlt was.
        System.out.println(hour);
    }

}
