package com.zhanchormanage.mapper;

import com.zhanchormanage.model.ThreePartyContract;
import com.zhanchormanage.model.ThreePartyContractExample.Criteria;
import com.zhanchormanage.model.ThreePartyContractExample.Criterion;
import com.zhanchormanage.model.ThreePartyContractExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class ThreePartyContractSqlProvider {

    public String countByExample(ThreePartyContractExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("three_party_contract");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(ThreePartyContractExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("three_party_contract");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(ThreePartyContract record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("three_party_contract");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getbName() != null) {
            sql.VALUES("b_name", "#{bName,jdbcType=VARCHAR}");
        }
        
        if (record.getFromtime() != null) {
            sql.VALUES("fromtime", "#{fromtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTotime() != null) {
            sql.VALUES("totime", "#{totime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getBlance() != null) {
            sql.VALUES("blance", "#{blance,jdbcType=VARCHAR}");
        }
        
        if (record.getaName() != null) {
            sql.VALUES("a_name", "#{aName,jdbcType=VARCHAR}");
        }
        
        if (record.getIdCard() != null) {
            sql.VALUES("id_card", "#{idCard,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            sql.VALUES("address", "#{address,jdbcType=VARCHAR}");
        }
        
        if (record.getYyNumber() != null) {
            sql.VALUES("yy_number", "#{yyNumber,jdbcType=INTEGER}");
        }
        
        if (record.getTel() != null) {
            sql.VALUES("tel", "#{tel,jdbcType=VARCHAR}");
        }
        
        if (record.getCollectionAccount() != null) {
            sql.VALUES("collection_account", "#{collectionAccount,jdbcType=VARCHAR}");
        }
        
        if (record.getHouseholder() != null) {
            sql.VALUES("householder", "#{householder,jdbcType=VARCHAR}");
        }
        
        if (record.getOpeningBank() != null) {
            sql.VALUES("opening_bank", "#{openingBank,jdbcType=VARCHAR}");
        }
        
        if (record.getStageName() != null) {
            sql.VALUES("stage_name", "#{stageName,jdbcType=VARCHAR}");
        }
        
        if (record.getEffectiveDays() != null) {
            sql.VALUES("effective_days", "#{effectiveDays,jdbcType=INTEGER}");
        }
        
        if (record.getEffectiveHours() != null) {
            sql.VALUES("effective_hours", "#{effectiveHours,jdbcType=INTEGER}");
        }
        
        if (record.getFilehost() != null) {
            sql.VALUES("filehost", "#{filehost,jdbcType=VARCHAR}");
        }
        
        if (record.getTofile() != null) {
            sql.VALUES("tofile", "#{tofile,jdbcType=INTEGER}");
        }
        
        if (record.getCreatedTime() != null) {
            sql.VALUES("created_time", "#{createdTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedTime() != null) {
            sql.VALUES("updated_time", "#{updatedTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(ThreePartyContractExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("b_name");
        sql.SELECT("fromtime");
        sql.SELECT("totime");
        sql.SELECT("blance");
        sql.SELECT("a_name");
        sql.SELECT("id_card");
        sql.SELECT("address");
        sql.SELECT("yy_number");
        sql.SELECT("tel");
        sql.SELECT("collection_account");
        sql.SELECT("householder");
        sql.SELECT("opening_bank");
        sql.SELECT("stage_name");
        sql.SELECT("effective_days");
        sql.SELECT("effective_hours");
        sql.SELECT("filehost");
        sql.SELECT("tofile");
        sql.SELECT("created_time");
        sql.SELECT("updated_time");
        sql.FROM("three_party_contract");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        ThreePartyContract record = (ThreePartyContract) parameter.get("record");
        ThreePartyContractExample example = (ThreePartyContractExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("three_party_contract");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getbName() != null) {
            sql.SET("b_name = #{record.bName,jdbcType=VARCHAR}");
        }
        
        if (record.getFromtime() != null) {
            sql.SET("fromtime = #{record.fromtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTotime() != null) {
            sql.SET("totime = #{record.totime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getBlance() != null) {
            sql.SET("blance = #{record.blance,jdbcType=VARCHAR}");
        }
        
        if (record.getaName() != null) {
            sql.SET("a_name = #{record.aName,jdbcType=VARCHAR}");
        }
        
        if (record.getIdCard() != null) {
            sql.SET("id_card = #{record.idCard,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            sql.SET("address = #{record.address,jdbcType=VARCHAR}");
        }
        
        if (record.getYyNumber() != null) {
            sql.SET("yy_number = #{record.yyNumber,jdbcType=INTEGER}");
        }
        
        if (record.getTel() != null) {
            sql.SET("tel = #{record.tel,jdbcType=VARCHAR}");
        }
        
        if (record.getCollectionAccount() != null) {
            sql.SET("collection_account = #{record.collectionAccount,jdbcType=VARCHAR}");
        }
        
        if (record.getHouseholder() != null) {
            sql.SET("householder = #{record.householder,jdbcType=VARCHAR}");
        }
        
        if (record.getOpeningBank() != null) {
            sql.SET("opening_bank = #{record.openingBank,jdbcType=VARCHAR}");
        }
        
        if (record.getStageName() != null) {
            sql.SET("stage_name = #{record.stageName,jdbcType=VARCHAR}");
        }
        
        if (record.getEffectiveDays() != null) {
            sql.SET("effective_days = #{record.effectiveDays,jdbcType=INTEGER}");
        }
        
        if (record.getEffectiveHours() != null) {
            sql.SET("effective_hours = #{record.effectiveHours,jdbcType=INTEGER}");
        }
        
        if (record.getFilehost() != null) {
            sql.SET("filehost = #{record.filehost,jdbcType=VARCHAR}");
        }
        
        if (record.getTofile() != null) {
            sql.SET("tofile = #{record.tofile,jdbcType=INTEGER}");
        }
        
        if (record.getCreatedTime() != null) {
            sql.SET("created_time = #{record.createdTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedTime() != null) {
            sql.SET("updated_time = #{record.updatedTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("three_party_contract");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("b_name = #{record.bName,jdbcType=VARCHAR}");
        sql.SET("fromtime = #{record.fromtime,jdbcType=TIMESTAMP}");
        sql.SET("totime = #{record.totime,jdbcType=TIMESTAMP}");
        sql.SET("blance = #{record.blance,jdbcType=VARCHAR}");
        sql.SET("a_name = #{record.aName,jdbcType=VARCHAR}");
        sql.SET("id_card = #{record.idCard,jdbcType=VARCHAR}");
        sql.SET("address = #{record.address,jdbcType=VARCHAR}");
        sql.SET("yy_number = #{record.yyNumber,jdbcType=INTEGER}");
        sql.SET("tel = #{record.tel,jdbcType=VARCHAR}");
        sql.SET("collection_account = #{record.collectionAccount,jdbcType=VARCHAR}");
        sql.SET("householder = #{record.householder,jdbcType=VARCHAR}");
        sql.SET("opening_bank = #{record.openingBank,jdbcType=VARCHAR}");
        sql.SET("stage_name = #{record.stageName,jdbcType=VARCHAR}");
        sql.SET("effective_days = #{record.effectiveDays,jdbcType=INTEGER}");
        sql.SET("effective_hours = #{record.effectiveHours,jdbcType=INTEGER}");
        sql.SET("filehost = #{record.filehost,jdbcType=VARCHAR}");
        sql.SET("tofile = #{record.tofile,jdbcType=INTEGER}");
        sql.SET("created_time = #{record.createdTime,jdbcType=TIMESTAMP}");
        sql.SET("updated_time = #{record.updatedTime,jdbcType=TIMESTAMP}");
        
        ThreePartyContractExample example = (ThreePartyContractExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(ThreePartyContract record) {
        SQL sql = new SQL();
        sql.UPDATE("three_party_contract");
        
        if (record.getbName() != null) {
            sql.SET("b_name = #{bName,jdbcType=VARCHAR}");
        }
        
        if (record.getFromtime() != null) {
            sql.SET("fromtime = #{fromtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTotime() != null) {
            sql.SET("totime = #{totime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getBlance() != null) {
            sql.SET("blance = #{blance,jdbcType=VARCHAR}");
        }
        
        if (record.getaName() != null) {
            sql.SET("a_name = #{aName,jdbcType=VARCHAR}");
        }
        
        if (record.getIdCard() != null) {
            sql.SET("id_card = #{idCard,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            sql.SET("address = #{address,jdbcType=VARCHAR}");
        }
        
        if (record.getYyNumber() != null) {
            sql.SET("yy_number = #{yyNumber,jdbcType=INTEGER}");
        }
        
        if (record.getTel() != null) {
            sql.SET("tel = #{tel,jdbcType=VARCHAR}");
        }
        
        if (record.getCollectionAccount() != null) {
            sql.SET("collection_account = #{collectionAccount,jdbcType=VARCHAR}");
        }
        
        if (record.getHouseholder() != null) {
            sql.SET("householder = #{householder,jdbcType=VARCHAR}");
        }
        
        if (record.getOpeningBank() != null) {
            sql.SET("opening_bank = #{openingBank,jdbcType=VARCHAR}");
        }
        
        if (record.getStageName() != null) {
            sql.SET("stage_name = #{stageName,jdbcType=VARCHAR}");
        }
        
        if (record.getEffectiveDays() != null) {
            sql.SET("effective_days = #{effectiveDays,jdbcType=INTEGER}");
        }
        
        if (record.getEffectiveHours() != null) {
            sql.SET("effective_hours = #{effectiveHours,jdbcType=INTEGER}");
        }
        
        if (record.getFilehost() != null) {
            sql.SET("filehost = #{filehost,jdbcType=VARCHAR}");
        }
        
        if (record.getTofile() != null) {
            sql.SET("tofile = #{tofile,jdbcType=INTEGER}");
        }
        
        if (record.getCreatedTime() != null) {
            sql.SET("created_time = #{createdTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedTime() != null) {
            sql.SET("updated_time = #{updatedTime,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, ThreePartyContractExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}