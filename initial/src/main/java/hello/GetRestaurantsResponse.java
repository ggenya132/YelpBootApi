package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetRestaurantsResponse {


    String total;

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    List<Restaurant> businesses;



    public GetRestaurantsResponse() {
        this.businesses = new ArrayList<>();
    }

    public List<Restaurant> getBusinesses() {

        return businesses;
    }

    public void setBusinesses(List<Restaurant> businesses) {
        this.businesses = businesses;
    }
}
