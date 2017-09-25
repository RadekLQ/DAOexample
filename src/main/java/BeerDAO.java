import java.util.List;

public interface BeerDAO {

    List<Beer> findAll();
    List<Beer> findById();
    List<Beer> findByName();
    boolean insertBeer(Beer beer);
    boolean updateBeer(Beer beer);
    boolean deleteBeer(Beer beer);
}
