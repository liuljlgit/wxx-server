package com.cloud.wxxserver.wxxserver.entity;

import java.util.Date;
import java.util.List;
import java.math.BigDecimal;
import com.cloud.ftl.ftlbasic.constant.PatternConst;
import com.cloud.ftl.ftlbasic.webEntity.BaseQuery;
import com.cloud.ftl.ftlbasic.enums.Opt;
import lombok.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.cloud.ftl.ftlbasic.annotation.PrimaryKey;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel("OcOrderCustGroupH")
public class OcOrderCustGroupH extends BaseQuery {

	@ApiModelProperty("è®¢å•æ ‡è¯†")
    @PrimaryKey
    private Long orderId;

	@ApiModelProperty("è®¢å•è¡Œæ ‡è¯†")
    private Long orderLineId;

	@ApiModelProperty("è¯ä»¶ç±»åž‹ï¼šè§å‚æ•°è¡¨")
    private String psptTypeCode;

	@ApiModelProperty("è¯ä»¶ç¼–ç ")
    private String psptId;

	@ApiModelProperty("è¯ä»¶æœ‰æ•ˆæœŸ")
    private String psptEndDate;

	@ApiModelProperty("è¯ä»¶åœ°å€")
    private String psptAddr;

	@ApiModelProperty("å‘è¯æœºå…³")
    private String sendDept;

	@ApiModelProperty("é€šä¿¡åœ°å€")
    private String postAddress;

	@ApiModelProperty("é‚®ç¼–")
    private String postCode;

	@ApiModelProperty("çº³ç¨Žè¯†åˆ«å·ï¼ˆå›½ç¨Žï¼‰")
    private String taxpayerCode;

	@ApiModelProperty("çº³ç¨Žäººç±»åž‹")
    private String taxpayerType;

	@ApiModelProperty("é›†å›¢å®¢æˆ·åç§°")
    private String custName;

	@ApiModelProperty("é›†å›¢å®¢æˆ·è”ç³»ç”µè¯")
    private String custPhone;

	@ApiModelProperty("é›†å›¢ç¼–ç ")
    private String groupId;

	@ApiModelProperty("æ”¶å…¥å½’é›†ç¼–ç ")
    private String groupNumber;

	@ApiModelProperty("æ”¶å…¥å½’é›†åç§°")
    private String groupNumberName;

	@ApiModelProperty("çœä»½é›†å›¢ç¼–ç ")
    private String groupExtNum;

	@ApiModelProperty("æ”¶å…¥å½’é›†ç”¨æˆ·id")
    private Long groupUserId;

	@ApiModelProperty("ä¼ä¸šè¯ä»¶å¤å°ä»¶")
    private String photo1Url;

	@ApiModelProperty("æŽˆæƒä¹¦")
    private String photo2Url;

	@ApiModelProperty("å…¶ä»–åè®®")
    private String photo3Url;

	@ApiModelProperty("å®¢æˆ·æ ‡è¯†")
    private Long custId;

	@ApiModelProperty("å®¢æˆ·ç±»åž‹")
    private String custType;

	@ApiModelProperty("å®¢æˆ·çº§åˆ«")
    private String grpCustLevel;

	@ApiModelProperty("è”ç³»äººå§“å")
    private String contactPerson;

	@ApiModelProperty("è”ç³»äººç”µè¯")
    private String contactPhone;

	@ApiModelProperty("è”ç³»äººEMAIL")
    private String contactEmail;

	@ApiModelProperty("å®¢æˆ·è¡Œä¸š")
    private String callingTypeCode;

	@ApiModelProperty("çœä»½")
    private String provinceCode;

	@ApiModelProperty("å½’å±žåœ°å¸‚")
    private String eparchyCode;

	@ApiModelProperty("å½’å±žä¸šåŠ¡åŒº")
    private String cityCode;

	@ApiModelProperty("æ“ä½œç±»åž‹ 01-åˆ›å»º 02-å˜æ›´ 03-ä½œåºŸ 04-å†»ç»“ 05-è§£å†»")
    private String operType;

