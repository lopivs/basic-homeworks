package ru.lopatin.homeworks.homework23.processors;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.lopatin.homeworks.homework23.HttpRequest;
import ru.lopatin.homeworks.homework23.HttpServer;
import ru.lopatin.homeworks.homework23.MyProduct;
import ru.lopatin.homeworks.homework23.HttpStatusCode;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class ProductJsonRequestProcessor implements RequestProcessor {
    private static final Logger logger = LogManager.getLogger(HttpServer.class);
    ObjectMapper objectMapper = new ObjectMapper();
    MyProduct myProduct = new MyProduct(1, "Сметана", 15.5f);
    String myProductJson;

    {
        try {
            myProductJson = objectMapper.writeValueAsString(myProduct);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void execute(HttpRequest httpRequest, OutputStream output) throws IOException {
        logger.info("ProductJsonRequestProcessor: start");

        String response = "HTTP/1.1 " + HttpStatusCode.CODE_200.getCode() + " OK\r\nContent-Type: application/json\r\n\r\n" + myProductJson;
        output.write(response.getBytes(StandardCharsets.UTF_8));

        logger.info("ProductJsonRequestProcessor processed successfully.");
    }
}
