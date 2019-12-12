package mk.finki.ukim.wp.lab.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.FORBIDDEN,reason = "Duplicate Ingredient")
public class DuplicateNameException extends Exception {
}
