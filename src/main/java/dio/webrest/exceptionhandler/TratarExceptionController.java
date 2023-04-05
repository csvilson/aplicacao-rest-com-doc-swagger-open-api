package dio.webrest.exceptionhandler;

import dio.webrest.repository.Repositorio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

//Com essa anotação a class TratarExceptionController verificará todas as exceções
//que ocorrerem no pacote controller
@ControllerAdvice(basePackages = "dio.webrest.controller")
public class TratarExceptionController {

    @ResponseBody
    @ExceptionHandler(TipoException.class)
    public ResponseEntity<MensagemExcecao> tratar(TipoException excecao){
        MensagemExcecao error = new MensagemExcecao(
                new Date(),
                HttpStatus.NOT_FOUND.value(),
                "Valor inválido! Por favor verifique o dado inserido");

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);

    }
}