	@ApiModelProperty("æ“ä½œæ—¶é—´")
    @JsonFormat(pattern = PatternConst.NORM_DATETIME,timezone = PatternConst.TIMEZONE)
    private Date operTime;

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String ORDER_ID = "order_id";

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String ORDER_LINE_ID = "order_line_id";

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String PSPT_TYPE_CODE = "pspt_type_code";

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String PSPT_ID = "pspt_id";

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String PSPT_END_DATE = "pspt_end_date";

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String PSPT_ADDR = "pspt_addr";

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String SEND_DEPT = "send_dept";

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String POST_ADDRESS = "post_address";

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String POST_CODE = "post_code";

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String TAXPAYER_CODE = "taxpayer_code";

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String TAXPAYER_TYPE = "taxpayer_type";

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String CUST_NAME = "cust_name";

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String CUST_PHONE = "cust_phone";

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String GROUP_ID = "group_id";

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String GROUP_NUMBER = "group_number";

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String GROUP_NUMBER_NAME = "group_number_name";

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String GROUP_EXT_NUM = "group_ext_num";

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String GROUP_USER_ID = "group_user_id";

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String PHOTO1_URL = "photo1_url";

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String PHOTO2_URL = "photo2_url";

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String PHOTO3_URL = "photo3_url";

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String CUST_ID = "cust_id";

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String CUST_TYPE = "cust_type";

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String GRP_CUST_LEVEL = "grp_cust_level";

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String CONTACT_PERSON = "contact_person";

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String CONTACT_PHONE = "contact_phone";

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String CONTACT_EMAIL = "contact_email";

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String CALLING_TYPE_CODE = "calling_type_code";

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String PROVINCE_CODE = "province_code";

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String EPARCHY_CODE = "eparchy_code";

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String CITY_CODE = "city_code";

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String OPER_TYPE = "oper_type";

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String OPER_TIME = "oper_time";


    public void andOrderId(Opt opt,Object... values) {
        if(values.length == 0){
            addConditGroup(ORDER_ID,opt);
        } else if(values.length == 1){
            addConditGroup(ORDER_ID,opt,values[0]);
        } else if(values.length == 2){
            addConditGroup(ORDER_ID,opt,values[0],values[1]);
        } else {
            throw new RuntimeException("‘"+ ORDER_ID + "’ 的SQL入参个数不正确 ");
        }
    }

    public void andOrderLineId(Opt opt,Object... values) {
        if(values.length == 0){
            addConditGroup(ORDER_LINE_ID,opt);
        } else if(values.length == 1){
            addConditGroup(ORDER_LINE_ID,opt,values[0]);
        } else if(values.length == 2){
            addConditGroup(ORDER_LINE_ID,opt,values[0],values[1]);
        } else {
            throw new RuntimeException("‘"+ ORDER_LINE_ID + "’ 的SQL入参个数不正确 ");
        }
    }

    public void andPsptTypeCode(Opt opt,Object... values) {
        if(values.length == 0){
            addConditGroup(PSPT_TYPE_CODE,opt);
        } else if(values.length == 1){
            addConditGroup(PSPT_TYPE_CODE,opt,values[0]);
        } else if(values.length == 2){
            addConditGroup(PSPT_TYPE_CODE,opt,values[0],values[1]);
        } else {
            throw new RuntimeException("‘"+ PSPT_TYPE_CODE + "’ 的SQL入参个数不正确 ");
        }
    }

    public void andPsptId(Opt opt,Object... values) {
        if(values.length == 0){
            addConditGroup(PSPT_ID,opt);
        } else if(values.length == 1){
            addConditGroup(PSPT_ID,opt,values[0]);
        } else if(values.length == 2){
            addConditGroup(PSPT_ID,opt,values[0],values[1]);
        } else {
            throw new RuntimeException("‘"+ PSPT_ID + "’ 的SQL入参个数不正确 ");
        }
    }

    public void andPsptEndDate(Opt opt,Object... values) {
        if(values.length == 0){
            addConditGroup(PSPT_END_DATE,opt);
        } else if(values.length == 1){
            addConditGroup(PSPT_END_DATE,opt,values[0]);
        } else if(values.length == 2){
            addConditGroup(PSPT_END_DATE,opt,values[0],values[1]);
        } else {
            throw new RuntimeException("‘"+ PSPT_END_DATE + "’ 的SQL入参个数不正确 ");
        }
    }

    public void andPsptAddr(Opt opt,Object... values) {
        if(values.length == 0){
            addConditGroup(PSPT_ADDR,opt);
        } else if(values.length == 1){
            addConditGroup(PSPT_ADDR,opt,values[0]);
        } else if(values.length == 2){
            addConditGroup(PSPT_ADDR,opt,values[0],values[1]);
        } else {
            throw new RuntimeException("‘"+ PSPT_ADDR + "’ 的SQL入参个数不正确 ");
        }
    }

