package com.example.jsonplaceholder.utils.converters;

import com.example.jsonplaceholder.model.JPHAddress;
import com.example.jsonplaceholder.model.JPHCompany;
import com.example.jsonplaceholder.model.JPHGeo;
import com.example.jsonplaceholder.model.document.Address;
import com.example.jsonplaceholder.model.document.Company;
import com.example.jsonplaceholder.model.document.Geo;
import com.example.jsonplaceholder.model.document.UserDocuments;
import com.example.jsonplaceholder.model.dto.response.JPHUserResponse;

public class UserConverter {
    public static UserDocuments convertJPHuserTouserDocuments(JPHUserResponse jphUserResponse){
        return UserDocuments.builder()
                .id(jphUserResponse.getId())
                .address(convertJPHAddressToaddress(jphUserResponse.getAddress()))
                .company(convertJPHCompanyToCompany(jphUserResponse.getCompany()))
                .email(jphUserResponse.getEmail())
                .name(jphUserResponse.getName())
                .username(jphUserResponse.getUsername())
                .phone(jphUserResponse.getPhone())
                .website(jphUserResponse.getWebsite())
                .build();
    }
    public static Address convertJPHAddressToaddress(JPHAddress jphAddress){
        return Address.builder()
                .city(jphAddress.getCity())
                .geo(convertJPHGeoToGeo(jphAddress.getGeo()))
                .street(jphAddress.getStreet())
                .suite(jphAddress.getSuite())
                .zipcode(jphAddress.getZipcode())
                .build();
    }
    public static Geo convertJPHGeoToGeo(JPHGeo jphGeo){
        return Geo.builder()
                .lat(jphGeo.getLat())
                .lng(jphGeo.getLng())
                .build();
    }
    public static Company convertJPHCompanyToCompany(JPHCompany jphCompany){
        return Company.builder()
                .bs(jphCompany.getBs())
                .catchPhrase(jphCompany.getCatchPhrase())
                .name(jphCompany.getName())
                .build();
    }
}
