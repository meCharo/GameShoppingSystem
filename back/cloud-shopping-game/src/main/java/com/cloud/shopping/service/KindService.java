package com.cloud.shopping.service;

import com.cloud.shopping.entity.GameDTO;
import com.cloud.shopping.entity.Kind;
import com.cloud.shopping.utils.Result;

import java.util.List;

public interface KindService {

    /**
     * 根据种类id获取种类名字，如果不存在返回null
     * @param id
     * @return
     */
    String getNameById(Integer id);

    /**
     * 获取所有的种类
     * @return
     */
    Result<Kind> getAll();

    /**
     * 根据种类获取所有的游戏，包括游戏信息和游戏的种类、标签
     * @param kind
     * @param page
     * @return
     */
    Result<List<GameDTO>> getGamesByKind(int kind, int page);

}
