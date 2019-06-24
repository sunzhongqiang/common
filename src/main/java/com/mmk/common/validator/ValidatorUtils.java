package com.mmk.common.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorUtils {

  /**
   * 校验手机号.
   *
   * @param phone 电话号码
   **/
  public static boolean isPhone(String phone) {
    String regex = "^((13[0-9])|(14[5,7,9])|(15([0-3]|[5-9]))|"
        + "(166)|(17[0,1,3,5,6,7,8])|(18[0-9])|(19[8|9]))\\d{8}$";
    if (phone.length() != 11) {
      return false;
    } else {
      Pattern p = Pattern.compile(regex);
      Matcher m = p.matcher(phone);
      boolean isMatch = m.matches();
      if (!isMatch) {
        return false;
      }
      return true;
    }
  }

  /**
   * 校验手机号.
   */
  public static boolean isCorrectPhone(String phone) {
    String regex =
        "^((13[0-9])|(14[5,7,9])|(15([0-3]|[5-9]))|(166)|(17[0,1,3,5,6,7,8])|(18[0-9])|(19[8|9]))\\d{8}$";
    if (phone.length() != 11) {
      return false;
    } else {
      Pattern p = Pattern.compile(regex);
      Matcher m = p.matcher(phone);
      boolean isMatch = m.matches();
      if (!isMatch) {
        return false;
      }
      return true;
    }
  }

  /**
   * 校验身份证号.
   */
  public static boolean isCorrectIdcard(String idNum) {
    String regex =
        "^[1-9]\\d{7}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}$|^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}([0-9]|X)$";

    Pattern p = Pattern.compile(regex);
    Matcher m = p.matcher(idNum);
    return m.matches();

  }

  /**
   * 校验密码.
   *
   * @param pwd 密码
   */
  public static boolean checkPassword(String pwd) {

    // 6-20位 不能是纯数字 不能是纯字母 可以数字+字母 数字+字符 字母+数字
    String regStr = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z_~!@#$%^&*{}:'<>?,./|]{6,20}$";

    return pwd.matches(regStr);
  }

  /**
   * 校验用户昵称.
   *
   * @param nickname 用户昵称
   */
  public static boolean checkNickname(String nickname) {
    // 请输入2-20个字符，内容包括中英文、数字和“_”符号。
    String regStr = "^[0-9A-Za-z_\\u4e00-\\u9fa5]{2,20}$";// 正则

    return nickname.matches(regStr);
  }

}
