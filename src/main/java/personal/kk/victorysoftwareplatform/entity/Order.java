package personal.kk.victorysoftwareplatform.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author kk
 * @description 201数据库订单信息
 * @date 2024-5-17 15:04:49
 */
@Data
@TableName("\"STfk240517\"")
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableField(value = "销售订单号")
    private String OrderId;

    @TableField(value = "行号")
    private String LineNumber;

    @TableField(value = "客户编码")
    private String CustomerCode;

    @TableField(value = "预发货日期")
    private String PreShipmentdate;

    @TableField(value = "图号")
    private String DrawingNumber;

    @TableField(value = "物料编码")
    private String MatertialCode;

    @TableField(value = "存货代码")
    private String InventoryCode;

    @TableField(value = "规格")
    private String Specification;

    @TableField(value = "受控号")
    private String ControllNumber;

    @TableField(value = "单位")
    private String Unit;

    @TableField(value = "数量")
    private String Quantity;

    @TableField(value = "报价流水号")
    private String QuotationSerialNumber;

    @TableField(value = "升级流水号")
    private String UpgradeSerialNumber;

    @TableField(value = "制单日期")
    private LocalDateTime MadeDate;

    @TableField(value = "审核日期")
    private LocalDateTime AuditDate;

    @TableField(value = "备注")
    private String Remark;

    @TableField(value = "技术")
    private String TechPerson;

    @TableField(value = "跟单员")
    private String Merchandiser;

    @TableField(value = "存货大类名称")
    private String InventoryTypeName;















}
