package algorithms.interview.yelp;

/**
 * Created by Mohammed Fathy @ 8/29/2018
 * dev.mfathy@gmail.com
 * <p>
 */
public class BusinessInfo {

    int id;
    int rating;

    public BusinessInfo(int id, int rating) {
        this.id = id;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "BusinessInfo{" +
                "id=" + id +
                ", rating=" + rating +
                '}';
    }
}
