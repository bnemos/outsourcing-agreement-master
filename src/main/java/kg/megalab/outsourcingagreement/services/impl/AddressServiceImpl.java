package kg.megalab.outsourcingagreement.services.impl;

import kg.megalab.outsourcingagreement.models.Address;
import kg.megalab.outsourcingagreement.repo.AddressRepo;
import kg.megalab.outsourcingagreement.services.AddressService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    private AddressRepo addressRepo;

    public AddressServiceImpl(AddressRepo addressRepo){
        this.addressRepo=addressRepo;
    }

    @Override
    public Address saveAddress(Address address) {
        address=addressRepo.save(address);
        return null;
    }

    @Override
    public List<Address> getAll() {
        return addressRepo.findAll();
    }

    @Override
    public Address deleteAddress(Address address) {
        addressRepo.delete(address);
        return null;
    }
}
