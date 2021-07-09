package com.qmx.work6;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Application {
    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        simulator.playSound(new Dog());
        simulator.playSound(new Cat());
    }
}

