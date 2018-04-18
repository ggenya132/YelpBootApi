package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RequestMapping("/quotes")
@RestController
 public class QuoteController {

    @Autowired
    private QuoteSerivce quoteService;

    @RequestMapping(method = RequestMethod.GET)
    public Quote getQuote(){
        return quoteService.getQuote();
    }

}
