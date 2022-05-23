package org.matsim.analysis;

import org.matsim.core.events.EventsUtils;

public class SimpleAnalysis {
    public static void main(String[] args){
//        var handler = new SimplePersonEventHandler();
        var elhandler = new ElaborateEventHandler();
        var manager = EventsUtils.createEventsManager();
//        manager.addHandler(handler);
        manager.addHandler(elhandler);
        EventsUtils.readEvents(manager, "C:\\Users\\jdgoe\\Documents\\Uni\\MATSim\\matsim-serengeti-park-hodenhagen\\scenarios\\serengeti-park-v1.0\\output\\output-serengeti-park-v1.0-run1\\serengeti-park-v1.0-run1.output_events.xml.gz");
    }
}
