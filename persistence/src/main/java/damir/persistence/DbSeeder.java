package damir.persistence;

import damir.domain.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

//kad implementiramo CommandLineRunner interface ova klasa se automatski izvrsava kada pocnemo nasu spring applikaciju
@Component
public class DbSeeder implements CommandLineRunner {

    @PostConstruct
    private void as(){

        this.hotelRepository.findAll().stream().forEach( h -> System.out.println(h.toString()));
    }

    private HotelRepository hotelRepository;

    public DbSeeder(HotelRepository hotelRepository) {
        this.hotelRepository=hotelRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        Hotel marriot = new Hotel("Mariot",5,true);
        Hotel ibis = new Hotel("Ibis",3,false);
        Hotel goldenTulip = new Hotel("Golden Tulip",4,true);

        List<Hotel> hotels = new ArrayList<>();
        hotels.add(marriot);
        hotels.add(ibis);
        hotels.add(goldenTulip);
        this.hotelRepository.save(hotels);
    }
}
