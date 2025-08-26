package id.ids.test.dto;

import lombok.Getter;

@Getter
public class SuccessResponseAPI<T> {

    private T data;
    private T status;

    public SuccessResponseAPI(T data, T status) {
        this.data = data;
        this.status = status;
    }
}
