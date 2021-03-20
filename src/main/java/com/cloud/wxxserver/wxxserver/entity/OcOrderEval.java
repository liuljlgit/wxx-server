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
@ApiModel("OcOrderEval")
public class OcOrderEval extends BaseQuery {

	@ApiModelProperty("è¯„è®ºç¼–å·ï¼Œç¼–ç è§„åˆ™YYYYMMDD+8åºåˆ—ç¼–å·")
    @PrimaryKey
    private Long commentId;

	@ApiModelProperty("å®¢æˆ·è®¢å•ç¼–å·")
    private Long orderId;

	@ApiModelProperty("ä¸šåŠ¡è®¢å•ç¼–å·")
    private Long orderLineId;

	@ApiModelProperty("è¯„åˆ†ç±»åž‹:01,æœåŠ¡è¯„ä»·ï¼›02ç‰©æµè¯„ä»·ï¼Œ03ï¼›å•†å“è¯„ä»·")
    private String evalType;

	@ApiModelProperty("")
    private Integer evalScore;

	@ApiModelProperty("æ ‡ç­¾")
    private String evalTags;

	@ApiModelProperty("è¯„è®º")
    private String evalComment;

	@ApiModelProperty("è¯„è®ºæ—¶é—´")
    @JsonFormat(pattern = PatternConst.NORM_DATETIME,timezone = PatternConst.TIMEZONE)
    private Date evalTime;

	@ApiModelProperty("è¯„è®ºç”¨æˆ·ï¼Œä½¿ç”¨å¾®ä¿¡ç”¨æˆ·æ‰‹æœºå·ç ")
    private String evalUserid;

	@ApiModelProperty("è¯„è®ºç”¨æˆ·ï¼Œä½¿ç”¨å¾®ä¿¡ç”¨æˆ·æ‰‹æœºå·ç ")
    private String evalUsername;

	@ApiModelProperty("")
    private String provinceCode;

	@ApiModelProperty("åœ°å¸‚ç¼–ç ")
    private String eparchyCode;

	@ApiModelProperty("")
    private String cityCode;

	@ApiModelProperty("")
    private String evalChannel;

	@ApiModelProperty("")
    private Long evalComm;

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String COMMENT_ID = "comment_id";

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String ORDER_ID = "order_id";

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String ORDER_LINE_ID = "order_line_id";

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String EVAL_TYPE = "eval_type";

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String EVAL_SCORE = "eval_score";

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String EVAL_TAGS = "eval_tags";

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String EVAL_COMMENT = "eval_comment";

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String EVAL_TIME = "eval_time";

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String EVAL_USERID = "eval_userid";

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String EVAL_USERNAME = "eval_username";

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
    public static final transient String EVAL_CHANNEL = "eval_channel";

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public static final transient String EVAL_COMM = "eval_comm";


    public void andCommentId(Opt opt,Object... values) {
        if(values.length == 0){
            addConditGroup(COMMENT_ID,opt);
        } else if(values.length == 1){
            addConditGroup(COMMENT_ID,opt,values[0]);
        } else if(values.length == 2){
            addConditGroup(COMMENT_ID,opt,values[0],values[1]);
        } else {
            throw new RuntimeException("‘"+ COMMENT_ID + "’ 的SQL入参个数不正确 ");
        }
    }

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

    public void andEvalType(Opt opt,Object... values) {
        if(values.length == 0){
            addConditGroup(EVAL_TYPE,opt);
        } else if(values.length == 1){
            addConditGroup(EVAL_TYPE,opt,values[0]);
        } else if(values.length == 2){
            addConditGroup(EVAL_TYPE,opt,values[0],values[1]);
        } else {
            throw new RuntimeException("‘"+ EVAL_TYPE + "’ 的SQL入参个数不正确 ");
        }
    }

