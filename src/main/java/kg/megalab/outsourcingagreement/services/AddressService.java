package kg.megalab.outsourcingagreement.services;

import kg.megalab.outsourcingagreement.models.Address;

import java.util.List;

public interface AddressService {
    Address saveAddress(Address address);

    List<Address> getAll();

    Address deleteAddress(Address address);
}
