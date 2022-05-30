package com.jpkhawam.finalprojectapi.apis.settings;

import com.jpkhawam.finalprojectapi.apis.ApiRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SettingService {
    //  private static final Logger logger = LoggerFactory.getLogger(SettingService.class);

    final SettingMapper settingMapper;

    public SettingService(SettingMapper settingMapper) {
        this.settingMapper = settingMapper;
    }

    public List<Setting> getAll(ApiRequest apiRequest) {
        return settingMapper.selectAll(apiRequest);
    }

    public Integer getCount(ApiRequest apiRequest) {
        return this.settingMapper.selectCount(apiRequest);
    }

    public Setting getById(int id) {
        return settingMapper.selectById(id);
    }

    public void update(Setting setting) {
        settingMapper.update(setting);
    }

    public void insert(Setting setting) {
        settingMapper.insert(setting);
    }

    public void delete(int id) {
        settingMapper.delete(id);
    }
}
