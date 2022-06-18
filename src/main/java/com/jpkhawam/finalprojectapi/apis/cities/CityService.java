package com.jpkhawam.finalprojectapi.apis.cities;

import com.jpkhawam.finalprojectapi.apis.ApiRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CityService {
    final CityMapper cityMapper;

    public CityService(CityMapper cityMapper) {
        this.cityMapper = cityMapper;
    }

    public List<City> getAll(ApiRequest apiRequest) {
        return cityMapper.selectAll(apiRequest);
    }

    public Integer getCount(ApiRequest apiRequest) {
        return this.cityMapper.selectCount(apiRequest);
    }

    public City getById(UUID id) {
        return cityMapper.selectById(id);
    }

    public void update(City city) {
        cityMapper.update(city);
    }

    public void insert(City city) {
        cityMapper.insert(city);
    }

    public void delete(UUID id) {
        cityMapper.delete(id);
    }
}
