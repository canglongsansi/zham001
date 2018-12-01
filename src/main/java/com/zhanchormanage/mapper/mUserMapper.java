package com.zhanchormanage.mapper;

import com.zhanchormanage.model.mUser;
import com.zhanchormanage.model.mUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface mUserMapper {
    @SelectProvider(type=mUserSqlProvider.class, method="countByExample")
    long countByExample(mUserExample example);

    @DeleteProvider(type=mUserSqlProvider.class, method="deleteByExample")
    int deleteByExample(mUserExample example);

    @Delete({
        "delete from m_user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into m_user (id, username, ",
        "password)",
        "values (#{id,jdbcType=INTEGER}, #{username,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR})"
    })
    int insert(mUser record);

    @InsertProvider(type=mUserSqlProvider.class, method="insertSelective")
    int insertSelective(mUser record);

    @SelectProvider(type=mUserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR)
    })
    List<mUser> selectByExample(mUserExample example);

    @Select({
        "select",
        "id, username, password",
        "from m_user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR)
    })
    mUser selectByPrimaryKey(Integer id);

    @Select({
            "select",
            "id, username, password",
            "from m_user",
            "where username = #{username,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
            @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR)
    })
    mUser selectByUsername(String username);

    @UpdateProvider(type=mUserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") mUser record, @Param("example") mUserExample example);

    @UpdateProvider(type=mUserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") mUser record, @Param("example") mUserExample example);

    @UpdateProvider(type=mUserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(mUser record);

    @Update({
        "update m_user",
        "set username = #{username,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(mUser record);
}