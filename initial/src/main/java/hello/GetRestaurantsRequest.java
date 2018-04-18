package hello;

public class GetRestaurantsRequest {

    String location;
    String term;

    public GetRestaurantsRequest(String term, String location) {
        this.location = location;
        this.term = term;
    }

    public String getLocation() {

        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }
}
