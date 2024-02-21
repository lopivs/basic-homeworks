package ru.lopatin.homeworks.homework23;


import ru.lopatin.homeworks.homework23.processors.*;

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
        this.router.put("/get_json_product", new ProductJsonRequestProcessor());   // /GET /get_json_product => ProductJsonRequestProcessor
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
