package hello;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class YelpService  implements  YelpServiceInterface{

    @Override
    public GetRestaurantsResponse getRestaurants(GetRestaurantsRequest request) throws Exception{

        GetRestaurantsResponse response = new GetRestaurantsResponse();
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Bearer BEfhZtkrid-6PpLkPAsySs3lDnswwfql6JUoRQ9coBFfGmmRXCRGSvV54ISBHoKS8Y-5xDfy4QCY9pd9yHuTCEN0cSScscPhoSwYzhusaltZHhm2J1Jl_w8ei1zFWnYx");
        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
        String endpoint = "https://api.yelp.com/v3/businesses/search?";
        endpoint = endpoint + "term="+ request.getTerm() + "&location=" + request.getLocation();
        System.out.println(endpoint);
        ResponseEntity<String> responseEntity = restTemplate.exchange(endpoint,
                HttpMethod.GET, entity, String.class);

    response = new ObjectMapper().readValue(responseEntity.getBody(), GetRestaurantsResponse.class);


        System.out.println(responseEntity.getBody());

//        response.setRestaurants(responseEntity.getBody());
        return response;
    }
}
