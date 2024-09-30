package com.example.demo.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.dtorequest.APIRespond;
import com.sun.jdi.connect.IllegalConnectorArgumentsException;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    ResponseEntity<APIRespond> handlingRunTimeException(RuntimeException exception){
        APIRespond apiRespond = new APIRespond<>();
        apiRespond.setCode(ErrorCode.UNCATEGORIZED_EXCEPTION.getCode());
        apiRespond.setMessage(ErrorCode.UNCATEGORIZED_EXCEPTION.getMessage());
        return ResponseEntity.badRequest().body(apiRespond);
    }

        @ExceptionHandler(value = AppException.class)
        ResponseEntity<APIRespond> handlingAppException(AppException exception){
            ErrorCode errorCode = exception.getErrorCode();
            APIRespond apiRespond = new APIRespond<>();

            apiRespond.setCode(errorCode.getCode());
            apiRespond.setMessage(errorCode.getMessage());
            return ResponseEntity.badRequest().body(apiRespond);
        }

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    ResponseEntity<APIRespond> handlingValidation(MethodArgumentNotValidException exception){
        String enumkey = exception.getFieldError().getDefaultMessage();


        ErrorCode errorCode = ErrorCode.INVALID_KEY;
        try{
        errorCode = ErrorCode.valueOf(enumkey);
        }catch (IllegalArgumentException e){

        }

        APIRespond apiRespond = new APIRespond<>();

        apiRespond.setCode(errorCode.getCode());
        apiRespond.setMessage(errorCode.getMessage());

        return ResponseEntity.badRequest().body(apiRespond);
    }
}
