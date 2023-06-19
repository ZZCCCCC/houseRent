package com.zzc.mapper;

import com.zzc.entity.Build;
import com.zzc.entity.Estate;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author: 赵智超
 * @date: 2023/02/20/14:37
 * @Description:
 */
@Mapper
public interface BuildMapper {
    List<Build> selectAll();

    List<Build> buildByCondition(String estateName);

    void deleteBuild(int buildId);

    void insertBuild(Map<String, Object> map);

    void editeBuild(Map<String, Object> map);

    List<Build> selectAllBUildByEstate(int estateId);
}
