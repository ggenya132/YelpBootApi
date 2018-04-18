package hello;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

 @Service
 public class QuoteSerivce implements QuoteServiceInterface{

    @Override
    public Quote getQuote() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://gturnquist-quoters.cfapps.io/api/random";
        Quote mahQuote = restTemplate.getForObject(url, Quote.class);
        return mahQuote;
    }
}
