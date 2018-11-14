package tech.bmatch.model;

/**
 * 手机号码信息类
 *
 * @author juniors
 * @date 14/11/2018
 */
public class PhoneInfo {
    /**
     * 手机号码
     */
    private String phone;
    /**
     * 所属省份
     */
    private String province;
    /**
     * 所属城市
     */
    private String city;
    /**
     * 城市代码
     */
    private String cityCode;
    /**
     * 城市邮编
     */
    private String postCode;
    /**
     * 运营商
     */
    private String operator;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
