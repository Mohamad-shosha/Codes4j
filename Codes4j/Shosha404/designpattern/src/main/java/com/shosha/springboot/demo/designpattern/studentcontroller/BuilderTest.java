package com.shosha.springboot.demo.designpattern.studentcontroller;


import com.shosha.springboot.demo.designpattern.model.dto.AddressDto;

public class BuilderTest {
    public static void main(String[] args) {
        AddressDto addressDto =  AddressDto.builder()
                .setCountry("Egypt")
                .setCity("cairo")
                .setBuildingNumber(6)
                .setStreet("Elkhateeb")
                .setZipcode("12654")
                .build();
        System.out.println(addressDto);
    }
}
