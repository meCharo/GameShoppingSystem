package com.cloud.shopping.service;

import com.cloud.shopping.entity.GameDTO;
import com.cloud.shopping.utils.Result;

import java.util.List;

public interface GameService {

    /**
     * 根据游戏id获取游戏详细信息
     * @param id
     * @return
     */
    Result<GameDTO> getById(Integer id);

    /**
     * 获取随机图片，用于每日推荐
     * @return
     */
    Result<List<GameDTO>> getRandomGames();

    /**
     * 从缓存中获取最新的5个游戏，如果没有就从数据库中获取
     * @return
     */
    Result<List<GameDTO>> newestGames();

    /**
     * 从缓存中获取最新的5个准备上架的游戏，如果没有就从数据库中获取
     * @return
     */
    Result<List<GameDTO>> preUpGames();

    /**
     * 搜索，从种类、标签、游戏信息中搜索
     * @param info
     * @return
     */
    Result<List<GameDTO>> search(String info);

    /**
     * 获取免费游戏
     * @return
     */
    Result getFreeGames();

    /**
     * 判断游戏是否存在
     * @param id
     * @return
     */
    boolean exists(Integer id);
}
