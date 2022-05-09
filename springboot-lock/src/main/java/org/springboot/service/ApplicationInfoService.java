package org.springboot.service;

import org.springboot.dao.ApplicationInfoDao;
import org.springboot.entity.ApplicationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

/**
 * @ProjectName：springboot-stu
 * @PackageName：org.springboot.service
 * @Description：
 * @Author：GF
 * @Date：2022/5/5 22:00
 */
@Service
public class ApplicationInfoService {

    @Autowired
    private ApplicationInfoDao applicationInfoDao;

    @Transactional
    public void addApplication(ApplicationInfo record) {
        String appKey = UUID.randomUUID().toString().replace("-", "");
        record.setAppKey(appKey);
        record.setAppName(record.getAppName());
        record.setAppDescription(record.getAppDescription());
        record.setAppNum(record.getAppNum());
        applicationInfoDao.insertSelective(record);
    }

    @Transactional
    public void updateApplication(ApplicationInfo record) {
        if (applicationInfoDao.selectByPrimaryKey(record.getAppKey()) == null) {
            throw new RuntimeException("记录不存在");
        }
        applicationInfoDao.updateBySelective(record);
    }

    public List<ApplicationInfo> getList(String appName) {
        List<ApplicationInfo> appList = applicationInfoDao.selectList(appName);
        return appList;
    }

    public ApplicationInfo getOne(String appKey) {
        ApplicationInfo appInfo = applicationInfoDao.selectByPrimaryKey(appKey);
        if (appInfo == null) {
            throw new RuntimeException("记录不存在");
        }
        return appInfo;
    }

    public void removeApplication(String appKey) {
        if (applicationInfoDao.selectByPrimaryKey(appKey) == null) {
            throw new RuntimeException("记录不存在");
        }
        applicationInfoDao.deleteByPrimaryKey(appKey);
    }
}
