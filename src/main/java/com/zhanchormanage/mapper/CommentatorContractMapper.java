package com.zhanchormanage.mapper;

import com.zhanchormanage.model.CommentatorContract;
import com.zhanchormanage.model.CommentatorContractExample;
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

public interface CommentatorContractMapper {
    @SelectProvider(type=CommentatorContractSqlProvider.class, method="countByExample")
    long countByExample(CommentatorContractExample example);

    @DeleteProvider(type=CommentatorContractSqlProvider.class, method="deleteByExample")
    int deleteByExample(CommentatorContractExample example);

    @Select({
            "select",
            "id, b_name, fromtime, totime, blance, a_name, id_card, address, yy_number, tel, ",
            "collection_account, householder, opening_bank, stage_name, effective_days, effective_hours, ",
            "filehost, tofile, created_time, updated_time",
            "from commentator_contract"
    })
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="b_name", property="bName", jdbcType=JdbcType.VARCHAR),
            @Result(column="fromtime", property="fromtime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="totime", property="totime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="blance", property="blance", jdbcType=JdbcType.VARCHAR),
            @Result(column="a_name", property="aName", jdbcType=JdbcType.VARCHAR),
            @Result(column="id_card", property="idCard", jdbcType=JdbcType.VARCHAR),
            @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
            @Result(column="yy_number", property="yyNumber", jdbcType=JdbcType.INTEGER),
            @Result(column="tel", property="tel", jdbcType=JdbcType.VARCHAR),
            @Result(column="collection_account", property="collectionAccount", jdbcType=JdbcType.VARCHAR),
            @Result(column="householder", property="householder", jdbcType=JdbcType.VARCHAR),
            @Result(column="opening_bank", property="openingBank", jdbcType=JdbcType.VARCHAR),
            @Result(column="stage_name", property="stageName", jdbcType=JdbcType.VARCHAR),
            @Result(column="effective_days", property="effectiveDays", jdbcType=JdbcType.INTEGER),
            @Result(column="effective_hours", property="effectiveHours", jdbcType=JdbcType.INTEGER),
            @Result(column="filehost", property="filehost", jdbcType=JdbcType.VARCHAR),
            @Result(column="tofile", property="tofile", jdbcType=JdbcType.INTEGER),
            @Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="updated_time", property="updatedTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<CommentatorContract> queryVo();


    @Select({
            "select",
            "id,fromtime, totime, a_name,address, tel, stage_name, filehost",
            "tofile,created_time, updated_time",
            "from artiste_supply_contract",
            "where (to_days(totime) - to_days(now())) < 30"
    })
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="fromtime", property="fromtime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="totime", property="totime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="a_name", property="aName", jdbcType=JdbcType.VARCHAR),
            @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
            @Result(column="tel", property="tel", jdbcType=JdbcType.VARCHAR),
            @Result(column="stage_name", property="stageName", jdbcType=JdbcType.VARCHAR),
            @Result(column="tofile", property="tofile", jdbcType=JdbcType.INTEGER),
            @Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="updated_time", property="updatedTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<CommentatorContract> queryVoSearch();



    @Select({
            "select",
            "id,fromtime, totime, a_name,address, tel, ",
            "stage_name,",
            "tofile,created_time, updated_time",
            "from commentator_contract"
    })
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="fromtime", property="fromtime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="totime", property="totime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="a_name", property="aName", jdbcType=JdbcType.VARCHAR),
            @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
            @Result(column="tel", property="tel", jdbcType=JdbcType.VARCHAR),
            @Result(column="stage_name", property="stageName", jdbcType=JdbcType.VARCHAR),
            @Result(column="tofile", property="tofile", jdbcType=JdbcType.INTEGER),
            @Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="updated_time", property="updatedTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<CommentatorContract> queryVo1();
    @Delete({
        "delete from commentator_contract",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into commentator_contract (id, b_name, ",
        "fromtime, totime, ",
        "blance, a_name, id_card, ",
        "address, yy_number, ",
        "tel, collection_account, ",
        "householder, opening_bank, ",
        "stage_name, effective_days, ",
        "effective_hours, filehost, ",
        "tofile, created_time, ",
        "updated_time)",
        "values (#{id,jdbcType=INTEGER}, #{bName,jdbcType=VARCHAR}, ",
        "#{fromtime,jdbcType=TIMESTAMP}, #{totime,jdbcType=TIMESTAMP}, ",
        "#{blance,jdbcType=VARCHAR}, #{aName,jdbcType=VARCHAR}, #{idCard,jdbcType=VARCHAR}, ",
        "#{address,jdbcType=VARCHAR}, #{yyNumber,jdbcType=INTEGER}, ",
        "#{tel,jdbcType=VARCHAR}, #{collectionAccount,jdbcType=VARCHAR}, ",
        "#{householder,jdbcType=VARCHAR}, #{openingBank,jdbcType=VARCHAR}, ",
        "#{stageName,jdbcType=VARCHAR}, #{effectiveDays,jdbcType=INTEGER}, ",
        "#{effectiveHours,jdbcType=INTEGER}, #{filehost,jdbcType=VARCHAR}, ",
        "#{tofile,jdbcType=INTEGER}, #{createdTime,jdbcType=TIMESTAMP}, ",
        "#{updatedTime,jdbcType=TIMESTAMP})"
    })
    int insert(CommentatorContract record);

    @InsertProvider(type=CommentatorContractSqlProvider.class, method="insertSelective")
    int insertSelective(CommentatorContract record);

    @SelectProvider(type=CommentatorContractSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="b_name", property="bName", jdbcType=JdbcType.VARCHAR),
        @Result(column="fromtime", property="fromtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="totime", property="totime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="blance", property="blance", jdbcType=JdbcType.VARCHAR),
        @Result(column="a_name", property="aName", jdbcType=JdbcType.VARCHAR),
        @Result(column="id_card", property="idCard", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="yy_number", property="yyNumber", jdbcType=JdbcType.INTEGER),
        @Result(column="tel", property="tel", jdbcType=JdbcType.VARCHAR),
        @Result(column="collection_account", property="collectionAccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="householder", property="householder", jdbcType=JdbcType.VARCHAR),
        @Result(column="opening_bank", property="openingBank", jdbcType=JdbcType.VARCHAR),
        @Result(column="stage_name", property="stageName", jdbcType=JdbcType.VARCHAR),
        @Result(column="effective_days", property="effectiveDays", jdbcType=JdbcType.INTEGER),
        @Result(column="effective_hours", property="effectiveHours", jdbcType=JdbcType.INTEGER),
        @Result(column="filehost", property="filehost", jdbcType=JdbcType.VARCHAR),
        @Result(column="tofile", property="tofile", jdbcType=JdbcType.INTEGER),
        @Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_time", property="updatedTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<CommentatorContract> selectByExample(CommentatorContractExample example);

    @Select({
        "select",
        "id, b_name, fromtime, totime, blance, a_name, id_card, address, yy_number, tel, ",
        "collection_account, householder, opening_bank, stage_name, effective_days, effective_hours, ",
        "filehost, tofile, created_time, updated_time",
        "from commentator_contract",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="b_name", property="bName", jdbcType=JdbcType.VARCHAR),
        @Result(column="fromtime", property="fromtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="totime", property="totime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="blance", property="blance", jdbcType=JdbcType.VARCHAR),
        @Result(column="a_name", property="aName", jdbcType=JdbcType.VARCHAR),
        @Result(column="id_card", property="idCard", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="yy_number", property="yyNumber", jdbcType=JdbcType.INTEGER),
        @Result(column="tel", property="tel", jdbcType=JdbcType.VARCHAR),
        @Result(column="collection_account", property="collectionAccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="householder", property="householder", jdbcType=JdbcType.VARCHAR),
        @Result(column="opening_bank", property="openingBank", jdbcType=JdbcType.VARCHAR),
        @Result(column="stage_name", property="stageName", jdbcType=JdbcType.VARCHAR),
        @Result(column="effective_days", property="effectiveDays", jdbcType=JdbcType.INTEGER),
        @Result(column="effective_hours", property="effectiveHours", jdbcType=JdbcType.INTEGER),
        @Result(column="filehost", property="filehost", jdbcType=JdbcType.VARCHAR),
        @Result(column="tofile", property="tofile", jdbcType=JdbcType.INTEGER),
        @Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_time", property="updatedTime", jdbcType=JdbcType.TIMESTAMP)
    })
    CommentatorContract selectByPrimaryKey(Integer id);

    @UpdateProvider(type=CommentatorContractSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CommentatorContract record, @Param("example") CommentatorContractExample example);

    @UpdateProvider(type=CommentatorContractSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CommentatorContract record, @Param("example") CommentatorContractExample example);

    @UpdateProvider(type=CommentatorContractSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CommentatorContract record);

    @Update({
        "update commentator_contract",
        "set b_name = #{bName,jdbcType=VARCHAR},",
          "fromtime = #{fromtime,jdbcType=TIMESTAMP},",
          "totime = #{totime,jdbcType=TIMESTAMP},",
          "blance = #{blance,jdbcType=VARCHAR},",
          "a_name = #{aName,jdbcType=VARCHAR},",
          "id_card = #{idCard,jdbcType=VARCHAR},",
          "address = #{address,jdbcType=VARCHAR},",
          "yy_number = #{yyNumber,jdbcType=INTEGER},",
          "tel = #{tel,jdbcType=VARCHAR},",
          "collection_account = #{collectionAccount,jdbcType=VARCHAR},",
          "householder = #{householder,jdbcType=VARCHAR},",
          "opening_bank = #{openingBank,jdbcType=VARCHAR},",
          "stage_name = #{stageName,jdbcType=VARCHAR},",
          "effective_days = #{effectiveDays,jdbcType=INTEGER},",
          "effective_hours = #{effectiveHours,jdbcType=INTEGER},",
          "filehost = #{filehost,jdbcType=VARCHAR},",
          "tofile = #{tofile,jdbcType=INTEGER},",
          "created_time = #{createdTime,jdbcType=TIMESTAMP},",
          "updated_time = #{updatedTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CommentatorContract record);
}