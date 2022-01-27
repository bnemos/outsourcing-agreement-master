package kg.megalab.outsourcingagreement.controllers;

import kg.megalab.outsourcingagreement.models.Address;
import kg.megalab.outsourcingagreement.services.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/address")
@AllArgsConstructor
public class AddressController {
    private AddressService addressService;

    @PostMapping("/save")
    public Address saveAddress(@RequestBody Address address){
        return addressService.saveAddress(address);
    }

    @GetMapping("/getAll")
    public List<Address> getAllAddresses(){
        return addressService.getAll();
    }
    @PutMapping("/update")
    public Address updateAddress(@RequestBody Address address){
        return addressService.saveAddress(address);
    }

    @DeleteMapping("/delete")
    public  Address deleteAddress(@RequestBody Address address){
        return addressService.deleteAddress(address);
    }
}