    public void andSendDept(Opt opt,Object... values) {
        if(values.length == 0){
            addConditGroup(SEND_DEPT,opt);
        } else if(values.length == 1){
            addConditGroup(SEND_DEPT,opt,values[0]);
        } else if(values.length == 2){
            addConditGroup(SEND_DEPT,opt,values[0],values[1]);
        } else {
            throw new RuntimeException("‘"+ SEND_DEPT + "’ 的SQL入参个数不正确 ");
        }
    }

    public void andPostAddress(Opt opt,Object... values) {
        if(values.length == 0){
            addConditGroup(POST_ADDRESS,opt);
        } else if(values.length == 1){
            addConditGroup(POST_ADDRESS,opt,values[0]);
        } else if(values.length == 2){
            addConditGroup(POST_ADDRESS,opt,values[0],values[1]);
        } else {
            throw new RuntimeException("‘"+ POST_ADDRESS + "’ 的SQL入参个数不正确 ");
        }
    }

    public void andPostCode(Opt opt,Object... values) {
        if(values.length == 0){
            addConditGroup(POST_CODE,opt);
        } else if(values.length == 1){
            addConditGroup(POST_CODE,opt,values[0]);
        } else if(values.length == 2){
            addConditGroup(POST_CODE,opt,values[0],values[1]);
        } else {
            throw new RuntimeException("‘"+ POST_CODE + "’ 的SQL入参个数不正确 ");
        }
    }

    public void andTaxpayerCode(Opt opt,Object... values) {
        if(values.length == 0){
            addConditGroup(TAXPAYER_CODE,opt);
        } else if(values.length == 1){
            addConditGroup(TAXPAYER_CODE,opt,values[0]);
        } else if(values.length == 2){
            addConditGroup(TAXPAYER_CODE,opt,values[0],values[1]);
        } else {
            throw new RuntimeException("‘"+ TAXPAYER_CODE + "’ 的SQL入参个数不正确 ");
        }
    }

    public void andTaxpayerType(Opt opt,Object... values) {
        if(values.length == 0){
            addConditGroup(TAXPAYER_TYPE,opt);
        } else if(values.length == 1){
            addConditGroup(TAXPAYER_TYPE,opt,values[0]);
        } else if(values.length == 2){
            addConditGroup(TAXPAYER_TYPE,opt,values[0],values[1]);
        } else {
            throw new RuntimeException("‘"+ TAXPAYER_TYPE + "’ 的SQL入参个数不正确 ");
        }
    }

    public void andCustName(Opt opt,Object... values) {
        if(values.length == 0){
            addConditGroup(CUST_NAME,opt);
        } else if(values.length == 1){
            addConditGroup(CUST_NAME,opt,values[0]);
        } else if(values.length == 2){
            addConditGroup(CUST_NAME,opt,values[0],values[1]);
        } else {
            throw new RuntimeException("‘"+ CUST_NAME + "’ 的SQL入参个数不正确 ");
        }
    }

    public void andCustPhone(Opt opt,Object... values) {
        if(values.length == 0){
            addConditGroup(CUST_PHONE,opt);
        } else if(values.length == 1){
            addConditGroup(CUST_PHONE,opt,values[0]);
        } else if(values.length == 2){
            addConditGroup(CUST_PHONE,opt,values[0],values[1]);
        } else {
            throw new RuntimeException("‘"+ CUST_PHONE + "’ 的SQL入参个数不正确 ");
        }
    }

    public void andGroupId(Opt opt,Object... values) {
        if(values.length == 0){
            addConditGroup(GROUP_ID,opt);
        } else if(values.length == 1){
            addConditGroup(GROUP_ID,opt,values[0]);
        } else if(values.length == 2){
            addConditGroup(GROUP_ID,opt,values[0],values[1]);
        } else {
            throw new RuntimeException("‘"+ GROUP_ID + "’ 的SQL入参个数不正确 ");
        }
    }

    public void andGroupNumber(Opt opt,Object... values) {
        if(values.length == 0){
            addConditGroup(GROUP_NUMBER,opt);
        } else if(values.length == 1){
            addConditGroup(GROUP_NUMBER,opt,values[0]);
        } else if(values.length == 2){
            addConditGroup(GROUP_NUMBER,opt,values[0],values[1]);
        } else {
            throw new RuntimeException("‘"+ GROUP_NUMBER + "’ 的SQL入参个数不正确 ");
        }
    }