    public void andEvalScore(Opt opt,Object... values) {
        if(values.length == 0){
            addConditGroup(EVAL_SCORE,opt);
        } else if(values.length == 1){
            addConditGroup(EVAL_SCORE,opt,values[0]);
        } else if(values.length == 2){
            addConditGroup(EVAL_SCORE,opt,values[0],values[1]);
        } else {
            throw new RuntimeException("‘"+ EVAL_SCORE + "’ 的SQL入参个数不正确 ");
        }
    }

    public void andEvalTags(Opt opt,Object... values) {
        if(values.length == 0){
            addConditGroup(EVAL_TAGS,opt);
        } else if(values.length == 1){
            addConditGroup(EVAL_TAGS,opt,values[0]);
        } else if(values.length == 2){
            addConditGroup(EVAL_TAGS,opt,values[0],values[1]);
        } else {
            throw new RuntimeException("‘"+ EVAL_TAGS + "’ 的SQL入参个数不正确 ");
        }
    }

    public void andEvalComment(Opt opt,Object... values) {
        if(values.length == 0){
            addConditGroup(EVAL_COMMENT,opt);
        } else if(values.length == 1){
            addConditGroup(EVAL_COMMENT,opt,values[0]);
        } else if(values.length == 2){
            addConditGroup(EVAL_COMMENT,opt,values[0],values[1]);
        } else {
            throw new RuntimeException("‘"+ EVAL_COMMENT + "’ 的SQL入参个数不正确 ");
        }
    }

    public void andEvalTime(Opt opt,Object... values) {
        if(values.length == 0){
            addConditGroup(EVAL_TIME,opt);
        } else if(values.length == 1){
            addConditGroup(EVAL_TIME,opt,values[0]);
        } else if(values.length == 2){
            addConditGroup(EVAL_TIME,opt,values[0],values[1]);
        } else {
            throw new RuntimeException("‘"+ EVAL_TIME + "’ 的SQL入参个数不正确 ");
        }
    }

    public void andEvalUserid(Opt opt,Object... values) {
        if(values.length == 0){
            addConditGroup(EVAL_USERID,opt);
        } else if(values.length == 1){
            addConditGroup(EVAL_USERID,opt,values[0]);
        } else if(values.length == 2){
            addConditGroup(EVAL_USERID,opt,values[0],values[1]);
        } else {
            throw new RuntimeException("‘"+ EVAL_USERID + "’ 的SQL入参个数不正确 ");
        }
    }

    public void andEvalUsername(Opt opt,Object... values) {
        if(values.length == 0){
            addConditGroup(EVAL_USERNAME,opt);
        } else if(values.length == 1){
            addConditGroup(EVAL_USERNAME,opt,values[0]);
        } else if(values.length == 2){
            addConditGroup(EVAL_USERNAME,opt,values[0],values[1]);
        } else {
            throw new RuntimeException("‘"+ EVAL_USERNAME + "’ 的SQL入参个数不正确 ");
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

    public void andEvalChannel(Opt opt,Object... values) {
        if(values.length == 0){
            addConditGroup(EVAL_CHANNEL,opt);
        } else if(values.length == 1){
            addConditGroup(EVAL_CHANNEL,opt,values[0]);
        } else if(values.length == 2){
            addConditGroup(EVAL_CHANNEL,opt,values[0],values[1]);
        } else {
            throw new RuntimeException("‘"+ EVAL_CHANNEL + "’ 的SQL入参个数不正确 ");
        }
    }

    public void andEvalComm(Opt opt,Object... values) {
        if(values.length == 0){
            addConditGroup(EVAL_COMM,opt);
        } else if(values.length == 1){
            addConditGroup(EVAL_COMM,opt,values[0]);
        } else if(values.length == 2){
            addConditGroup(EVAL_COMM,opt,values[0],values[1]);
        } else {
            throw new RuntimeException("‘"+ EVAL_COMM + "’ 的SQL入参个数不正确 ");
        }
    }

}