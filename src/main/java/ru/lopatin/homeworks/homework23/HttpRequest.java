package ru.lopatin.homeworks.homework23;

import java.util.HashMap;
import java.util.Map;

public class HttpRequest {
    private String rawRequest;
    private String uri;
    private HttpMethod method;
    private Map<String, String> parameters;

    public String getUri() {
        return uri;
    }

    public HttpMethod getMethod() {
        return method;
    }

    public HttpRequest(String rawRequest) {
        this.rawRequest = rawRequest;
        parseRequestLine();
    }

    private void parseRequestLine() {
        int startIndex = rawRequest.indexOf(' ');
        int endIndex = rawRequest.indexOf(' ', startIndex + 1);
        this.uri = rawRequest.substring(startIndex + 1, endIndex);
        this.parameters = new HashMap<>();
        if (uri.contains("?")) {
            String[] elements = uri.split("[?]");
            this.uri = elements[0];
            String[] keysValues = elements[1].split("&");
            for (String o : keysValues) {
                String[] keyValue = o.split("=");
                this.parameters.put(keyValue[0], keyValue[1]);
            }
        }
        this.method = HttpMethod.valueOf(rawRequest.substring(0, startIndex));
    }

    public String getParameter(String key) {
        return parameters.get(key);
    }

    public void printInfo(boolean showRawRequest) {
        if (showRawRequest) {
            System.out.println(rawRequest);
        }
        System.out.println("URI: " + uri);
        System.out.println("HTTP METHOD: " + method);
    }
}

// http://localhost:8189/add
// http://localhost:8189/subtract
// http://localhost:8189/divide
// http://localhost:8189/multiply