package ru.lopatin.homeworks.homework23;


import ru.lopatin.homeworks.homework23.processors.HelloWorldRequestProcessor;
import ru.lopatin.homeworks.homework23.processors.OperationAddRequestProcessor;
import ru.lopatin.homeworks.homework23.processors.RequestProcessor;
import ru.lopatin.homeworks.homework23.processors.UnknownRequestProcessor;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public class Dispatcher {
    private Map<String, RequestProcessor> router;
    private RequestProcessor unknownRequestProcessor;

    public Dispatcher() {
        this.router = new HashMap<>();
        this.router.put("/add", new OperationAddRequestProcessor());         // /GET /add => OperationAddRequestProcessor
        this.router.put("/hello_world", new HelloWorldRequestProcessor());   // /GET /hello_world => HelloWorldRequestProcessor
        this.unknownRequestProcessor = new UnknownRequestProcessor();
    }

    public void execute(HttpRequest httpRequest, OutputStream output) throws IOException {
        if (!router.containsKey(httpRequest.getUri())) {
            unknownRequestProcessor.execute(httpRequest, output);
            return;
        }
        router.get(httpRequest.getUri()).execute(httpRequest, output);
    }
}
