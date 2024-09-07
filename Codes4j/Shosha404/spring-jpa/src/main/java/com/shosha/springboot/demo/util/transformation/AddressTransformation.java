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
        addressDto.setZip(address.getZipCode());
        addressDto.setCountry(address.getCountry());
        return addressDto;
    }

    public static Address transformToAddress(AddressDto addressDto) {
        Address.AddressBuilder builder = Address.builder();
        builder.id(RandomValues.randomNumbersForId())
                .street(addressDto.getStreet())
                .city(addressDto.getCity())
                .state(addressDto.getState())
                .zipCode(addressDto.getZip())
                .country(addressDto.getCountry());
        return builder.build();
    }
}
