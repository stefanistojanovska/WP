package mk.finki.ukim.wp.lab.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.FORBIDDEN,reason = "More Than Three Spicy Ingredients")
public class MoreThanThreeSpicyIngredients extends Exception {
}
