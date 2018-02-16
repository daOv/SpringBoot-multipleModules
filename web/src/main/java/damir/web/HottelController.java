package damir.web;

import damir.domain.Hotel;
import damir.persistence.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HottelController {

    @Autowired
    private HotelRepository hotelRepository;

    @GetMapping(value = "/hotels")
    public List<Hotel> getHotels(){
        List<Hotel> hotels = this.hotelRepository.findAll();
        return hotels;
    }
}
