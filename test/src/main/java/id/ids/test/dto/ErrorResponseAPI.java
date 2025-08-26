package id.ids.test.dto;

import lombok.Getter;

@Getter
public class ErrorResponseAPI {
    private int status;
    private String message;

    public ErrorResponseAPI(int status, String message) {
        this.status = status;
        this.message = message;
    }
}
