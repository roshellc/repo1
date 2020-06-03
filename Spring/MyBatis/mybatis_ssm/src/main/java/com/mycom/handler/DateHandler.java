package com.mycom.handler;


import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DateHandler extends BaseTypeHandler {


    public void setNonNullParameter(PreparedStatement ps, int i, Object parameter, JdbcType jdbcType) throws SQLException {

    }

    public Object getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return null;
    }

    public Object getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return null;
    }

    public Object getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return null;
    }
}
