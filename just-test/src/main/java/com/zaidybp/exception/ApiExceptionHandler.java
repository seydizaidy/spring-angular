package com.zaidybp.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.Date;


@ControllerAdvice
public class ApiExceptionHandler extends RuntimeException
{
    @ExceptionHandler(value = {RequestException.class})
    public ResponseEntity<ApiException>handlerrequestException(RequestException e){
        ApiException exception=new ApiException(e.getMessage(),e.getStatus(),LocalDateTime.now());
     return  new ResponseEntity<>(exception, e.getStatus());
    }
    @ExceptionHandler(value = {EntityNotFoundExeption.class})
    public ResponseEntity<ApiException>handlerEntityNotFoundExeption(EntityNotFoundExeption e)
    {
        ApiException exception=new ApiException(e.getMessage(),HttpStatus.NOT_FOUND,LocalDateTime.now());
        return new ResponseEntity<>(exception,HttpStatus.NOT_FOUND );
    }



}
