package med.voll.api.infra;

import org.hibernate.action.internal.EntityActionVetoException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class TratadorDeErros {

    @ExceptionHandler(EntityActionVetoException.class)
    public ResponseEntity tratarError404() {
        return ResponseEntity.notFound().build();
    }
}
