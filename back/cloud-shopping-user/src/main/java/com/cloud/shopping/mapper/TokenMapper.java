package com.cloud.shopping.mapper;

import com.cloud.shopping.entity.Token;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface TokenMapper {

    int insert(Token record);

    Token selectByToken(String token);

    Token selectByTokenAndStat(@Param(value = "token") String token, @Param(value = "stat") Byte stat);

    List<Token> selectByUid(Integer uid);

    int updateStatByDate(@Param(value = "date") Date date, @Param(value = "stat") Byte stat);

    int updateStatByToken(@Param(value = "stat") Byte stat, @Param(value = "token") String token);
}
