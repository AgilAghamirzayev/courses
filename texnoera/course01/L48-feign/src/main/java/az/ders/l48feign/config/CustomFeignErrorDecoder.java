package az.ders.l48feign.config;

import az.ders.l48feign.exception.ResourceNotFoundException;
import feign.Response;
import feign.codec.ErrorDecoder;
import java.nio.file.AccessDeniedException;
import lombok.extern.log4j.Log4j2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Log4j2
public class CustomFeignErrorDecoder implements ErrorDecoder {


    @Override
    public Exception decode(String methodKey, Response response) {
        HttpStatus status = HttpStatus.valueOf(response.status());
        String responseBody = extractResponseBody(response);

        log.error("Feign client error. Method: {}, Status: {}, Body: {}",
                     methodKey, status, responseBody);

      return switch (status) {
        case BAD_REQUEST -> new IllegalArgumentException("Invalid request: " + responseBody);
        case UNAUTHORIZED -> new SecurityException("Unauthorized access");
        case FORBIDDEN -> new AccessDeniedException("Access forbidden");
        case NOT_FOUND -> new ResourceNotFoundException("Resource not found");
        case INTERNAL_SERVER_ERROR -> new RuntimeException("Internal server error");
        default -> new Exception("Unexpected error: " + responseBody);
      };
    }

    private String extractResponseBody(Response response) {
        if (response.body() == null) {
            return "No response body";
        }

        try {
            return new String(response.body().asInputStream().readAllBytes(), StandardCharsets.UTF_8);
        } catch (IOException ex) {
            log.error("Failed to read response body", ex);
            return "Error reading response body";
        }
    }
}