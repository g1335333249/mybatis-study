package com.g1335333249.typeHandlers;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author guanpeng
 * @date 2019-07-12 11:21
 */
@MappedJdbcTypes(value = JdbcType.VARCHAR)
public class TestTypeHandler extends BaseTypeHandler<String> {
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, String parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, parameter + "test");
    }

    @Override
    public String getNullableResult(ResultSet rs, String columnName)
            throws SQLException {
        System.out.println("1" + columnName);
        System.out.println("1" + rs.getString(columnName));
        if ("mobile".equals(columnName)) {
            String string = rs.getString(columnName);
            return string.substring(0, 3) + "****" + string.substring(7);
        }
        return rs.getString(columnName);
    }

    @Override
    public String getNullableResult(ResultSet rs, int columnIndex)
            throws SQLException {
        System.out.println("2" + columnIndex);
        System.out.println("2" + rs);
        return rs.getString(columnIndex);
    }

    @Override
    public String getNullableResult(CallableStatement cs, int columnIndex)
            throws SQLException {
        System.out.println("3" + columnIndex);
        System.out.println("3" + cs);
        return cs.getString(columnIndex);
    }
}
