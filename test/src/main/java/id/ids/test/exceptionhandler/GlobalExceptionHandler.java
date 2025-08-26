package id.ids.test.exceptionhandler;

import id.ids.test.dto.ErrorResponseAPI;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> globalExceptionHandle() {
        return new ResponseEntity<>(
                new ErrorResponseAPI(
                        500, "Error pada system"
                ), HttpStatus.INTERNAL_SERVER_ERROR
        );
    }

}
