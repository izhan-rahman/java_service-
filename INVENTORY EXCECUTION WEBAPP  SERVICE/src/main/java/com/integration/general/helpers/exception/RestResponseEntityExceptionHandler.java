package com.integration.general.helpers.exception;

import com.integration.general.helpers.common.calc.DateTimeCalc;
import com.integration.general.helpers.exception.custom.ResourceNotFoundException;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.exception.JDBCConnectionException;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.persistence.EntityNotFoundException;
import javax.persistence.NonUniqueResultException;


@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
    public RestResponseEntityExceptionHandler() {
        super();
    }

    // API
    // 400
    @ExceptionHandler({ConstraintViolationException.class})
    public ResponseEntity<Object> handleBadRequest(final ConstraintViolationException ex, final WebRequest request) {
        final String bodyOfResponse = "This should be application specific";
        return handleExceptionInternal(ex, bodyOfResponse, new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }
    @ExceptionHandler({ DataIntegrityViolationException.class })
    public ResponseEntity<Object> handleBadRequest(final DataIntegrityViolationException ex, final WebRequest request) {
        final String bodyOfResponse = "This should be application specific";
        return handleExceptionInternal(ex, bodyOfResponse, new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }
    @Override
    protected ResponseEntity<Object> handleHttpMessageNotReadable(final HttpMessageNotReadableException ex, final HttpHeaders headers, final HttpStatus status, final WebRequest request) {
        final String bodyOfResponse = ex.getMessage();
        // ex.getCause() instanceof JsonMappingException, JsonParseException // for additional information later on
        return handleExceptionInternal(ex, bodyOfResponse, headers, HttpStatus.BAD_REQUEST, request);
    }
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(final MethodArgumentNotValidException ex, final HttpHeaders headers, final HttpStatus status, final WebRequest request) {
        final String bodyOfResponse = "This should be application specific";
        return handleExceptionInternal(ex, bodyOfResponse, headers, HttpStatus.BAD_REQUEST, request);
    }
    // 404
    @ExceptionHandler(value = { EntityNotFoundException.class, ResourceNotFoundException.class ,
            UsernameNotFoundException.class})
    protected ResponseEntity<Object> handleNotFound(ResourceNotFoundException ex, final WebRequest request) {
        ExceptionResponse response = new ExceptionResponse();
        response.setDateTime(new DateTimeCalc().getTodayDateTime());
        response.setMessage(ex.getMessage());
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = { BadCredentialsException.class})
    protected ResponseEntity<Object> handleBadCredential(BadCredentialsException ex, final WebRequest request) {
        ExceptionResponse response = new ExceptionResponse();
        response.setDateTime(new DateTimeCalc().getTodayDateTime());
        response.setMessage(ex.getMessage());
        return new ResponseEntity<>(response, HttpStatus.UNAUTHORIZED);
    }
    // 409
    @ExceptionHandler({ InvalidDataAccessApiUsageException.class, DataAccessException.class })
    protected ResponseEntity<Object> handleConflict(final RuntimeException ex, final WebRequest request) {
        final String bodyOfResponse = ex.getMessage();
        return handleExceptionInternal(ex, bodyOfResponse, new HttpHeaders(), HttpStatus.CONFLICT, request);
    }
    // 412
    // 500
    @ExceptionHandler({NullPointerException.class, IllegalArgumentException.class, IllegalStateException.class})
    public ResponseEntity<Object> handleInternal(final RuntimeException ex, final WebRequest request) {
        ExceptionResponse response = new ExceptionResponse();
        HttpStatus status;
        response.setDateTime(new DateTimeCalc().getTodayDateTime());
        response.setMessage(ex.getMessage());
        status = HttpStatus.INTERNAL_SERVER_ERROR;
        return new ResponseEntity<>(response, status);
    }

    @ExceptionHandler({NonUniqueResultException.class})
    public ResponseEntity<Object> handleNonUniqueResultException(final RuntimeException ex, final WebRequest request) {
        ExceptionResponse response = new ExceptionResponse();
        HttpStatus status;
        response.setDateTime(new DateTimeCalc().getTodayDateTime());
        response.setMessage(ex.getMessage());
        status = HttpStatus.INTERNAL_SERVER_ERROR;
        return new ResponseEntity<>(response, status);
    }

    @ExceptionHandler({JDBCConnectionException.class})
    public ResponseEntity<Object> handleJDBCConnectionException(final RuntimeException ex, final WebRequest request) {
        ExceptionResponse response = new ExceptionResponse();
        HttpStatus status;
        response.setDateTime(new DateTimeCalc().getTodayDateTime());
        response.setMessage(ex.getMessage());
        status = HttpStatus.INTERNAL_SERVER_ERROR;
        return new ResponseEntity<>(response, status);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handleCommonException(Exception ex, WebRequest request) {
        ExceptionResponse response = new ExceptionResponse();
        HttpStatus status;
        response.setDateTime(new DateTimeCalc().getTodayDateTime());
        response.setMessage(ex.getMessage());
        if (ex.getMessage().equals("USERNAME")) {
            response.setMessage("Username wrong");
            status = HttpStatus.UNAUTHORIZED;
        } else {
            status = HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return new ResponseEntity<Object>(response, status);
    }

}