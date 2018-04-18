package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RequestMapping("/restaurants")
@RestController
public class YelpController {

    @Autowired
    private YelpService yelpService;

    @RequestMapping(method = RequestMethod.GET)
    public GetRestaurantsResponse getQuote(@RequestParam("term") String term, @RequestParam("location") String location){
        GetRestaurantsRequest getRestaurantsRequest = new GetRestaurantsRequest(term,location);
        System.out.println(getRestaurantsRequest);
        System.out.println("Hitting service");
        try {
            return yelpService.getRestaurants(getRestaurantsRequest);
        }

        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

//    @RequestBody
//    Meal meal
}
