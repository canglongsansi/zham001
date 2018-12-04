package com.zhanchormanage.mapper;

import com.zhanchormanage.model.ArtistBrokerageContract;
import com.zhanchormanage.model.ArtistBrokerageContractExample;
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

public interface ArtistBrokerageContractMapper {
    @SelectProvider(type=ArtistBrokerageContractSqlProvider.class, method="countByExample")
    long countByExample(ArtistBrokerageContractExample example);

    @DeleteProvider(type=ArtistBrokerageContractSqlProvider.class, method="deleteByExample")
    int deleteByExample(ArtistBrokerageContractExample example);

    @Select({
            "select",
            "id, b_name, fromtime, totime, blance, a_name, id_card, address, yy_number, tel, ",
            "collection_account, householder, opening_bank, stage_name, effective_days, effective_hours, ",
            "filehost, tofile, created_time, updated_time",
            "from artist_brokerage_contract"
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
    List<ArtistBrokerageContract> queryVo();


    @Select({
            "select",
            "id, fromtime, totime, a_name, address, tel, stage_name, ",
            "tofile, created_time, updated_time",
            "from artist_brokerage_contract"
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
    List<ArtistBrokerageContract> queryVo1();



    @Select({
            "select",
            "id,fromtime, totime, a_name,address, tel, stage_name, filehost",
            "tofile,created_time, updated_time",
            "from artist_brokerage_contract",
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
    List<ArtistBrokerageContract> queryVoSearch();



    @Delete({
        "delete from artist_brokerage_contract",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into artist_brokerage_contract (id, b_name, ",
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
    int insert(ArtistBrokerageContract record);

    @InsertProvider(type=ArtistBrokerageContractSqlProvider.class, method="insertSelective")
    int insertSelective(ArtistBrokerageContract record);

    @SelectProvider(type=ArtistBrokerageContractSqlProvider.class, method="selectByExample")
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
    List<ArtistBrokerageContract> selectByExample(ArtistBrokerageContractExample example);

    @Select({
        "select",
        "id, b_name, fromtime, totime, blance, a_name, id_card, address, yy_number, tel, ",
        "collection_account, householder, opening_bank, stage_name, effective_days, effective_hours, ",
        "filehost, tofile, created_time, updated_time",
        "from artist_brokerage_contract",
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
    ArtistBrokerageContract selectByPrimaryKey(Integer id);

    @UpdateProvider(type=ArtistBrokerageContractSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ArtistBrokerageContract record, @Param("example") ArtistBrokerageContractExample example);

    @UpdateProvider(type=ArtistBrokerageContractSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ArtistBrokerageContract record, @Param("example") ArtistBrokerageContractExample example);

    @UpdateProvider(type=ArtistBrokerageContractSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ArtistBrokerageContract record);

    @Update({
        "update artist_brokerage_contract",
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
    int updateByPrimaryKey(ArtistBrokerageContract record);
}