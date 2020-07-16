package com.david.utils;

import com.david.base.domain.BaseResult;
import com.david.base.enums.BaseResultEnum;

/**
 * @description: 返回结果工具类
 * @author: lingjian
 * @create: 2020/7/13 16:38
 */
public class ResultUtil {

  /**
   * 执行成功并返回数据
   *
   * @param object 返回数据
   * @return BaseResult
   */
  public static BaseResult success(Object object) {
    BaseResult result = new BaseResult();
    result.setCode(BaseResultEnum.SUCCESS.getCode());
    result.setMsg(BaseResultEnum.SUCCESS.getMessage());
    result.setResult(object);
    return result;
  }

  /**
   * 执行成功但不返回数据
   *
   * @return BaseResult
   */
  public static BaseResult success() {
    return success(null);
  }

  /**
   * 执行失败返回的信息
   *
   * @param code 状态码
   * @param msg 错误信息
   * @return BaseResult
   */
  public static BaseResult failed(int code, String msg) {
    BaseResult result = new BaseResult();
    result.setCode(code);
    result.setMsg(msg);
    return result;
  }

  /**
   * 执行失败返回的信息-重载
   *
   * @param resultEnum 返回结果枚举类
   * @return BaseResult
   */
  public static BaseResult failed(BaseResultEnum resultEnum) {
    BaseResult result = new BaseResult();
    result.setCode(resultEnum.getCode());
    result.setMsg(resultEnum.getMessage());
    return result;
  }
}