    public void andGroupNumberName(Opt opt,Object... values) {
        if(values.length == 0){
            addConditGroup(GROUP_NUMBER_NAME,opt);
        } else if(values.length == 1){
            addConditGroup(GROUP_NUMBER_NAME,opt,values[0]);
        } else if(values.length == 2){
            addConditGroup(GROUP_NUMBER_NAME,opt,values[0],values[1]);
        } else {
            throw new RuntimeException("‘"+ GROUP_NUMBER_NAME + "’ 的SQL入参个数不正确 ");
        }
    }

    public void andGroupExtNum(Opt opt,Object... values) {
        if(values.length == 0){
            addConditGroup(GROUP_EXT_NUM,opt);
        } else if(values.length == 1){
            addConditGroup(GROUP_EXT_NUM,opt,values[0]);
        } else if(values.length == 2){
            addConditGroup(GROUP_EXT_NUM,opt,values[0],values[1]);
        } else {
            throw new RuntimeException("‘"+ GROUP_EXT_NUM + "’ 的SQL入参个数不正确 ");
        }
    }

    public void andGroupUserId(Opt opt,Object... values) {
        if(values.length == 0){
            addConditGroup(GROUP_USER_ID,opt);
        } else if(values.length == 1){
            addConditGroup(GROUP_USER_ID,opt,values[0]);
        } else if(values.length == 2){
            addConditGroup(GROUP_USER_ID,opt,values[0],values[1]);
        } else {
            throw new RuntimeException("‘"+ GROUP_USER_ID + "’ 的SQL入参个数不正确 ");
        }
    }

    public void andPhoto1Url(Opt opt,Object... values) {
        if(values.length == 0){
            addConditGroup(PHOTO1_URL,opt);
        } else if(values.length == 1){
            addConditGroup(PHOTO1_URL,opt,values[0]);
        } else if(values.length == 2){
            addConditGroup(PHOTO1_URL,opt,values[0],values[1]);
        } else {
            throw new RuntimeException("‘"+ PHOTO1_URL + "’ 的SQL入参个数不正确 ");
        }
    }

    public void andPhoto2Url(Opt opt,Object... values) {
        if(values.length == 0){
            addConditGroup(PHOTO2_URL,opt);
        } else if(values.length == 1){
            addConditGroup(PHOTO2_URL,opt,values[0]);
        } else if(values.length == 2){
            addConditGroup(PHOTO2_URL,opt,values[0],values[1]);
        } else {
            throw new RuntimeException("‘"+ PHOTO2_URL + "’ 的SQL入参个数不正确 ");
        }
    }

    public void andPhoto3Url(Opt opt,Object... values) {
        if(values.length == 0){
            addConditGroup(PHOTO3_URL,opt);
        } else if(values.length == 1){
            addConditGroup(PHOTO3_URL,opt,values[0]);
        } else if(values.length == 2){
            addConditGroup(PHOTO3_URL,opt,values[0],values[1]);
        } else {
            throw new RuntimeException("‘"+ PHOTO3_URL + "’ 的SQL入参个数不正确 ");
        }
    }

    public void andCustId(Opt opt,Object... values) {
        if(values.length == 0){
            addConditGroup(CUST_ID,opt);
        } else if(values.length == 1){
            addConditGroup(CUST_ID,opt,values[0]);
        } else if(values.length == 2){
            addConditGroup(CUST_ID,opt,values[0],values[1]);
        } else {
            throw new RuntimeException("‘"+ CUST_ID + "’ 的SQL入参个数不正确 ");
        }
    }

    public void andCustType(Opt opt,Object... values) {
        if(values.length == 0){
            addConditGroup(CUST_TYPE,opt);
        } else if(values.length == 1){
            addConditGroup(CUST_TYPE,opt,values[0]);
        } else if(values.length == 2){
            addConditGroup(CUST_TYPE,opt,values[0],values[1]);
        } else {
            throw new RuntimeException("‘"+ CUST_TYPE + "’ 的SQL入参个数不正确 ");
        }
    }

    public void andGrpCustLevel(Opt opt,Object... values) {
        if(values.length == 0){
            addConditGroup(GRP_CUST_LEVEL,opt);
        } else if(values.length == 1){
            addConditGroup(GRP_CUST_LEVEL,opt,values[0]);
        } else if(values.length == 2){
            addConditGroup(GRP_CUST_LEVEL,opt,values[0],values[1]);
        } else {
            throw new RuntimeException("‘"+ GRP_CUST_LEVEL + "’ 的SQL入参个数不正确 ");
        }
    }

