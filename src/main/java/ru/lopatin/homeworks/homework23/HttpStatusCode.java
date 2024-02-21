package ru.lopatin.homeworks.homework23;

public enum HttpStatusCode {
    CODE_200(200, "OK"),
    CODE_400(400, "Bad Request"),
    CODE_404(404, "Not Found");

    private int code;
    private String description;

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    HttpStatusCode(int code, String description) {
        this.code = code;
        this.description = description;
    }
}
