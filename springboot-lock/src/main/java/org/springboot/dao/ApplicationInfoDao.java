package org.springboot.dao;

import org.mapstruct.Mapper;
import org.springboot.entity.ApplicationInfo;

import java.util.List;

/**
 * @ProjectName：springboot-stu
 * @PackageName：org.springboot.dao
 * @Description：
 * @Author：GF
 * @Date：2022/5/5 21:33
 */
@Mapper
public interface ApplicationInfoDao {

    ApplicationInfo selectByPrimaryKey(String appKey);

    List<ApplicationInfo> selectList(String appName);

    int insertSelective(ApplicationInfo record);

    int updateBySelective(ApplicationInfo record);

    int deleteByPrimaryKey(String appKey);
}