    public void andContactPerson(Opt opt,Object... values) {
        if(values.length == 0){
            addConditGroup(CONTACT_PERSON,opt);
        } else if(values.length == 1){
            addConditGroup(CONTACT_PERSON,opt,values[0]);
        } else if(values.length == 2){
            addConditGroup(CONTACT_PERSON,opt,values[0],values[1]);
        } else {
            throw new RuntimeException("‘"+ CONTACT_PERSON + "’ 的SQL入参个数不正确 ");
        }
    }

    public void andContactPhone(Opt opt,Object... values) {
        if(values.length == 0){
            addConditGroup(CONTACT_PHONE,opt);
        } else if(values.length == 1){
            addConditGroup(CONTACT_PHONE,opt,values[0]);
        } else if(values.length == 2){
            addConditGroup(CONTACT_PHONE,opt,values[0],values[1]);
        } else {
            throw new RuntimeException("‘"+ CONTACT_PHONE + "’ 的SQL入参个数不正确 ");
        }
    }

    public void andContactEmail(Opt opt,Object... values) {
        if(values.length == 0){
            addConditGroup(CONTACT_EMAIL,opt);
        } else if(values.length == 1){
            addConditGroup(CONTACT_EMAIL,opt,values[0]);
        } else if(values.length == 2){
            addConditGroup(CONTACT_EMAIL,opt,values[0],values[1]);
        } else {
            throw new RuntimeException("‘"+ CONTACT_EMAIL + "’ 的SQL入参个数不正确 ");
        }
    }

    public void andCallingTypeCode(Opt opt,Object... values) {
        if(values.length == 0){
            addConditGroup(CALLING_TYPE_CODE,opt);
        } else if(values.length == 1){
            addConditGroup(CALLING_TYPE_CODE,opt,values[0]);
        } else if(values.length == 2){
            addConditGroup(CALLING_TYPE_CODE,opt,values[0],values[1]);
        } else {
            throw new RuntimeException("‘"+ CALLING_TYPE_CODE + "’ 的SQL入参个数不正确 ");
        }
    }

    public void andProvinceCode(Opt opt,Object... values) {
        if(values.length == 0){
            addConditGroup(PROVINCE_CODE,opt);
        } else if(values.length == 1){
            addConditGroup(PROVINCE_CODE,opt,values[0]);
        } else if(values.length == 2){
            addConditGroup(PROVINCE_CODE,opt,values[0],values[1]);
        } else {
            throw new RuntimeException("‘"+ PROVINCE_CODE + "’ 的SQL入参个数不正确 ");
        }
    }

    public void andEparchyCode(Opt opt,Object... values) {
        if(values.length == 0){
            addConditGroup(EPARCHY_CODE,opt);
        } else if(values.length == 1){
            addConditGroup(EPARCHY_CODE,opt,values[0]);
        } else if(values.length == 2){
            addConditGroup(EPARCHY_CODE,opt,values[0],values[1]);
        } else {
            throw new RuntimeException("‘"+ EPARCHY_CODE + "’ 的SQL入参个数不正确 ");
        }
    }

    public void andCityCode(Opt opt,Object... values) {
        if(values.length == 0){
            addConditGroup(CITY_CODE,opt);
        } else if(values.length == 1){
            addConditGroup(CITY_CODE,opt,values[0]);
        } else if(values.length == 2){
            addConditGroup(CITY_CODE,opt,values[0],values[1]);
        } else {
            throw new RuntimeException("‘"+ CITY_CODE + "’ 的SQL入参个数不正确 ");
        }
    }

    public void andOperType(Opt opt,Object... values) {
        if(values.length == 0){
            addConditGroup(OPER_TYPE,opt);
        } else if(values.length == 1){
            addConditGroup(OPER_TYPE,opt,values[0]);
        } else if(values.length == 2){
            addConditGroup(OPER_TYPE,opt,values[0],values[1]);
        } else {
            throw new RuntimeException("‘"+ OPER_TYPE + "’ 的SQL入参个数不正确 ");
        }
    }

    public void andOperTime(Opt opt,Object... values) {
        if(values.length == 0){
            addConditGroup(OPER_TIME,opt);
        } else if(values.length == 1){
            addConditGroup(OPER_TIME,opt,values[0]);
        } else if(values.length == 2){
            addConditGroup(OPER_TIME,opt,values[0],values[1]);
        } else {
            throw new RuntimeException("‘"+ OPER_TIME + "’ 的SQL入参个数不正确 ");
        }
    }

}