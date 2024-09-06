package com.shosha.springboot.demo.util.transformation;

import com.shosha.springboot.demo.model.dto.AddressDto;
import com.shosha.springboot.demo.model.entity.Address;
import com.shosha.springboot.demo.util.randomids.RandomValues;

public class AddressTransformation {

    private AddressTransformation() {
    }

    public static AddressDto transformToAddressDto(Address address) {
        AddressDto addressDto = new AddressDto();
        addressDto.setStreet(address.getStreet());
        addressDto.setCity(address.getCity());
        addressDto.setState(address.getState());
        addressDto.setZip(address.getPostalCode());
        addressDto.setCountry(address.getCountry());
        return addressDto;
    }

    public static Address transformToAddress(AddressDto addressDto) {
        Address address = new Address();
        address.setId(RandomValues.randomNumbersForId());
        address.setStreet(addressDto.getStreet());
        address.setCity(addressDto.getCity());
        address.setState(addressDto.getState());
        address.setPostalCode(addressDto.getZip());
        address.setCountry(addressDto.getCountry());
        return address;
    }
}
