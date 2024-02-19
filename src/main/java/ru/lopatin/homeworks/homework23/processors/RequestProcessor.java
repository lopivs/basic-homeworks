package ru.lopatin.homeworks.homework23.processors;


import ru.lopatin.homeworks.homework23.HttpRequest;

import java.io.IOException;
import java.io.OutputStream;

public interface RequestProcessor {
    void execute(HttpRequest httpRequest, OutputStream output) throws IOException;
}
