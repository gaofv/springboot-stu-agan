package org.springboot.dao;

import org.apache.ibatis.annotations.Param;
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

    /**
     * 单个sql，多次执行
     *
     * @param list
     * @return
     */
    int batchUpdateSql(@Param("list") List<ApplicationInfo> list);

    /**
     * insert into .. on duplicate key update ...
     *
     * @param list
     * @return
     */
    int batchUpdateDuplicateKey(@Param("list") List<ApplicationInfo> list);

    /**
     * replace into
     *
     * @param list
     * @return
     */
    int batchUpdateReplaceInto(@Param("list") List<ApplicationInfo> list);

    /**
     * update case when
     *
     * @param list
     * @return
     */
    int batchUpdateCaseWhen(@Param("list") List<ApplicationInfo> list);
}
