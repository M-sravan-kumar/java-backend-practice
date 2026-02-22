package org.example.unimall.advice;

import org.example.unimall.dtos.ErrorDto;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<ErrorDto> handleNullPointerException()
    {
        ErrorDto error = new ErrorDto();
        error.setMessage("some thing went wrong id may not be there...");
        ResponseEntity<ErrorDto> responseEntity = new ResponseEntity<>(error, HttpStatusCode.valueOf(500));

        return responseEntity;
    }

}
